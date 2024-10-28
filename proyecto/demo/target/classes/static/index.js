document.addEventListener("DOMContentLoaded", function() {
    fetch("/academico")
         .then(response => response.json())
         .then(data => {
              const academicoContainer = document.getElementById('Academico')
              data.forEach(Academico => {
                   const academicoElement = document.createElement('div')
                   academicoElement.classList.add('academico')
                   academicoElement.innerText = Academico.texto
                   academicoContainer.appendChild(academicoElement)
              });
         })
         .catch(error => console.error('Error fetching academico:', error))
})