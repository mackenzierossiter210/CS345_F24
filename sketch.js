// Mackenzie Rossiter

let yRect = 200;

// ball values
let radius = 25;
let xBall = 150;
let yBall = 180;
let xspeed = 5;
let yspeed = 2;
let points = 0;


function setup() {
  createCanvas(400, 400);
}

function draw() {
  background(220);
  text(points, 50, 50);
  //rightPlayer
  rect(375, yRect, 20, 50);

  //ball
  ellipse(xBall, yBall, radius, radius);
  xBall += xspeed;
  yBall += yspeed;

  // Makes the ball bounce around the walls
  if (xBall > width - radius || xBall < radius) {
    xspeed = -xspeed;
  }
  if (yBall > height - radius || yBall < radius) {
    yspeed = -yspeed;
  }

  if (xBall >= 365) {
    // Collision has happened
    if ((yBall >= yRect - 25) && (yBall <= yRect + 25)) {
      xspeed = -xspeed;
      yspeed = -yspeed;
      points++;
    } 
    // Missed the rectangle
    else {
      points--;
      xBall = 150;
      yBall = 180;
    }
  }
}

function keyPressed() {
  console.log("key code: " + keyCode);
  
  // Move Rect up
  if (keyCode == 38) {
    yRect -= 10;
  }

  // Move Rect down
  if (keyCode == 40) {
    yRect += 10;
  }
}
