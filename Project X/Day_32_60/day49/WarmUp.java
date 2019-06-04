package day49;

import java.awt.print.Paper;

public class WarmUp {

	public static void main(String[] args) {
		
		
		// Inheritance 
		/*
		 * How many classes 1 class can inherit 
		 * 	ONLY 1 CLASS 
		 * 
		 * 
		 * public Computer extends Electronic{
		 * 
		 * }
		 * 
		 * what is inherited from super class 
		 * 
		 * 	All visible fields and methods from super class 
		 *  constructor is NOT inherited 
		 *  
		 *  Access modifier 
		 *  private 	-----  same class only 
		 *  default 	-----  same package only 
		 *  protected 	-----  same package + sub classes outside the package 
		 *  public      -----  everywhere  
		 * 
		 * 
		 *   Create a class class 
		 *   	Book 
		 *   		pageCount, author, chapterCount, price 
		 *   		
		 *   	2 subclasses of the book 
		 *   	
		 *   	create sub class of Book
		 *   	AudioBook 
		 *   		pageCount, author, chapterCount, price , audioLength
		 *   
		 *   	PaperBook 
		 *   		pageCount, author, chapterCount, price , weight , hardcover
		 *   	
		 *   
		 *   	inside your WarmUp Class with main method 
		 *   		create few objects and see what you can access 
		 *   		try different access modifers and see what error you get 
		 * 
		 * */ 
		AudioBook a1 = new AudioBook();
		a1.author = "WALTER SAVITHCH";
		a1.audioLength = 3; 
		a1.chapterCount = 7 ; 
		a1.pageCount = 300 ; 
		a1.price = 12.99;
		a1.printAuthor();
		a1.play();
		
		
		PaperBook p1 = new PaperBook();
		p1.author = "Suzanne Collins";
		p1.pageCount = 34;
		p1.chapterCount = 8 ; 
		p1.weight = 0.750;
		p1.hardcover = true;
		p1.printAuthor();
		
		
		
		
		
		
		
		
		
		
	}

}