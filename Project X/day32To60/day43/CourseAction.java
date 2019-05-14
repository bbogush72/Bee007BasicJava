package day43;

public class CourseAction {

	public static void main(String[] args) {

		Course java = new Course();
		System.out.println(java.name);
		Course selenium = new Course();
		Course softSkill = new Course();
		
		Course sql  = new Course("sql");
		System.out.println(sql.name);
		
		//constructor overloading
		String s = new String();
		String s1 = new String ("abc");
		Integer i= new Integer(123);
		Integer i1= new Integer("123");
		
		Course nameId = new Course("course", 202);
		System.out.println();
		
		Course prep = new Course("interview", 202);
		System.out.println("prep name: "+prep.name+ 
				"prep CourseId: "+ prep.courseID);
		//System.out.println(prep.courseID);
	}

}
