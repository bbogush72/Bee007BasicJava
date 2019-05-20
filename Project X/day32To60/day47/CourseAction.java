package day47;

public class CourseAction {

	public static void main(String[] args) {
		
		System.out.println("Hello world!");
		
		System.out.println(Course.school);
		// System.out.println( courseId ); not static, compiler error

		System.out.println(Course.school);
		
		System.out.println(Course.isRamadan);
		
		Course c = new Course(); //loaded object; will call the default contructor
		
		
	}

}
