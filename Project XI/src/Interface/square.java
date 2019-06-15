package Interface;

public class square extends Shape {
	int sideLength;
	
	public square (int sideLength)
	{
		
		this.sideLength = sideLength;
		
	}
	
	@Override
	public void calculateArea() {
		
		System.out.println("Kare Area " + (sideLength*sideLength));
	}

	@Override
	public void calculatePerimeter() {
		
		System.out.println("Kare Cevre= "+ (4*sideLength));
	}

	
	
}
