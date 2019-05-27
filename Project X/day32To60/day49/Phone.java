package day49;

public class Phone extends Device {

	//int serialNum; 
	String brand; 
	int screenSize; 	

	

	public Phone() {
		
		//super(); 
		//Device(); BAD 
		//super(100) ; 
		System.out.println("Phone COnstructor");
	}
	// what's the difference between super and this
	/*
	 * this(args..)  is used to call constructor of same class
	 *  in another constructor in same class 
	 *  
	 *  super(args..) is used to call super class's 
	 *  constructor 
	 *  
	 *  
	 *  Super(arg..)  rules 
	 *  	it has to be the first statemnet 
	 *  	it can be only be used on time per constructor 
	 * 		super() and this() can not be mixed together
	 * */
	
	
	
	public Phone(String brand, int screenSize,int serialNum ) {
//		super();
		super(serialNum); 
		this.brand = brand;
		this.screenSize = screenSize;
		//this.serialNum = serialNum; 
	}
	
	
	public static void main(String[] args) {
		
		
		//Phone p = new Phone() ; 
		Phone p1 = new Phone("iphone", 7 , 123) ;
		
		System.out.println(p1.brand);
		System.out.println(p1.screenSize);
		System.out.println(p1.serialNum);
		
		
		
		
		
	}
	
}

/*
 * 
Implicit behavior of compiler
automatic type widening / up casting 
long i = 10  
Wrapper type auto boxing and un boxing 
Inteter i = 10 ; 
i = new Integer(10) ; 
Constructor 
	if you don't have any constructor 
	compiler will add no arg constructor 
	public YourClassName(){
	}
	first line of any constructor is always a call to 
	super classes no arg constructor if it's not already called 
	using either super(args...). or this(arg...)
	public YourClassName(){
		super() ; 
	}
 * */
