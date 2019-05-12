package day43;


public class Employee {

  // 4 access modifier to restrict access to members of the class 
  //public        accessible anywhere
  //protected    stay tuned for later  
  //default     only in same package -- package private 
  //private    only in same class
  
  // instance variable -->> used to define properties | attribute of the objects 
  String name; 
  int age; 
  String title; 
  double salary; 
  
  // instance methods --->> 
  // used to read or manipulate the  properties | attribute of the objects
  
  public void printAllInfo() {
    
    System.out.println("name is <" + name +     
      "> age is <" + age + 
      "> title is <" + title + 
      "> salary is -> " + salary ) ; 
                
  }
  
  
}