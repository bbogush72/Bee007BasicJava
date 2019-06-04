package Study;

import javax.swing.JOptionPane;

public class TrigonometricMethods {
	public static String sin(double radians) 
	{
		String num = JOptionPane.showInputDialog("Enter a trigonometric degree");
		int result = Integer.parseInt(num);
		//int result;
		//if(Math.sin(result)==radians)
			switch(result) {
			
			
			case 1 : Math.sin(0);
					 return "0.0";
			
			
			case 2 : Math.sin(270);
					 return "-1.0";
			case 3 : Math.sin(Math.PI/6);
					 return "0.5";
			case 4 : Math.sin(Math.PI/2);
					 return "1.0";
			}
			
	//String calc=	JOptionPane.showMessageDialog(null, "result is "+ Math.sin(result));;
		
		return "the result is " + Math.sin(result);
	}
	
//	public static double cos(double radians)
//	{	Math.sin(0);
//		return 0.0;	
//	}
//	public static double tan(double radians)
//	{
//		return radians;	
//	}
//	public static double asin(double radians)
//	{
//		return radians;	
//	}
//	public static double acos(double radians)
//	{
//		return radians;	
//	}
//	public static double atan(double radians)
//	{
//		return radians;	
//	}
//	public static double toRadians(double degree)
//	{
//		return degree;	
//	}
//	public static double toDegrees(double radians)
//	{
//		return radians;	
//	}
	public static void main(String[] args) { //main method locator
		String num = JOptionPane.showInputDialog("Enter a trigonometric degree");
		int result = (int)Integer.parseInt(num);		
	System.out.println(	Math.sin(result));
	}
}
