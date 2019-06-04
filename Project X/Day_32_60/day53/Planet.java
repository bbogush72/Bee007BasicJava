package day53;
public class Planet {

	  // OVERLOADING ONLY CARE ABOUT YOUR METHOD SIGNATURE 
	    // SAME NAME DIFFERENT PARAMETER LIST 
	  
	  public void rotate() {
	    System.out.println("rotating");
	  }
	  
	  public void rotate(int d) {
	    System.out.println("rotating d ");
	  }
	  // WE CAN NOT HAVE TWO METHOD WITH SAME METHOD SIGNATURE IN SAME CLASS
	//  public int rotate(int abc) {
//	    System.out.println("rotating d with return  ");
//	    return 5 ; 
	//  }
	  public static int rotate(int d, int y) {
	    System.out.println("rotating d with return  ");
	    return 5 ; 
	  }
	  
	  public static void main(String[] args) {
		Planet p1 = new Planet();
		p1.rotate();
		p1.rotate(1);
		Planet.rotate(1,2);
		
	}
	  
	}
