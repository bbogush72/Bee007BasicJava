package day42;

public class StudentCheck {

	public static void main(String[] args) {

		//create a student object
		Student student1 = new Student();
		student1.setName("Ahmet");
		
		System.out.println("Student 1 name: "+student1.getName());
		
		student1.setAge(20);
		System.out.println("Student 1 age: "+ student1.getAge());
		
		student1.setSsn(123456789);
		System.out.println("Student 1 ssn: "+ student1.getSsn());
	}

}
