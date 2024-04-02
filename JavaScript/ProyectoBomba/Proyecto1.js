
var theCount;
var alarm = document.getElementById('alarm');
var panel = document.getElementById('panel');
var turnOff = document.getElementById ('turn-off');
var turnOffHor = document.getElementById('closing');
var detonate = document.getElementById('detonate');
alarm.volume = 0.25; //nivel de sonido

var time = document.getElementById('time');
function showCountDown(){
    time.innerText = time.innerText - 1;
    if(time.innerText == 0){
        clearInterval(theCount);
        time.classList.add('crono');
        abort.classList.add('hide');
        detonate.classList.add('show');
        setTimeout(function(){
            turnOff.classList.add('close');
            turnOffHor.classList.add('close');
            reload.classList.add('show');
            alarm.pause();            
        }, 1500);

    }
}

