package day39;

public class Person {

	String name;
	int age;
	char gender;
	
	
	//add behavior using non static method
	//remember any non-static method is called instance method
	public void eat() {
		
		System.out.print("eating");
	
		
	}
	public void yourName() {
		System.out.println("My name is "+ name);
	}
	public void me() {
		System.out.print("I'm ");
	}
	
}
