package repl_71_80;

import java.util.Scanner;

public class BuildARoute1 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String start = scan.next();
    String end = scan.next();
    
    switch (start) {

    case ("A"):
        if (end.equals("A")) {
            System.out.println(end + " found");
        } else if (end.equals("B")) {
            System.out.println("right: " + end + " found");
        } else if (end.equals("C")) {
            System.out.println("right > down: " + end + " found");
        } else if (end.equals("D")) {
            System.out.println("right > down > left: " + end + " found");
        }
        break;


    case ("B"):
        if (end.equals("B")) {
            System.out.println(end + " found");
        } else if (end.equals("C")) {
            System.out.println("down: "+ end + " found");
        } else if (end.equals("D")) {
            System.out.println("down > left: " + end + " found");
        }else if (end.equals("A")) {
            System.out.println("down > left > up: " + end + " found");
        }
        break;

    case ("C"):
        if (end.equals("C")) {
            System.out.println(end + " found");
        } else if (end.equals("D")) {
            System.out.println("left: " + end + " found");
        }else if (end.equals("A")) {
            System.out.println("left > up: " + end + " found");
        }else if (end.equals("B")) {
            System.out.println("left > up > right: " + end + " found");
        }
        break;

    case ("D"):
        if (end.equals("D")) {
            System.out.println(end + " found");
        }else if (end.equals("A")) {
            System.out.println("up: " + end + " found");
        }else if (end.equals("B")) {
            System.out.println("up > right: " + end + " found");
        }else if (end.equals("C")) {
            System.out.println("up > right > down: " + end + " found");
        }
        break;
    }
    
    
  }
}
