package Practice;

public class Swap2Nums {

	public static void main(String[] args) {
		// x, y ===> x = 100 , y = 200, make x 200 and and y 100
		
		
		int x= 100;
		int y=200;
		System.out.println("Initial value of x: "+ x);
		System.out.println("Initial value of y: "+ y);
		
		//add both and assign it to x
		x = x+y; // 300
		
		// subtract y from x to get
		y = x-y; //100 that is the new value of y=100
		
		x = x-y; // 300-100 = 200 that is the value of x
		
		System.out.println("Value of x: " + x);
		System.out.println("Value of y: " + y);

	}

}
