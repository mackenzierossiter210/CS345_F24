let bg;

function preload() {
  bg = new Background();
  bg.preload();
}

function setup() {
  createCanvas(600, 400);
  //createCanvas(800, 800);
}

function draw() {
  bg.animate();
}