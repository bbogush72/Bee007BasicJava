package JavaNotes;

public class Inheritance_TeacherNotes {
	/*
	 * 
	 * Constructor: special method. execution depends on the creation of the object
	 * 
	 * 1. every class MUST have constructor, if there isn't any declared then
	 * compiler will give default constructor(no-arg constructor) 2. constructor'
	 * method CAN NOT have Return-Type and specifier ( only have access modifier and
	 * classname (required) ) 3. constructor' method name MUST be same with
	 * className 4. constructor' execution depends on the creation of the object 5.
	 * Only Constructor can call the constructor, other methods or blocks cannot
	 * call the constructor 6. constructor CAN NOT be called by constructor name,
	 * MUST use this or super (to call superclass' constructor) keywords. 7.
	 * constructor CAN NOT call or contain itself 8. constructor CAN NOT call more
	 * than one constructor 9. in constructor' body constructor call needs to be the
	 * first step. 10. class' object MUST be created with the existing constructors
	 * 
	 * 
	 * 11. super class' default constructor (no-arg) is called in sub class'
	 * constructor(any constructor) by default 12. super class' constructor ( except
	 * for default) MUST be called in sub class' constructor (if there is no default
	 * constructor in super class)
	 * 
	 * 
	 * // this(): calls the class' constructor . this. : calls fileds( instance
	 * variables) // super(): calls the super class' constructor . super. : calls
	 * the instance variable from the super class
	 * 
	 */

	/*
	 * OOP: object Oriented programming 4 main concepts are : Encapsulation,
	 * Inheritance, Abstraction, Polymorphisim
	 * 
	 * 1. Encapsulation: hides the instance variables ( usually have private access
	 * modifiers )
	 * 
	 * getter: Read ONLY 1. return method ( Return-Type cannot be void) 2. access
	 * modifier Should not be private 3. return Type must be same data-type with the
	 * instance variable' 4. does not have any argument
	 * 
	 * 
	 * Setter: Modify 1. none return method ( void) 2. access modifier should not be
	 * private 3. must have an argument and argument' data-type MUST be same with
	 * instance variable' 4. argument must be initialized to the instance variable
	 * 
	 * 
	 * 
	 * 2. Inheritance: builds relationship between classes ( super and sub)
	 * 
	 * We can have a multi level inheritance - sub class is a super class for
	 * another class 0. class A extends class B sub super
	 * 
	 * class Person{ - super class }
	 * 
	 * class Student extends Person { - student class is sub class of person class }
	 * 
	 * class StudentOnline extends Student { studentOnline is sub class of Student
	 * class}
	 * 
	 * class StudentOnCampus extends Student { StudentOnCampus is sub class of
	 * Student class }
	 * 
	 *
	 * 
	 * 1. sub class inherits all the inheritable features from the super class
	 * 
	 * features(blocks, or methods, or fields) that are not inheritable in super
	 * class: 1. features with private access modifier 2. features with default
	 * access modifier(if sub class and super class are not in the same package)
	 * 
	 * 3. abstract methods ( if the sub class is not abstract class)
	 * 
	 * 
	 * 2. super class cannot inherit any features from the sub class
	 * 
	 * 3. A class can only extend one class . A class can be extended by multiple
	 * classes
	 * 
	 * 4. super class cannot be final.
	 * 
	 * final is specifier final can be added to variables, methods and classes final
	 * int a=9; ===> value cannot be modified instance variables must be initialized
	 * final can be overloaded public final void method(){ } public final void
	 * method(int a) { } class cannot be extended method cannot be overridden
	 * 
	 * 
	 * override in sub class or child class class test{ public void method(){ } }
	 * 
	 * public class OverrideReview extends test{
	 * 
	 * @Override -> must put this here public void method(){ }
	 * 
	 * only instance methods can be overridden
	 * 
	 * 
	 * if method has final, it cannot be overridden
	 * 
	 * since private is not inherited, private cannot be overridden
	 * 
	 * 
	 * can final be inherited, yes code compiles
	 * 
	 * super keyword, super()
	 * =========================================================================
	 * 
	 * The idea of toString() method is ti provide string representation of an
	 * object. To convert object into readable string. It translates from java
	 * language to human readable language.
	 * 
	 * 
	 * Actually, toString() method is coming from Object class. Object - is a super
	 * class for all java classes. Every class automatically extends Object class.
	 * 
	 * Since toString() method is coming from Object class, we are actually changing
	 * behavior of original method. This process calls method overriding.
	 * 
	 * When inherited method is re-created in a sub class (same name, same
	 * parameters, same return type)
	 * 
	 * this annotation @Override - is optional. But, you can put this annotation
	 * only on top of overridden method.
	 * 
	 * If you would like to change method implementation in the child class, we free
	 * to override method...
	 * 
	 * What is method implementation? whatever is inside curly braces. {}
	 * 
	 * Let's say if we will not override toString() method in our custom class - we
	 * will not be able to translate (make readable for us) object of custom class.
	 * 
	 * 
	 * super it's about being super cool.. it's about calling parent class. If we
	 * need to call parent class constructor, we use super().
	 * 
	 * so we have to match arguments of super constructor.
	 * 
	 * Student student1 = new Student("Firuz", 36, 'M', 1);
	 * System.out.println(student1); //Student [name=Firuz, age=36, gender=M,
	 * student_id=1] toString() only in Student //Person [name=Firuz, age=36,
	 * gender=M] - toString() only in Person //day52_night_session.Student@7852e922
	 * - no toString() }
	 */

}
