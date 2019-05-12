package JavaNotes;

import java.util.ArrayList;

public class WrapperNotes {
/*
 Wrapper Classes live from DFW;

1- What is overloading?
Same method name and different parameters list; order matters!

2- Does return type matter?
no, it's not part of message signature(message name) and parameter name

3- What is class?
Blueprint or template 

4- Object can take action, have behavior




===^^===>>>Classes;
-=Objects can be created,
-=Class can have a field and method to represent 
property and behavior of an object,
-= Need bigger memory space,

===^-^===>>>Primitives;
== No object can be created, no field nor any method is there!
== Takes up less space

===^-^===>>>Wrapper of primitive; PW
provided in JDK for creating object to represent primitive types
so we can take some action on it.

== Each primitive type has a corresponding Wrapper class
to create objects.

== PW are used to represent primitive types in Collection class

===^-^===>>>Primitive Wrapper classes
Primitive Types 	Wrapper class 
boolean 			Boolean
char 				Character 
byte 				Byte
short 				Short
int 				Integer
long 				Long 
ﬂoat 				Float
double 				Double

==> All reference types start with UpperCase.

===^^===>>> How to Construct Wrapper class with "new" keyword

Boolean b = new Boolean(true); 
Boolean b = new Boolean("true"); 
Character c = new Character('c'); 
Byte bt1 = new Byte((byte) 123); 
Byte bt2 = new Byte("123"); 
Short s1 = new Short((short) 1200); 
Short s2 = new Short("1200"); 
Integer i1 = new Integer(1202); 
Integer i2 = new Integer(“1202"); 
Long l1 = new Long(200000); 
Long l2 = new Long("200000"); 
Float f1 = new Float(12.2f); 
Float f2 = new Float("12.2"); 
Double d1 = new Double(3.1432345563); 
Double d2 = new Double("3.1432345563");


===^^===>>>How to Construct Wrapper class with "valueOF" method;
Boolean b = Boolean.valueOf(true) 
Boolean b = Boolean.valueOf(“true”)
Character c = Character.valueOf('s'); 
Byte bt1 = Byte.valueOf( (byte) 123 ); 
Byte bt2 = Byte.valueOf(“123"); 
Short s1 = Short.valueOf((short) 1200); 
Short s2 = Short.valueOf("1200"); 
Integer i1 = Integer.valueOf(1202); 
Integer i2 = Integer.valueOf(“1202"); 
Long l1 = Long.valueOf(200000); 
Long l2 = Long.valueOf("200000"); 
Float f1 = Float.valueOf(12.2f); 
Float f2 = Float.valueOf("12.2"); 
Double d1 = Double.valueOf(3.14345563); 
Double d2 = Double.valueOf("3.14345563")


===^^===>>> static or not
you look at whether it requires an object if so non static,
if no, then it is static 

For example; Boolean b = Boolean.valueOf(true);
look at the Boolean after the '=' operator. 
If not object as that, this is static
 

===^^===>>>Auto-boxing;

==>> int --->>Integer
Integer i1 = 12; ==> boxing the value


===^^===>>>Auto-unboxing;

Integer ===> int
int i1 = new Integer("12"); ==> unboxing the value


===^^===>>>//invalid conversion
	
	//	System.out.println(Double.parseDouble("3.14abc"));
	//	System.out.println(Integer.valueOf("3.14"));


===^^===>>> // From String to Wrapper class object,

		// valueOf method will take String and return Wrapper object
		String d = "3.14";
		Double d1 = Double.valueOf(d);
		System.out.println(d1.toString());


===^^===>>>int i = null; cannot work but;
-- Integer i1 = null;
-- Double d1 = null;


===^^===>>> Collection Framework
-- Comes with JDK;
-- provides built in features to work with data
-- provides different type of data structure such as;
--->>> List, Set, Map, Queue



===^^===>>> ArrayList
-- ArrayList can be used after importing either one of the following;
-- import java.util.ArrayList; 
-- import java.util.*;

-- unlike array, ArrayList can be resized.
-- can hold objects, cannot store primitives
-- allows duplicate
-- store only 1 type to be on the safe side

===^^===>>> Creating ArrayList
-- in java 7 and later, see the example;
	ArrayList<Type> list1 = new ArrayList<>();
	
-- use list as a reference type, check the example;
	List<Type> list1 = new ArrayList<>();
	



===^^===>>> Array List Objects;
		//Create an  ArrayList object and assign it to list1
		ArrayList list1 = new ArrayList();
		
		//Create an ArrayList object with no arg constructor
		ArrayList<String> list2 = new ArrayList<String>();
		
---> list1 is reference, a container for the adress of the object

===^^===>>> 

 */
}
