package Inheritance;

public class Person {

	private String name;
	private int age;
	private char gender;
	private int student_id;
    private static int counter;
    
    public Person(String name, int age, char gender, int student_id) {
    	this.name=name;
    	this.age=age;
    	this.gender=gender;
    	counter++;
    }
    
	public String getName() {

		return name;

	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}
	
	
	public static int getCounter() {
		return counter;
	}
		
	public String toString(String name, int age, char gender) {
		
		return "Person [name= "+ name+" age=" +age+" Gender="+ gender+" ]";
	}

	public int getStudent_id() {
		return student_id;
	}

	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}

}
