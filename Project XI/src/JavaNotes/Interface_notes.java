package JavaNotes;

public interface Interface_notes {
	public static final boolean Study_Hard = true;
	public abstract void canLean();
	public abstract void doHomework();
	
	
/** 
 * 
 * ==^_^==> Primitive types 
 * --> There are 8 of them.
 * --> 
 * -->
 * 
 * 
 * ==^_^==> Reference types
 * --> class
 * --> interface
 * --> enum
 * 
 * * 
 * ==^_^==> interface
 * --> contract between a class and outside world
 * --> methods without implementation and body
 * --> provide set of abstract methods
 * --> a class implements an interface
 * --> class provides the behaviors in the interface
 * 
 *  * 
 * ==^_^==> methods
 * --> form the objects interface with the outside world.
 * --> keys on keyboard an interface with the computer.
 * --> power button is another example of an interface.
 * 
 *  * 
 * ==^_^==> what's inside the interface? constants, empty methods
 * --> public static final boolean Study_Hard = true;
 * --> public abstract void canLean();
 * --> public abstract void doHomework();
 * --> class implementing an interface using 'implements' keyword
 * --> 
 * 
 *  * 
 * ==^_^==> A class can use extends and then implements
 * --> public class Student extends Person implements OnlineTeach, Dreamer {  code}
 * -->
 * -->
 * 
 *  * 
 * ==^_^==> A class can implement more than one interface
 * --> public class Student implements OnlineTeach, Dreamer {  code}
 * -->
 * -->
 * 
 *  * 
 * ==^_^==> A class can extend only one other class
 * --> A class can be implemented in multiple other classes
 * --> interface: multiple inheritance using implements keyword
 * -->
 * 
 *  * 
 * ==^_^==> extend class and then implement 
 * --> public class Student extends Person implements Teachable, Dreamers { code }
 * 
 *  * 
 * ==^_^==> in the interface what can we have; 4 types of items
 * ---> only constant field(public static field), abstract methods, default and static
 * --> public abstract void canLean();
 * --> public default void readTopics() { code here }
 * --> Default and static methods have a body.
 * --> public static int doResearch() { code }
 *  * 
 * ==^_^==> interface is an abstract type and cannot be instantiated
 * --> meaning we cannot create objects in the interface.
 * --> interface is abstract by default and may not be marked as final
 * --> 
 * 
 *  * 
 * ==^_^==> inside interface; if there's final in the method,
 * --> public static final boolean STUDY_HARD = true;
 * --> String SCHOOL = "CyberTek"
 * --> String must be initialized.
 * 
 *  * 
 * ==^_^==> you cannot override a public abstract void canLearn() with a default
 * --> put @OVerride on top 
 * --> don't do this : void canLearn(){ }
 * --> do this: public void canLearn() {}
 * 
 * ==^_^==> Default behavior of compilers
 * --> java.lang package is automatically imported and no need to import it expilicity
 *  -> examples of lang package things. String
 *  * 
 * ==^_^==> Non-final fields of class
 * --> gets default value of 0 for numbers, false for boolean
 * --> empty char for char, null for reference variable
 * 
 * --> Automatic type widening==> long l =10 --> 10L;
 * --> autoboxing | autounboxing
 * 	-> Integer i1=10 --> new Integer(10);
 *  -> int i2 = new Integer(12) --> 12;
 *  * 
 * ==^_^==> if there's not any defined constructor
 * --> compiler provide a default no arg constructor
 * --> if you create a constructor, then there is no default constructor there.
 * 
 * --> first statement of any constructor is a class to super class;
 *  -> super () no arg constructor using super keyword.
 *  
 *  * 
 * ==^_^==> Inheritance
 * --> if a class does not explicitly extends another class
 *  -> it is impilicitly  extends Object class
 * -->
 * -->
 * 
 *  * 
 * ==^_^==> Interface
 * --> All the field in interface are automatically public static final
 * --> cannot be marked with other access modifiers = private / protected
 * 
 * --> all the methods without bdoy are automatically public abstract.
 * --> everything in interface are implicitly public
 *  * 
 * ==^_^==> extends VS implements
 * --> a class extends another class (only one directly)
 * --> an interface extends another interface (one or more interface) to acquire functionality
 * --> a class implements an interface
 * --> interface is always a super type.
 *  * 
 *  
 *  
 * ==^_^==> public interface Edible { 
 * --> voideat();
 *   }
 * --> public interface Burger extends Edible {   
 * --> void drink();  }
 * 
 * --> public class Chai implements Drinkable { }
 * 

 *  * ==^_^==> public default void clickButton 
 *  		   default access modifier must have a body { must be in interface}
 * --> default is a must keyword if you mean it is defualt
 * --> default method cannot be static, final, abstract;
 * --> it can be userd as is or can be overrridden by implementing classes.
 * 
 *  * ==^_^==>
 * -->
 * -->
 * -->
 * * 
 *  * ==^_^==>
 * -->
 * -->
 * -->
 * 
 *  * ==^_^==>
 * -->
 * -->
 * -->
 *  * 
 *  * ==^_^==>
 * -->
 * -->
 * -->
 * 
 *  * ==^_^==>
 * -->
 * -->
 * -->
 *  * 
 *  * ==^_^==>
 * -->
 * -->
 * -->
 * 
 *  * ==^_^==>
 * -->
 * -->
 * -->
 *  * 
 *  * ==^_^==>
 * -->
 * -->
 * -->
 * 
 *  * ==^_^==>
 * -->
 * -->
 * -->
 *  * 
 *  * ==^_^==>
 * -->
 * -->
 * -->
 * 
 *  * ==^_^==>
 * -->
 * -->
 * -->
 *  * 
 *  * ==^_^==>
 * -->
 * -->
 * -->
 * 
 *  * ==^_^==>
 * -->
 * -->
 * -->
 *  
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * */
}
