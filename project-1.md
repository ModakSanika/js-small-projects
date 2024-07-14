# Projects related to DOM

# Solution Code

## project 1: ColorChanger


```javascript

const body = document.querySelector('body');
const buttons = document.querySelectorAll('.button');
const h1 = document.querySelector('h1');
const h2 = document.querySelector('h2');

buttons.forEach(function(button) {
    button.addEventListener('click', function(e) {
        console.log(e); // Mouse event
        console.log(e.target); // Target of the event

        if (e.target.id === 'grey') {
            body.style.backgroundColor = e.target.id;
            h1.style.color = 'white';
            h2.style.color = 'white';
        }
        if (e.target.id === 'white') {
            body.style.backgroundColor = e.target.id;
            h1.style.color = 'black';
            h2.style.color = 'black';
        }
        if (e.target.id === 'yellow') {
            body.style.backgroundColor = e.target.id;
            h1.style.color = 'black';
            h2.style.color = 'black';
        }
        if (e.target.id === 'blue') {
            body.style.backgroundColor = e.target.id;
            h1.style.color = 'white';
            h2.style.color = 'white';
        }
        if (e.target.id === 'purple') {
            body.style.backgroundColor = e.target.id;
            h1.style.color = 'white';
            h2.style.color = 'white';
        }
    });
});


```
