import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  public void settings() {
    size(500, 500);
  }

  public void setup() {
    background(0, 0, 0);
  }


  public void draw() {
	  
	
    stroke(255);
    line(125, 250, 125, 500);
    line(375, 250, 375, 500);  
    line(125, 250, 375, 250);

    stroke(255,0,0);
    rect(210,400,80,490);
    fill(0,0,0);
    
    stroke(21,244,238);
    line(375,250,250,150);
    line(125,250,250,150);

    stroke(255,247,0);
    ellipse(280,455,10,10);
    
  }
  

}