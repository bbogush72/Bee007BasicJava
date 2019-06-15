package day59;

public class Square extends Shape{
	int sizeLength;
	
	public Square(String s, int n) {
		System.out.println("drawing shape " + n+ " times with Shape");
	}


	public  double calculateArea() {
		System.out.println(Math.pow(sizeLength, 3));
		return (Math.pow(sizeLength, 3));
	}

	
	@Override
	public void drawLine(int n) {
		System.out.println("drawing square "+n+ "times");
		
	}

	@Override
	public String toString() {
		return "Square [sizeLength=" + sizeLength + ", color=" + color + "]";
	}




	@Override
	public void Draw() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void draw() {
		// TODO Auto-generated method stub
		
	}


}

