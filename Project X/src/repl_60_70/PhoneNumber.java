package repl_60_70;

import java.util.*;

public class PhoneNumber {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String message = scan.nextLine();
    String sender;
    String phoneNumber;
    String messageBody;
    /*input
     Sender:<Mike Smith>. 
     From Number:[202-123-3456]. 
     Message:{I love programming and problem solving}
     */
    
    /*output
     Sender: Mike Smith
	Phone Number: 202-123-3456
	Message body: I love programming and problem solving
     */
     int firstVariable = message.indexOf("<");
    int secondVariable = message.indexOf(">");
    int thirdVariable = message.indexOf("[");
    int fourthdVariable = message.indexOf("]");
    int fifthVariable = message.indexOf("{");
    int sixthdVariable = message.indexOf("}");
    
    sender =    message.substring(firstVariable+1,secondVariable);
    phoneNumber = message.substring(thirdVariable+1,fourthdVariable);
    messageBody =  message.substring(fifthVariable+1,sixthdVariable);
    
    System.out.println("Sender: "+sender);
    System.out.println("Phone Number: "+phoneNumber);
    System.out.println("Message body: "+messageBody);
    
    
  }
}
