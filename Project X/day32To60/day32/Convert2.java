package day32;

public class Convert2 {

  public static void main(String[] args) {
    
    System.out.println(meterToCm(15));
    System.out.println(feetToInch(10));
    
    
    System.out.println(fahrToCel(81));
    
    // the method return double -- double can not be saved in int variable
    //int cel = fahrToCel(81) ; 
    // this is what we would do if we want to store the result in a variable
    double cel1 = fahrToCel(81) ; 
    System.out.println(cel1);
    
    // new requirement: 
    /* what if i want to get the result as int 
     * without changing the method return type to int
     * but store the generated result as int
     * */
    int cel = (int) fahrToCel(81) ; 
    System.out.println(cel);
    
    //int cel = (int) 27.22222222222222 ; 
    
    
    
  }
  
  public static int meterToCm(int meter) {
    // 100 cm = 1 m
    return meter*100;
  }
  
  public static double feetToInch(int feet) {
    double inch =  feet*12;
    return inch;
  }
  
  public static double fahrToCel (double fahr) {
    return (fahr-32)*5/9;
  }
  
  
  // create a method called meterToCM
  // it takes one int as parameter and return CM 
  
  // create a method called FeetToInch
  // it takes one int as parameter and return Inch as double 
  
  // create a method called FaToCelcius
  // it takes one double as parameter and return celsius as double 
  
  
     
    
    

}
