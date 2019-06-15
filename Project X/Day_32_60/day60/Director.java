package day60;

import day53.Dog;

//Director--->>Manager--->>Employee
public class Director extends Manager {
	//int budget;
	//double salary;
	int stockOption = 10;
	
	public static void main(String[] args) 
	{
		
		Director e1 = new Director();
		
		System.out.println(e1.salary);
		
		Employee e = new Director();
		System.out.println(e.salary);
		
		//how to access directors stock option
		// we need to refer the Director as a Director
		
		Director d = (Director) e;
		System.out.println(d.salary);
		System.out.println(d.stockOption);
		System.out.println(d.budget);
		
		//downcasting
		Object o = new Dog();
		Dog puppy = (Dog) o;
		puppy.m1();
	}
}
