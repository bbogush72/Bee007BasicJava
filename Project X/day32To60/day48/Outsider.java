package day48;

import day49.Animal;

/// if the field is in same package different class 
///  protected, default are both accessible 

///  if the field is in different package in sub class 
///  protected + public 

public class Outsider extends Animal{

	

	public static void main(String[] args) {

		// ANIMAL IS IN DIFFERENT PACKAGE 
		//Animal a = new Animal() ; 
		Outsider o = new Outsider(); 
		
		//System.out.println( a.wild );
		
		
		System.out.println(  o.isWild() );
		//System.out.println(  a.breed );
		System.out.println(  o.getColor() );
		//System.out.println(  a.legCount );
		

	}


}