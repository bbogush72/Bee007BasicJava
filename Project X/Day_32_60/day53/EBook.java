package day53;

public class EBook extends Book {
	  public String author = "Howard Stern";
	  public String title = "Howard Stern Comes Again"; // 2

	  public static void main(String[] args) {
	    EBook b1 = new EBook();
	    b1.printInfo(); // ????
//	    Book.title ??? NO - IT's NOT A STATIC FIELD.
	    System.out.println("Price: "+Book.price);
	    EBook.read();
	  }

	  public void printInfo() {
	    System.out.println("Author: " + super.author); // super. calls instance variable/or methods of parent class
	    System.out.println("Title: " + super.title); // in case of static it doesn't work, we have to use class name
	  }
	  
	  public static void read() {
	    System.out.println("Reading an Ebook");
	  }
	}

	class Book {
	  public String author = "J. K. Rowling";
	  public String title = "Harry Potter and the Philosopher's Stone";// 1
	  public static int price = 30;
	  
	  public static void read() { // this method id hidden for Ebook class
	    System.out.println("Reading a book");
	  }
	}

