package PolymorphismJ;

public class AnimalShow3 {
	public static void main(String[] args) {
		Animal a1 = new Dog();
		a1.makeNoise();
	
		Animal a2 = new Horse();
		a2.makeNoise();
		
		Animal a3 = new Cat();
		a3.makeNoise();
	}
	
}
