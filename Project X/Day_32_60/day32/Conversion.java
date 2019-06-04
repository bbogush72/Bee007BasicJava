package day32;

public class Conversion {

	public static void main(String[] args) {

	System.out.println(meterToCm());	
		
		System.out.println(FeetToInch());
		
		System.out.println(FtoCelc());
		
	}

	public static double FtoCelc() {
		double f = 70;
		double celc = f*1.8+32;
		
		return celc;
		
	}

	private static double FeetToInch() {
		double feet =6;
		double inch = feet/12;
		
		return inch;
		
		
	}

	private static int meterToCm() {
		
		int meter = 10;
		int cm = meter*100;
		return cm;
		
	}

}
