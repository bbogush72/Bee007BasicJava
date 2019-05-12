package day21;

import java.util.Scanner;

public class Json1 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
		String json = scan.nextLine();
		
		
		
		json.replace('\"', ' ');
		json.trim();
		System.out.println(json);
		  
		
		
		  	int firstName = json.indexOf("firstName");
		  int lastName =json.indexOf("lastName");
		  int l =json.indexOf("role");
		  json.trim();
		  
		  String str = json.substring(0,firstName);
		  
		  str.trim();
		  System.out.println("First name: " + json.substring(firstName+13,lastName-4));
		  System.out.println("Last name: " + json.substring(lastName+12,l-4 ));
	
  }
}
//		  		14		   25				  45
//{"id": 1963, "firstName": "Molly","lastName": "Cossor", "role": "student-team-member"}
//0123456789
//{"id": 1934, "firstName": "James", "lastName": "May", "role": "student-team-member"}
