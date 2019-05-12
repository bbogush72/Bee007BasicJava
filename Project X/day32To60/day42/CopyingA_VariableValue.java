package day42;

public class CopyingA_VariableValue {

	public static void main(String[] args) {
		int i=10;
		int j=i;
		j=100;
		System.out.println(i);
		
		
		Dog puppy = new Dog();
		puppy.name= "puppy";
		puppy.breed="pittbull";
		
		Dog yumak	 = puppy;
		yumak.name="yumak";
		
		System.out.println(puppy.name);
		
	}

}
