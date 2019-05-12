package day21;

import java.util.Scanner;

public class JSON {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
		String json = scan.nextLine();
		/*
		 TASK
In this task, we gonna talk about JSON files. 
JavaScript Object Notation (JSON) -  is a language-independent data format. 
Write a program that will parse JSON file, and print out into the console 
first name and last name as displayed in the example below. In this task, 
JSON file will be provided as a String variable. 
Example:
input:{"id": 1934, "firstName": "James", "lastName": "May", "role": "student-team-member"}
output:
First name: James
Last name: May 

 word = word.toLowerCase().replace(" ", "");
		 */
		int firstName = json.indexOf("firstName");
		  int lastName =json.indexOf("lastName");
		  int l =json.indexOf("role");
		  json.replace('"' , ' ');
		  String str = json.substring(0,firstName);
		  
		  
		  System.out.println("First name: " + json.substring(firstName+13,lastName-4));
		  System.out.println("Last name: " + json.substring(lastName+12,l-4 ));
	
  }
}
