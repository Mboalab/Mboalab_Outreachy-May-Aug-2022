
const scriptURL = 'https://script.google.com/macros/s/AKfycbxhLKPJyRXMwjtWFepGBkqvLbXdQMxyG4cIG6UYFcfsOhVM3xEr0OMaS-dtTbep7qTYEQ/exec'
const form = document.forms['HTML Form']

form.addEventListener('submit', e => {
    e.preventDefault()
    fetch(scriptURL, { method: 'POST', body: new FormData(form)})
    .then(() => {
        { alert("SUCCESSFUL!"); }
       
      })
    .catch(error => console.error('Error!', error.message))
    
})
		