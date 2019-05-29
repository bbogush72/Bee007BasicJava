package Inheritance;

public class School extends Person {
	public School(String name, int age, char gender, int student_id) {
		super(name, age, gender, student_id);
		
	}

	public static void main(String[] args) {
	
		Student student1 = new Student ("Snail", 2, 'm', 22);
		System.out.println(student1);
		
		StudentOnCampus std2 = new StudentOnCampus("snail", 1, 'n', 1234);
		StudentOnline std3 = new StudentOnline("mysteron", 2, 'm', 4567);
		
		System.out.println(std2);
		System.out.println(std3);
		
		std2.goToCampus();
		std3.joinZoom();
	}
	
	
}
