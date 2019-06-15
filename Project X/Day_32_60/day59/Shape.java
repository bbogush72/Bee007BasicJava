package day59;

public abstract class Shape implements Drawable {

	String color;
//	public static final String DRAWING_TOOL="Pen";
//	public abstract void Draw();
//	public void drawLine(int n) {
//		System.out.println("drawing "+ n + " line");
//	}
	public abstract double calculateArea();
	public abstract String toString();

	public static void main(String[] args) {
//		System.out.println(Drawable.DRAWING_TOOL);
//		System.out.println(Shape.DRAWING_TOOL);
//		System.out.println(DRAWING_TOOL);
//		Drawable.printDrawingTool();
		
	}
	public void draw(int i) {
		System.out.println("drawing " + i + " times in Shape");
		
	}
	
}
