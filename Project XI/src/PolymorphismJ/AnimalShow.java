package PolymorphismJ;

public class AnimalShow {

	public static void main(String[] args) {

		// Dog is a dog
		
	// reference type         actual object type
		Dog d =                new Dog();
		
		// Dog is an Animal
		Animal a1 =            new Dog();
		
		// Dog is an Indoor Pet
		IndoorPet d2 =         new Dog();
		
		//Horse
		Horse h1 =             new Horse();
		
		//Horse and Indoor pet has no relationship
		//IndoorPet h3 =         new Horse();
	}

}
