package day58;

//abstract shape class inherit all members of interface 
//other than static method 
public abstract class _Shape implements _Drawable {

	String color;

	public abstract double calculateArea();

	public abstract String toString();

//----- these are inherited members from interface 

//public static final String DRAWING_TOOL = "PEN"; 
//
//public abstract void draw(); 
//
//public void drawLine(int n) {
// 
// System.out.println("DRAWING  "+ n + "LINE ");
// 
//}
//

}
