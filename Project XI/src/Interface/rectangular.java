package Interface;

public class rectangular extends Shape {
	int height;
	int length;
	
	
	public rectangular(int height, int length)
	{
		this.height= height;
		//length = length;
		this.length=length;
		
	}
	@Override
	public void calculateArea() {
		System.out.println("Rectangular Area= "+ (height* length));
	}

	@Override
	public void calculatePerimeter() {
		System.out.println("Dikdortgen Cevre: "+ ((height + length) * 2));
	}
		
	
	
	
}
