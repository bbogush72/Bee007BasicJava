package Inheritance;

public class StudentOnCampus extends Student {
	private boolean isOnCampus;
	public StudentOnCampus(String name, int age, char gender, int student_id) {
		super(name, age, gender, student_id);
		
		
	}
	
	public void goToCampus() {
		if(isOnCampus==false) {
			isOnCampus =true;
			System.out.println("driving to campus");
		}
		else {
			System.out.println("no need to drive anywhere, already there");
		}
	}

	
	
	
}
