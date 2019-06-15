package day58;

public class Animal_Dog extends Animal implements Animal_IndoorPet {

	@Override
	public void makeNoise()
	{
		System.out.println("woof woof");
	}
	
	public void makeNoise2() 
	{
		System.out.println("hav hav hiv hiv");
		
	}
}
