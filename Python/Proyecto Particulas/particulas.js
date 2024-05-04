window.human = false;

var canvasE1 = document.querySelector('.fireworks');
var ctx = canvasE1.getContext('2d');
var numberOfParticules = 30;
var pointerX = 0;
var pointerY = 0;
var tap = ('ontouchstart' in window || navigator.msMaxTouchPoints)  ?   'touchstart'    :   'mousedown';
var colors = ['#FF1461', '#18FF92', '#5A87FF', '#FBF38C'];

function setCanvasSize() {
    canvasE1.width = window.innerWidth * 2;
    canvasE1.height = window.innerHeight * 2;
    canvasE1.style.width = window.innerWidth + 'px';
    canvasE1.style.height = window.innerHeight + 'px';
    canvasE1.getContext('2d').scale(2, 2);
}
function updateCoords(e) {
    pointerX = e.clientX || e.touches[0].clientX;
    pointerY = e.clientY || e.touches[0].clientY;
}
function setParticuleDirection(p) {
    var angle = anime.random(0, 360) * Math.PI / 180;
    var value = anime.random(50,180);
    var radius = [-1,1][anime.random(0, 1)] * value;
    return {
        x: p.x + radius * Math.cos(angle),
        y: p.y + radius * Math.sin(angle)
    }
}

