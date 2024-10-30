package com.example.demo.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import lombok.RequiredArgsConstructor;

@Configuration
@EnableWebSecurity
@RequiredArgsConstructor
public class SecurityConfig {
    
    @Bean InMemoryUserDetailsManager users(){
        return new InMemoryUserDetailsManager(
            User.withUsername("user")
                .password("{noop}password")
                .roles("USER")
                .build(),
            User.withUsername("admin")
                .password("{noop}password")
                .roles("ADMIN")
                .build()
        );
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{
        return http
            .csrf(csrf -> csrf.disable())
            .authorizeHttpRequests(auth -> auth.requestMatchers("/public/**").permitAll()
                .requestMatchers("/v1/home").authenticated()
                .requestMatchers("/v1/admin").hasRole("ADMIN").anyRequest().authenticated()
            )
            .formLogin(Customizer.withDefaults())
            .build();
    }
}
