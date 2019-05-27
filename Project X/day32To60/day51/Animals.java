package day51;
/*
 * Create Animal class 
		with single method called 
		makeNoise accept no parameter return nothing 
		it print out general noise
	Create 2 sub classes 
		Horse 
			override makeNoise method 
			print --> Horse --- Nai Nai Nai
		Dog 
			override makeNoise method 
			print --> Dog --- Woof Woof Woof
	Create a class with main called AnimalTalentShow 
	Create 3 objects of Animal , Dog , Horse 
		 let them make noise */
public class Animals {

public void makeNoise() {

		System.out.println("general noise");
		
		
		
		
	}
	
	public static void main(String[] args) {
		// will print "general noise"
		Animals a1= new Animals();
		a1.makeNoise();
		
		Dog dog1= new Dog();
		dog1.makeNoise();
		
		Horse horse1 = new Horse();
		horse1.makeNoise();
	}

}


