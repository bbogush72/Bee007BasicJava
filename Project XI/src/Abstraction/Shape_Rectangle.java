package Abstraction;

public class Shape_Rectangle extends Shape{
	  
	  int width;
	  int height;
	  public Shape_Rectangle(String color, int width, int height) {
	    super(color);
	    this.width = width;
	    this.height = height;
	  }
	  
	  
	  public static void main(String[] args) {
	    
	    
	    Shape_Rectangle s1 = new Shape_Rectangle("Red", 7, 10); 
	    s1.calculatePerimeter();
	    
	    System.out.println(  s1.calculateArea()   );
	    System.out.println(s1);
	    
	    
	    Shape_Circle s2 = new Shape_Circle("red" , 10) ; 
	    System.out.println(s2);
	    s2.calculatePerimeter();
	    System.out.println(  s2.calculateArea()   );
	    
	  }
	  
	  
	  @Override
	  public void calculatePerimeter() {
	    System.out.println("Perimeter is: "+(2*width+2*height));
	    
	  }
	  @Override
	  public double calculateArea() {
	    return width*height;
	    
	  }
	  @Override
	  public String toString() {
	    return "Rectangle [width=" + width + ", height=" + height + ", color=" + color + ", calculateArea()="
	        + calculateArea() + "]";
	  }
	    
	}
