package Chapter1;

public class OddEven {

	public static void main(String[] args) {
		// find even and odd numbers 0 and 20;
		
		for(int i=0; i<=20; i++) {
			
			if(i%2!=0) {
			System.out.println("odd numbers: "+ i);}
			
			else if(i%2==0) {
			System.out.println("even numbers: "+ i);	
			}
		}
		
		int nums [][] ={ {0,1,2,3,4,5,6,7,8,9,10},
				{11,12,13,14,15,16,17,18,19,20}  };
		
		for(int i=0; i< nums.length; i++) {
		//	System.out.println(if(i%2!=0); );
		}
	}

}
