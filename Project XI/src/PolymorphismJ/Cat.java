package PolymorphismJ;

public class Cat extends Animal
					implements IndoorPet{

	@Override
	public void makeNoise() {
		System.out.println("Mia miao");
	}
	
}
