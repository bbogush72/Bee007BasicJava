package repel1;

import java.util.Scanner;
public class Next3Print {
  
  public static void main(String[] args) {
     
     int a=0;
     int b=0;
     int c=0;
     
     next3(a); next3(b); next3(c);
  
  }
  
  
 public static void next3(int num){
	 Scanner inp = new Scanner(System.in);
     System.out.print("enter number");
     num = inp.nextInt();
	 
	 
	 int num1 =0;
     int num2 =0;
     int num3 =0;
     for(int i=num; i<num+4; i++){
        num1 = num+1;
        num2= num+2;
        num3 = num+3;
        
            
     }
  System.out.println(num1+" "+num2+" "+num3 );
     
 }
 
}
