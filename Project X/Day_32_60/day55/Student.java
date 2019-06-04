package day55;

//abstract class are not meant to be instantiated 
//abstract class are meant to be a super class 
//to provide a general idea, without providing implemetation details 
// using abstract method 

//OTHER THAN ABOVE 
//YOU CAN HAVE EVERYTHING ELSE A NORMAL CLASS CAN HAVE 

public abstract class Student {

int id; 
String name; 


public abstract void attendClass() ; 

//public void attendClass() {
//  
//  System.out.println("IMPLEMENT IN SUB CLASSES");
//  
//}

}
