package day48;

public class Student {

	/*
	 * Create a Person class instance fields name , age , height , gender create
	 * static field counter increase counter whenever new object gets created
	 * 
	 * Create a Student class instance fields name , age , height , gender ,
	 * studentId
	 * 
	 * create static field counter increase counter whenever new object gets created
	 * 
	 * create constructor to set all values toString() method.
	 * 
	 * We will create a class Action to test our custom classes.
	 */

	private String name;
	private int age;
	private float height;
	private char gender;
	private int studentId;
	static int counter;

	public Student(String name, int age, float height, char gender, int studentId) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
		this.gender = gender;
		this.studentId = studentId;
		counter++;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", height=" + height + ", gender=" + gender + ", studentId="
				+ studentId + "]";
	}
}