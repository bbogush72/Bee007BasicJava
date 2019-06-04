package day41;

public class TeacherTest {

	public static void main(String[] args) {
		// created two teacher objects
		Teacher teacher1 = new Teacher();
		Teacher teacher2 = new Teacher();
//========================================================		
		//Assigning variables to teacher1
		teacher1.name = "Ozlem";
		teacher1.ssn=(1234567890);
		teacher1.batchNumber=11;
		teacher1.age=(25);
		teacher1.specialty="Scrum Master";
//========================================================
		//Assigning variables to teacher2
		teacher2.name = "Ben";
		teacher2.ssn=(987654321);
		teacher2.batchNumber=11;
		teacher2.age=(30);
		teacher2.specialty="Manual Tester/Automation";
//=========================================================		
		//Printing teacher1 statements with new line "\n"
		System.out.println("Name of the teacher 1: \n"+ teacher1.getName()
		+"\nSocial: "+teacher1.getSsn()+""+"\nBatch No: "+teacher1.getBatchNumber()
		+"\nAge: "+teacher1.getAge()+"\nSpecialty: "+teacher1.getSpecialty());
		
		//adding a separator/divider line
		System.out.println("==========================================");
		
		//Printing teacher2 statements with new line "\n"
		System.out.println("Name of the teacher 2: \n"+ teacher2.getName()
		+"\nSocial: "+teacher2.getSsn()+""+"\nBatch No: "+teacher2.getBatchNumber()
		+"\nAge: "+teacher2.getAge()+"\nSpecialty: "+teacher2.getSpecialty());
		
	}

}
