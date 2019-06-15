package day60;
import day59.*;
import day53.Dog;
import day58.*;
import day59.Shape;
import day59.triangle;

public class ShapeUtility {

  public static void main(String[] args) {
    
    Shape myShape = getAnyShape();
    myShape.draw();
    Shape myshape=(Square) getAnyShape();
    describeTheShape(  new triangle("Red",12, 10));

    
    Shape s1 = new triangle("Red",12, 10); 
    describeTheShape(  s1  );
    
   // describeTheShape( new _Shape("blue", 5));
    
    
    // something rediculous but focus on concept itself 
    describeTheShape( new Dog() ); 
    
  }
  // we dont want to create object while calling this 
  // utlity method so we just made it static 
  public static void describeTheShape(Shape anyShape) {  
    
    System.out.println("calling describeTheShape(Shape anyShape)");
    anyShape.draw();

  }
  // create another method that accept Triangle object only 
  
  
  public static void describeTheShape(triangle anyTriangle) {  
    System.out.println("calling describeTheShape(Triangle anyTriangle)");
    anyTriangle.draw();
  }
  
  // do not get fooled by the name 
  // it accept any type of Object 
  public static void describeTheShape(Object anyObject) {  
    System.out.println("calling describeTheShape(Object anyObject))");
//    anyObject.draw();
//    anyObject.makeNoise(); 
  }
  
  public Drawable getADrawable() {
	  Drawable d1 = new triangle("red", 120, 100);
	return d1;
	  
  }
  
  
  public static Shape getAnyShape() {
	  Shape s1 = new Square("blue", 15);
	return s1;
	  
  }
  
  
  
  
  
  
  
  

}
