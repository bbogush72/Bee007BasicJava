package Abstraction;

public abstract class Student {
 int id;
 String name;
 
 //constant
 public static final String school = "SnailAcademy";
 
 //non-abstract instance method
 public void study() {
	 System.out.println("Study hard to get a job");
 }
 
 //static method
 public static void showSchool() {
	 System.out.println(school);
 }
 // constructor, resuable code for subclass
 public Student(int id, String name) {
	 this.id=id;
	 this.name=name;
	 
 }
 
// public void attendClass() {
//	 System.out.println("Implement in Sub classes");
// }
 
 //abstract method decleration
 public abstract void attendClass();
 
}
