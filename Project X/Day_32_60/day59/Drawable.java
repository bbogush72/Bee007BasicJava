package day59;

public interface Drawable {
	/*
	 * 
	 * Create an interface Drawable with below members
	 * 
	 * constant DRAWING_TOOL abstract method draw
	 * 
	 * default method drawLine accept one int as line count and print drawing in
	 * line
	 * 
	 * static method printDrawingTool accept no arg and return nothing
	 * 
	 * Abstract class called Shape, implements Drawable it has instance fields color
	 * 
	 * it has abstract method calculateArea it has abstract method toString
	 * 
	 * Create a concrete a shape class called --- Triangle it has height, base it
	 * has constructor to set all the value
	 * 
	 * override all the abstract method that you inherited
	 */
	public static final String DRAWING_TOOL="a Pen";

	
	public abstract void Draw();
	
	public default void drawLine(int n) {
		System.out.println("drawing "+ n + " line");
	}
	
	public static void printDrawingTool() {
		System.out.println("Tool is "+ DRAWING_TOOL);
	}

	void draw();
	
	

}
