package day58;

public class AnimalShow {

	public static void main(String[] args) {

	//	Reference type					// Object type
		Animal_Dog zeytin                = new Animal_Dog();
		//zeytin is the object we created. makeNoise() is the method we call
		//zeytin.makeNoise();
		
		
		//Dog is an animal
		Animal zeytin2                   = new Animal_Dog();
		//zeytin2.makeNoise();
		
		//Dog is an Indoor Pet
		Animal_IndoorPet zeytin3         = new Animal_Dog();
		//zeytin.makeNoise2();
		
		
		// Horse is an animal
		Animal_Horse kara                = new Animal_Horse();
		kara.makeNoise();
		
		Animal kara2                     = new Animal_Horse();
		kara2.makeNoise2();
		
		Animal raja                      = new Animal_Cat();
		raja.makeNoise();
	}

}
