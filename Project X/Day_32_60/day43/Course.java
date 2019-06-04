package day43;

public class Course {
	
	String name;
	int courseID;
	
	//no-arg constructor
	public Course() {
		
		System.out.println("Course constructor");
	}
	
	public Course(String name) {
		this.name=name;
		System.out.println("passing argument");
	}
	public Course(String name, int id) {
		this.name=name;
		this.courseID=id;
		System.out.println("Course name: "+name+"\n"+ "Course ID: "+id);
		
	}
}
