const clock=document.querySelector('.showTime');
setInterval(function (){
let date = new Date();
clock.innerHTML=date.toLocaleTimeString();
clock.style.color='white';
clock.style.textAlign = 'center'; 

},1000);