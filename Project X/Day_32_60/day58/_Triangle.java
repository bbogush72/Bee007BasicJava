package day58;

import day59.Drawable;

public class _Triangle extends _Shape implements Drawable {

	  // String color
	  int base, height;

	  public _Triangle(String color, int base, int height) {
	    this.color = color;
	    this.base = base;
	    this.height = height;
	  }

	  public static void main(String[] args) {

	    _Triangle t1 = new _Triangle("red", 10, 5);
	    System.out.println(t1.calculateArea());
	    t1.draw();
	    t1.drawLine(3);

	    _Square s1 = new _Square("Blue", 7);
	    System.out.println(s1.calculateArea());

	    s1.draw();
	    s1.drawLine(4);
	    
	    //System.out.println( DRAWING_TOOL  );
	    _Drawable.printDrawingTool();
	    
	    

	  }
	  
	  // below methods are implementation of abstract methods 
	  // inherited from super class 
	  @Override
	  public void draw() {
	    System.out.println("DRAWING TRIANGLE");
	  }
	  // this is how we actually calculate area of Tirangle
	  @Override
	  public double calculateArea() {
	    return base * height / 2;
	  }

	  @Override
	  public String toString() {
	    return "Triangle [base=" + base + ", height=" + height + ", color=" + color + "]";
	  }

	@Override
	public void Draw() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void drawLine(int n) {
		// TODO Auto-generated method stub
		super.drawLine(n);
	}

	}
