package Interface;

public abstract class Shape implements Drawable{
	
	
	public void draw()
	{
		System.out.println("Drawing a general shape ");
	}
	public abstract void calculateArea();
	
	public abstract void calculatePerimeter();
	
	

	public static void main(String[] args) 
	{
		rectangular r1 = new rectangular(5, 10);
		r1.calculateArea();
		//upcasting (Shape) is optional there; implicitly.
		Shape s2 =(Shape) r1;
		
		Shape r2 = new rectangular(8, 7);
		r2.calculateArea();
		
		Drawable r3 = new square(6);
		Drawable r4 = new rectangular(3,4);
		//downcasting r3 to s1
		square s1 = (square)r3;
		r3.drawLine();
		
		s1.calculateArea();
		
		Shape r5 = new square(9);
		
	}
	
}
