void setup()
{
  background(255); 
  size(400,400);
  textSize(37);
}

void draw(){
  strokeWeight(50);       
  stroke(255,0,0);
  circle(180,150,250);

  strokeWeight(1);
  noFill();  
  stroke(0, 51, 204);
  fill(0, 25, 124);
  rect(1,120,380,65);
  fill(255,255,255);
  stroke(255,255,255);
  text("UNDERGROUND",75,165);
} 
  
