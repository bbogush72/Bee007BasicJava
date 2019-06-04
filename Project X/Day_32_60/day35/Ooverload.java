package day35;


public class Ooverload {

  public static void main(String[] args) {
  
    // ANY literal non-fractional numbers will be seen as int 
    // ANY literal fractional numbers will be seen as double     
//    double d ; 
//    
//    d = 10 ; 
//    System.out.println(d);
//    d = 10L ; 
//    System.out.println(d);
//    d = 10F ; 
//    System.out.println(d);
    
    release((byte)10); 
    release((short)10); 
    release((int)10); 
   
    release((long)10F); 
    release((double)10d);
    release((double)10.5);
    release((float)15/2);
    
  }
  
  public static void release(double d) {
    System.out.println("double "+ d);
  }
  
  public static void release(int d) {
    System.out.println("int "+ d);
  }
  public static void release(long d) {
	    System.out.println("long "+ d);
	  }
  
  public static void release(short d) {
	    System.out.println("short "+ d);
	  }
  public static void release(float d) {
	    System.out.println("float "+ d);
	  }
  public static void release(byte d) {
	    System.out.println("byte "+ d);
	  }
  

}