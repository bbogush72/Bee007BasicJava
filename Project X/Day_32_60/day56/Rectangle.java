package day56;

abstract class Rectangle extends Shape {

	protected double width, height;
//  Perimeter for rectangle : 2*(a+b) ; Area : a*b
  @Override
  public void calculatePerimeter() {
    System.out.println(2 * (width + height));
  }

  @Override
  public double calculateArea() {
    return width * height;
  }

  @Override
  public String toString() {
    return "this is a rectangle";
  }
}
