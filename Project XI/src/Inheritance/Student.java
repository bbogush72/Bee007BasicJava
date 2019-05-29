package Inheritance;

public class Student extends Person{

	public Student(String name, int age, char gender, int student_id)
	{
		//super is calling the parent class
		//which is why use super(args..) to call class constructor 
		super(name,age,gender, student_id);
		
	}
		
		public String toString() {
			 return "Person [name= "+ getName()+" age=" 
					+getAge()+" Gender="+ getGender()+" ]";
		}
	

}
