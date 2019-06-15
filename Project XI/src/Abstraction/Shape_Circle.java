package Abstraction;

public class Shape_Circle extends Shape{
    
    //String color;
    double radius ; 

    public Shape_Circle(String color,double radius) {
      super(color); 
      this.radius = radius;
    }

    @Override
    public void calculatePerimeter() {
      
      double c = 2 * Math.PI * radius;

      System.out.println( "calulated Perimeter of circle is " + c);
      
    }

    @Override
    public double calculateArea() {
    
      double area = Math.PI * (radius * radius);

      return area;
      
    }

    @Override
    public String toString() {
      return "Circle [radius=" + radius + ", color=" + color + "]";
    }

    

  

}
