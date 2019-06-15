package Random;

class Person{
	
	// instance variables
	String name;
	int age;
	
	//constructor with 2 arguments
	public Person(String name, int age) {
		
		this.name = name;
		this.age = age;
	}

	public void speak()
	{
		int a =2;
		for (int i = 0; i < a; i++) {
			System.out.println("Hello again!" + "This is "+ name + " and I'm "+ age + " years old" );	
		}
		System.out.println();
	}
	
}




public class App {

	public static void main(String[] args) {
		Person p1 = new Person("John", 27);
		p1.speak();
		

	}

}
