package day32;

public class ConvertMethod {

	public static void main(String[] args) {
		System.out.println(meterToCm(15));
		System.out.println(FeetToInch(6));
		
		
		 int cel = (int) fahrToCelcius(81) ; 
		    System.out.println(cel);
		    
		    double cel1 = fahrToCelcius(81) ; 
		    System.out.println(cel1);
		
	}
	
	public static double FeetToInch(int feet) {
		double inch = feet*12;
		return inch;
	}
	
	public static int meterToCm (int meter) {
		
		
		return meter*100;
	}
	
	public static double fahrToCelcius(double fahr) {
	
		
		return (fahr-32)*5/9;
		
	}

}
