package day42;

public class Employee {

	// public, access anywhere
	// protected
	// default(no access modifier); only in same package, called package private
	// private(same class) only in same class

	// these are instance variables; used to define properties, attribute of objects
	String name;
	int age;
	String title;
	double salary;

	//instance method, used to read or manipulate the properties(attributes of objects)
	public void printAll() {
		System.out.println("Name: " + name 
				+ " \nAge is:" + "\nTitle: " 
				+ "\nSalary: " + salary);
	}

}
