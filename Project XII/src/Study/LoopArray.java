package Study;

public class LoopArray {

	public static void main(String[] args) {

		String [] cars = { "volvo", "bmw", "ford", "mazda" };
		
		for(int i=0; i<cars.length; i++) 
		{
			System.out.print(cars[i]+" ");
		}
		
System.out.println("Divider==================printing values of an array==========================Divider");
		
		for(String each : cars) 
		{
			System.out.print(each+ " ");
		}
System.out.println("Divider==============2D arrays==============================Divider");

		int [] myNumbers[] = { {1,2,3,4}, {5,6,7} };
		for(int i=0;i<myNumbers.length; ++i)
		{
			for(int j=0; j<myNumbers[i].length; ++j)
			{
				System.out.print(myNumbers[i][j]+" ");
			}
		}
		
		
		
	}

}
