package repl_71_80;

import java.util.Scanner;

public class BuildARoute {
	public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String start = scan.next();
    String end = scan.next();
 
    if(start=="A" & end =="D") {
    	System.out.println("right > down > left: D found");
    }
    
    /*else if(start=="B"&& end =="D") {
    	System.out.println("down > left: D found");
    }else if(start=="B"&& end =="A"){
    	System.out.println("down > left > up: A found");
    }else if(start=="D"&& end =="A") {
    	System.out.println("up: A found");
    }else if(start=="D"&& end =="B") {
    	System.out.println("up > right: B found");
    }else if(start=="D"&& end =="C") {
    	System.out.println("up > right > down: C found");
    }else if(start=="D"&& end =="D") {
    	System.out.println("D found");
    }else if(start=="D"&& end =="A") {
    	System.out.println("up: A found");
    } */
    
    
    
    
    
    
    
    
    
    }

}

/*
 * Write a program that will print out rout instructions. Your program should
 * take 2 parameters: start point and end point. Use left, right, up and down
 * for navigation. Insert ">" between commands. If start point equals to end
 * point - display: "start/end(start or end variable!)found". Note: you may move
 * only clock wise.
 * 
 * Example: Input: A Input: D Output: right > down > left: D found
 * 
 * Example: Input: C Input: C Output: C found
 * 
 */