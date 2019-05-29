package Inheritance;

public class StudentOnline extends Student{
private boolean isOnline;
	public StudentOnline(String name, int age, char gender, int student_id) {
		super(name, age, gender, student_id);
		System.out.println("Student online constructor");
	}
	
	//this method will set status of isOnline variable
	// this is an action, like a setter, sets status
	public void joinZoom(){
		if(isOnline==false) {
			isOnline=true;
			System.out.println("will Join class");
		}
		else {
			System.out.println("Already joined");
		}
	}
	//returns value of isOnline instance variable, 
	//it is not an action, it's like a status report
	public boolean goOnline() {
		return isOnline;
	}


	

}
