package day41;

public class StudentTester {

	public static void main(String[] args) {

		Student newStudent1 = new Student();
		newStudent1.setName("Ozlem");
		newStudent1.setMajor("LOTE");
		
		
		System.out.println(newStudent1.getName()+ 
				"||"
		+ newStudent1.getMajor());
		
	}

}
