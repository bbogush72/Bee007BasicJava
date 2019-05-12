package OCA;



public class whyByteNeededCasting {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    //Byte b = new Byte( (byte) 123); 
  
    // (byte) casting is required unless you assign a byte value like byte b= 12;
    printByteValue( (byte)10 );
    
    byte b = 12 ; 
    printByteValue(b);
    
    //Upcasting happense here; 10 is int, and stored with long type
    long lval =10;
    
    //Autoboxing new Long(10L) as object and assigned to lRef
    Long lRef = 10L;
    
    //Long lRef2 = new Integer(10L); won't work!
    
  }
  
  
  public static void printByteValue(byte b) {
    
    System.out.println(b);
    
  }
  

}