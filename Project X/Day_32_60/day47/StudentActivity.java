package day47;

import static day47.StudentsUtility.removeStudent;
import static day47.StudentsUtility.resetTheList;
import static day47.StudentsUtility.updateStudent;

public class StudentActivity {

	
	public static void main(String[] args) {
		 //StudentsUtility.displayAllStudent();
	    displayAllStudent();
	    System.out.println("---------------");
	    addOneStudent("Kirk");
	    addOneStudent("Archer");
	    displayAllStudent();
	    
	    System.out.println("---------------");
	    updateStudent(11, "spock");
	    displayAllStudent();
	    
	    System.out.println("---------------");
	    removeStudent(6);
	    displayAllStudent();
	    
	    System.out.println("---------------");
	    resetTheList();
	    displayAllStudent();
	    
	    
	    
	  }

	private static void addOneStudent(String string) {
		
		
	}

	private static void displayAllStudent() {
	
		
	}

}
