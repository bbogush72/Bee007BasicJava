package day27;

public class ForEachLoop1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String words[] = {"for each cycle "+"I'm a lost child from the cyberLand" + 
		", usually hanging out with neither can," +" run run lost boy"};
		
	
	
	for( String eachItem : words) {
		System.out.println(eachItem);
	}
	
	
	double [] doubt = { 12.5, 14.8, 16.8, 23.9 };
	
	for ( double each : doubt) {
		System.out.println("each value in double array: "+each);
	}
	
	
	}

}
