package Chapter1;

public class Person {

	public static void main(String[] args) {
		String name;
		int age;
		char gender;
		String job;
		
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
	}

	public int age;
	public String name;
	public char gender;

}
