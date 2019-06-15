package PolymorphismJ;

public class Dog extends Animal
						implements IndoorPet {

	@Override
	public void makeNoise() {
		System.out.println("woof woof");
	}
	
	
	
}
