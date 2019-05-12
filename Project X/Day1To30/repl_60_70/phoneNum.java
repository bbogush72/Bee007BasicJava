package repl_60_70;

import java.util.*;

public class phoneNum {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String message = scan.nextLine();
    String sender;
    String phoneNumber;
    String messageBody;
    
    String  SMSmessage= new String ("Sender:<Mike Smith>. From Number:[202-123-3456]. Message:{I love programing and problem solving}");
    //String sender, phoneNumber, message;
    
  	sender = SMSmessage.substring(SMSmessage.indexOf("<")+1 ,SMSmessage.indexOf(">"));
	  System.out.println(sender);
	  phoneNumber = SMSmessage.substring(SMSmessage.indexOf("[")+1,SMSmessage.indexOf("]"));
	  System.out.println(phoneNumber);
  	message=SMSmessage.substring(SMSmessage.indexOf("{")+1, SMSmessage.indexOf("}"));
	  System.out.println(message);
	  
	  
	  
	  
  }
}
