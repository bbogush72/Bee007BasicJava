package repl_91_110;

import java.util.Scanner;

public class DigiParseInt {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String str = scan.next();
    int sum  = 0;
  for(int i = 0; i<str.length();i++) {
if(Character.isDigit(str.charAt(i))) {
sum += Integer.parseInt(Character.toString(str.charAt(i)));//

}
}
System.out.println(sum);
  }
}
