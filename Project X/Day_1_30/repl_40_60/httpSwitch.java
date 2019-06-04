package repl_40_60;

import java.util.*;

public class httpSwitch {
  public static void main(String[] args) {
    //DO NOT CHANGE
    int status;
    Scanner scan = new Scanner(System.in);
    //WRITE YOUR CODE HERE 
    
		System.out.println("Enter status code:");
		status = scan.nextInt();
		String a = null;
		switch(status) {
		
		case 200 : a = "OK";
		break;
		
		case 201 : a = "Created";
		break;
		
		case 202 : a = "Accepted";
		break;
		
		case 301 : a = "Moved Permanently";
		break;
		
		case 303 : a = " See Other";
		break;
		
		case 304 : a = "Not Modified";
		break;
		
		case 307 : a = "Temporary Redirect";
		break;
		
		case 400 : a = "Bad Request";
		break;
		
		case 401 : a = "Unauthorized";
		break;
		
		case 403 : a = "Forbidden";
		break;
		
		case 404 : a = "Not Found";
		break;
		
		case 410 : a = "Gone";
		break;
		
		case 500 : a = "Internal Server Error";
		break;
		
		case 503 : a = "Service Unavailable";
		break;
		
		default : a = "Invalid status code!";
		
		}
		
		System.out.println(a);
	}

}
