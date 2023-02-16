
void setup() {
 
  // set the size of your sketch
  size(500, 500);
}

void draw() {
  int ring=0;
  int a = 250;
  int b = 250;
  int x = 250;
  int y =250;
  //Starting with the largest ellipse, use a for loop to draw a bullseye with ellipses.
  for(ring=5; ring>0; ring--) {
  //Use an if statement and remainder to alternate the color of your rings.
  if(ring % 2==0) {
    fill(255, 255, 255);
      }
    else {
      fill(255, 0, 0);
    }
    ellipse(x,y, a,b);
    a-=50;
    b-=50;
  }
  
  
  
  
}
