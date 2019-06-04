package day47;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentsUtility {
	// create a private static field called studentList as ArrayList of String
	private static ArrayList<String> studentList = new ArrayList<>();

	// create a static block to print out welcome to StudentsUtility
	static {
		System.out.println("Welcome to StudentsUtility");
	}
	// Create a another static block
	// initialize your arrayList object
	// add 10 students

	static {
//			studentList = new ArrayList<String>();
//			studentList.add("Ozlem"); studentList.add("Benjamin"); studentList.add("Ben");
//			studentList.add("Bulut"); studentList.add("Ali"); studentList.add("Zafer");
//			studentList.add("Emine"); studentList.add("OzlemBulut");
//			studentList.add("Meliha"); studentList.add("OzlemBogush");

		studentList = new ArrayList<String>(Arrays.asList("Spock", "Kirk", "Picard", "Riker", "Data", "LaForge", "Worf",
				"Archer", "Quark", "Tucker"));
	}

	public static void main(String[] args) {
		displayAllStudents();// StudentsUtility.displayAllStudents();
		updateStudent(6, "Troi");

		removeStudent(0);
		//displayAllStudents();
		resetTheList();
	//	displayAllStudents();
	}

	// create a static method called displayAllStudents, accept no parameter, return
	// nothing.
	public static void displayAllStudents() {
		for (int i = 0; i < studentList.size(); i++) {
			System.out.println("No : " + i + 1 + " --> " + studentList.get(i));
			// System.out.println(studentList.get(i));
		}

	}

	// create a static method called addStudent, accept one parameter as String name
	public static void addStudent(String name) {
		studentList.add(name);
	}
	// and add that name to the list, return no value

	// create a static method called updateStudent and;
	// accept 2 parameter index as int, newName as String
	// it will update the name of student at that location
	public static void updateStudent(int index, String newName) {

		if (index >= studentList.size()) {
			System.out.println("OUT OF RANGE");
			return;
		}

		studentList.set(index, newName);

	}

	// create a static method called removeStudent
	// accept 1 parameter index as int
	// it will remove the name of student at that location
	public static void removeStudent(int index) {
		studentList.remove(index);
	}

	// create a static method called resetTheList
	// accept no parameter and delete everything on the list
	public static void resetTheList() {
		studentList.clear();
	}
}
