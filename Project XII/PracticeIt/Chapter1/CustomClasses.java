package Chapter1;

import Chapter1.Person;

public class CustomClasses {

	public static void main(String[] args) {

		Person p1 = new Person();
		p1.name = "Bob";
		p1.age = 25;
		p1.gender = 'M';
		Person p2 = new Person();

		p2.name = "Bob";
		p2.age = 25;
		p2.gender = 'M';

		Person p3 = new Person();

		p3.name = "Nelly";
		p3.age = 45;
		p3.gender = 'M';

		run(p1.name);

		bike(p2.name);
		swim(p3.name);
	}

	public static void Person(String name, int age, char gender, String job) {

		// System.out.println(p1.name);

	}

	public static void run(String name) {

		System.out.println(name + " is running");
	}

	public static void bike(String name) {
		System.out.println(name +" is riding a bike");
	}

	public static void swim(String name) {
		System.out.println(name +" is swimming");
	}
}
