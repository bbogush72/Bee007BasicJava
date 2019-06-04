package day46;
public class StaticMember {
//access level
	
	  static int staticVar ; 
	  int instanceVar ; 
	  
	  public static void main(String[] args) {
	    
	        System.out.println("value of static field num1 : " + staticVar);
//	    int num2 = 0 ; 
//	    System.out.println(num2++ );
	  
	    // num3 is instance variable 
	    // we can not access any instance member in static method 
	    //  System.out.println(num3 );
	    
	    StaticMember s1 = new StaticMember(); 
	    System.out.println("value of instance filed num3 : " + s1.instanceVar);
	    
	    s1.doSomething();
	    
	  }

	  // what can we access inside instance method
	  // any instance field static field 
	  // any instance method static method can be accessible
	  
	  public void doSomething() {
	    
	    System.out.println("inside instance method ");
	    System.out.println("instance variable : " +  instanceVar );
	    System.out.println("static variable : " +  staticVar );
	    
	    
	  }
	  
	  // what can we access inside static method
	  // no object needed when we call this method 
	  // static method ONLY CAN ACCESS STATIC MEMEBERS !!!
	  public static void doStaticThing() {
	    System.out.println("inside static method ");
	  //  System.out.println("instance variable : " +  instanceVar );
	    System.out.println("static variable : " +  staticVar );  
	  }
	
	}
