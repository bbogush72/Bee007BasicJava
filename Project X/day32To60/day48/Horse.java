package day48;

import day48.Animal;

public class Horse extends Animal{
	
	/*
	 * WE DONT INHERIT SOMETHING WE DONT SEE 
	 * ALL COLOR , WILD , LEGCOUNT have default 
	 * access modifier if Animal is in different 
	 * package , they are not visible in this package
	 * 
	 * */
	
	int shoesCount; 
	int horsePower;
	
	
	
	 public static void main(String[] args) {
			 
		 Horse h1 = new Horse(); 
		 //h1.breed = "spartan";
		 h1.setWild(false); 
		 h1.horsePower = 600; 
		 System.out.println(h1.getBreed());
		 System.out.println(h1.horsePower);

//		 Animal a1 = new Animal(); 
//		 a1.wild  = false ; 
//		 
//		 System.out.println( a1.breed);
//		 System.out.println( a1.legCount);
//		 System.out.println( a1.color);
//		 System.out.println( a1.wild);
//		 //System.out.println(a1.horsePower);
//		 
	 }
	
	

}
