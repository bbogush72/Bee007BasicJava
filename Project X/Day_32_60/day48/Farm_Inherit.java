package day48;

import day42.Dog;

public class Farm_Inherit {

	public static void main(String[] args) {

		Animal animal = new Animal();
		
		animal.eat("Cat");
		
		Cat cat1 = new Cat ();
		cat1.eat("raja");
		
		cat1.drink("Smoky");
		
		Dog dog1 = new Dog();
		dog1.eat("Zeytin");
		
	}

}
