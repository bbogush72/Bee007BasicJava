package PolymorphismJ;

public class AnimalShow2 {

	public static void main(String[] args) {
		
	Animal [] animals = new Animal [3];
	Animal a1 = new Dog();
	Animal a2 = new Cat();
	Animal a3 = new Horse();
	animals[0] = a1;
    animals[1] = a2;
	animals[2] = a3;
	
//	animals[0] = "Cat";
//	animals[1] = "Dog";
//	animals[2] = "Horse";
	
	}

}
