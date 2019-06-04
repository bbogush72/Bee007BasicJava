package day47;

public class Course {
	public static boolean isRamadan; //boolean default value is false; will go to else
	public static String school;
	
	public Course() {
		System.out.println("constructor");
	}
	
	//static initializer block
	//used to initialize the static fields value before the type's first usage
	
	static {
		isRamadan=true;
		if(isRamadan) {
			System.out.println("use ramadan schedule");
		}else {
			System.out.println("use normal schedule");
		}
	}
	
	static {
		school = "Cybertek school";
		System.out.println("Welcome to our " + school);
		
	// int courseId;

	
	}
	

}
