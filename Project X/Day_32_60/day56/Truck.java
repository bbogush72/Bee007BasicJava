package day56;

public class Truck extends Vehicle {

	public void printAge() 
	{
		System.out.println("1994");
	}
	
	public void printBrand() 
	{
		System.out.println("ford");
	}
	
	
	public static void main(String[] args) 
	{
		Car c1 = new Car();
		c1.printBrand();
		
		Vehicle c2 = new Car();
		c2.printAge();
		
		Vehicle t1 = new Truck();
		t1.printBrand();
		
		System.out.println(c1.calculateAge());
	}
}
