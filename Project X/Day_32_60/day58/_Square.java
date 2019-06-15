package day58;

import day59.Drawable;

public class _Square extends _Shape implements Drawable{
	  
	  int sizeLength;

	  
	  public _Square(String color,int sizeLength) {
	    
	    this.color = color; 
	    this.sizeLength = sizeLength;
	  }

	  // we did not have to override this 
	  // since it already has the body in interface 
	  // we chose to override to provide our own implementation
	  @Override
	  public void drawLine(int n) {
	    
	    System.out.println("drawing square using 4 line");
	    System.out.println("drawing " + n + "times ");
	  }
	  
	  // below methods are implementation of abstract methods 
	  // inherited from super class 
	  @Override
	  public void draw() {
	    System.out.println("draw SQUARE");
	    
	  }
	  // this is how we calculate are of square
	  @Override
	  public double calculateArea() {
	    //System.out.println(sizeLength * sizeLength);
	    return sizeLength * sizeLength ; 
	  }

	  @Override
	  public String toString() {
	    return "Square [sizeLength=" + sizeLength + ", color=" + color + "]";
	  }

	@Override
	public void Draw() {
		
		
	}

	  
	  
	  

	}
