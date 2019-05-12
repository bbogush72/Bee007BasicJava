package Arrays;

public class Arrays1 {

	public static void main(String[] args) {
		
		
		double  currency [] = new double [5];
		
		currency[0] = 10.1;
		currency[1] = 10.2;
		currency[2] = 10.3;
		currency[3] = 10.4;
		currency[4] = 10.5;
		
		System.out.println("This array contains: "+currency[0]+ " - "+ currency[1]+" - "+ currency[2]+ " - "+currency[3]+" - "+ currency[4]);
		
		System.out.println();
		
		for(int i = 0; i<=4; i++) {
			System.out.println("This array contains: "+ " @ container "+ i+" = "+currency[i]);
		}
		
		
	}

}
