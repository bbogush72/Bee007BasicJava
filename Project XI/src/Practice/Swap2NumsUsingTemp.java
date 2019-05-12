package Practice;

public class Swap2NumsUsingTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 20;
		int b=30;
		int temp = 0;
		
		System.out.println(a+ " "+ b + " "+ temp);
		
		temp =a;
		a=b;
		b=temp;
		
		System.out.println(a+ " "+ b + " "+ temp);
	}

}
