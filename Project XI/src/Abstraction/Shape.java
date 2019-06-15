package Abstraction;

public abstract class Shape {
	  
	  String color;
	  
	  
	  public Shape(String color) {
	    this.color=color;
	  }
	  
	  public abstract  void calculatePerimeter();
	  public abstract  double calculateArea();
	  @Override
	  public abstract String toString(); 
	  
	  
	  
	  // THE OBJECT VERSION OF TOSTRING METHOD IS NOT ABSTRACT METHOD 
	  
	  // --->> YOU CAN OVERRIDE A NON-ABSTRACT METHOD WITH ABSTRACT METHOD IF IT'S DEFINED IN ABSTRACT METHOD
	  

	}
