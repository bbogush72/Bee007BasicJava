package day49;
public class Animal {

	private char[] breed; 
	protected String color; 
	public boolean wild; 
	int legCount; 
	
	
	// what if 
	// i want to access the members 
	// in sub classes located in different package 
	
	
	
	// PROTECTED ACCESS MODIFER 
	// ENABLE SUB CLASSES OUTSIDE PACKAGE 
	// TO ACCESS SUPER CLASSES PROTECTED(access modifier) FIELDS 
	public boolean isWild() {
		return wild;
	}

	public void setWild(boolean wild) {
		this.wild = wild;
	}

	public char[] getBreed() {
		return breed;
	}

	public void setBreed(char[] breed) {
		this.breed = breed;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}

