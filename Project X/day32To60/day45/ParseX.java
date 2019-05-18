package day45;

public class ParseX {

	public static void main(String[] args) {
	 // Auto unboxing, string variable is converted to primitive type int.
     int x = Integer.parseInt("9");
     
     // Auto unboxing, string variable is converted to primitive type double.
     double d = Double.parseDouble("5");
     // 
     int y= Integer.parseInt("12", 8);
     
     System.out.println("x value: "+ x);
     System.out.println("d value: "+ d);
     System.out.println("y value: "+ y);
	}

}
