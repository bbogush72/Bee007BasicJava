package day20;

public class DoWhileSum1 {

	public static void main(String[] args) {
		
		
		int sum = 0;
		int x =1;
		
		do { sum = sum+x; ;		//sum+=x;
			
			System.out.println("x: "+ x+ " sum: "+ sum);
			
			x++;
			
			if(sum>40)
				break;
			
		}while(x<=10);

	}

}
