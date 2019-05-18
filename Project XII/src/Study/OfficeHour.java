package Study;



import java.util.Arrays;

public class OfficeHour {

	public static void main(String[] args) {

		/*
		 * 
		 * 1. What's the result of the following code fragment?
		 * 
		 * public static void main(String[] args) { String str1="Java";
		 * 
		 * String[] str2= {"J","a","v","a"}; String str3 ="";
		 * 
		 * for(int i=0; i<str2.length; i++) { str3 += str2[i]; }
		 * 
		 * boolean b1 = (str1==str3); // false boolean b2 = (str1.equals(str3)); // true
		 * 
		 * System.out.println(b1+",   "+b2); }
		 * 
		 * 
		 * A. true, false B. false, false C. false, true (Correct) D. true, true
		 * 
		 */

		String str1 = "Java";

		String[] str2 = { "J", "a", "v", "a" }; // String a="j" , b="a", c="v", "d ="a";
		String a = "J", b = "a", c = "v", d = "a";
		String str3 = a + b + c + d; // Java
		// java

		boolean b1 = (str1 == str3); // ==
		boolean b2 = (str1.equals(str3)); // .equals()

		System.out.println(b1 + ",   " + b2);

		String A1 = "Cybertek"; // String values are in String pool
		String A2 = new String("Cybertek"); // String values are not in String pool
		A2 = A1;
		System.out.println(A1 == A2);

		String B1 = "Java";
		String a1 = "Ja";
		String a2 = "va";

		String B2 = "Ja" + "va"; // "Java";
		System.out.println(B1 == B2); // true

		String Y1 = new String("java");
		String Y2 = new String("java");
		// Y1=Y2;

		System.out.println(Y1 == Y2);

		/*
		 * 
		 * 2. What's the result? public static void main(String[] args) {
		 * 
		 * int numbers[]; numbers[0] = 10; numbers[1] =20;
		 * 
		 * numbers=new int[4]; numbers[2]=30; numbers[3]=40;
		 * 
		 * System.out.println(Arrays.toString(numbers));
		 * 
		 * }
		 * 
		 * 
		 * A. [ 0, 0, 30, 40 ] B. [10, 20, 30, 40]
		 * 
		 * C. Compilation fails (correct) D. An exception is thrown at runtime.
		 * 
		 */

		int numbers[] = new int[2]; // [0,0]
		numbers[0] = 10;
		numbers[1] = 20; // [10, 20]

		numbers = new int[4];// [0, 0, 0, 0]
		numbers[2] = 30; // [ 0, 0, 30, 0]
		numbers[3] = 40; // [ 0, 0, 30, 40]

		System.out.println(Arrays.toString(numbers));

		/*
		 * 
		 * 3. What's the result?
		 * 
		 * public static void main(String[] args) {
		 * 
		 * int numbers[]; numbers =new int[2];
		 * 
		 * numbers[0] = 10; numbers[1] =20;
		 * 
		 * numbers=new int[4]; numbers[2]=30; numbers[3]=40;
		 * 
		 * System.out.println(Arrays.toString(numbers));
		 * 
		 * } A. Compilation fails B. [ 10, 20, 30, 40 ] C. [ 0, 0, 30, 40 ] (correct) D.
		 * An exception is thrown at run time
		 * 
		 */

		int numbers2[];
		numbers2 = new int[2];

		numbers2[0] = 10;
		numbers2[1] = 20;

		numbers2 = new int[4];
		numbers2[2] = 30;
		numbers2[3] = 40;

		System.out.println(Arrays.toString(numbers2));

		/*
		 * 
		 * 4. What's the result of the following code fragment? public static void
		 * main(String[] args) {
		 * 
		 * String str="Hello World"; str.trim(); int z=str.indexOf(" ");
		 * System.out.println(z); }
		 * 
		 * A. -1 B. 5 ( Correct) C. 0 D. An exception is thrown at run time.
		 * 
		 */

		String str = "Hello World";
		str = str.trim();
		// trim() removes unused spaces : spaces that not seprating letters (white
		// space)
		int z = str.indexOf(" ");
		System.out.println(z); // 5

		String strs1 = " "; // white space
		strs1 = strs1.trim();

		System.out.println(strs1.isEmpty());

		/*
		 * 
		 * 5. Which code fragment, when inserted at line n1, enables the App class to
		 * print Equal?
		 * 
		 * public static void main(String[] args) {
		 * 
		 * String str1 ="Java"; String str2 = new String("java");
		 **** 
		 * Line 1 ***** {
		 * 
		 * System.out.println("Equal");
		 * 
		 * }else { System.out.println("Not Equal"); } }
		 * 
		 * A. if(str1==str2) B. if(str1.equals(str2)) java is case sensitive language
		 * 
		 * C. if(str1.equalsIgnoreCase(str2)) ( Correct) D. if(str1.toLowerCase() ==
		 * str2.toLowerCase())
		 */

		String str11 = "Java"; // String pool
		String str21 = new String("java"); // heap

		if (str11.equalsIgnoreCase(str21)) {
			System.out.println("Equal");

		} else {
			System.out.println("Not Equal");
		}

		/*
		 * 
		 * 6. Given:
		 * 
		 * public static void main(String[] args) { String stuff ="TV"; String res="";
		 * 
		 * if(stuff.equals("TV")) { res="Walter"; }else if(stuff.equals("Movie")) {
		 * res="White"; }else { res="No result"; } }
		 * 
		 * Which code fragment can replace the if block?
		 * 
		 * A. stuff.equals ("TV") ? res = "Walter":stuff.equals("Movie") ? res = "White"
		 * : res = "No Result"; B. res = stuff.equals ("TV") ? "Walter" stuff.equals
		 * ("Movie")? "White" : "No Result"; C. res = stuff.equals ("TV")? "Walter" :
		 * stuff.equals ("Movie")? "White" : "No Result"; ( Correct).
		 * 
		 * Ternary: total number of ? and total number of : has to be equal
		 * 
		 */

		String stuff = "TV";
		String res = "";
//               if(stuff.equals("TV")) {
//                   res="Walter";
//           }else if(stuff.equals("Movie")) {
//                   res="White";
//                }else {
//                    res="No result";
//            }

		res = (stuff.equals("TV")) ? "Walter" : (stuff.equals("Movie")) ? "White" : "No result";

		System.out.println(res); // res: walter

		/*
		 * 
		 * 7. public class Spartans{
		 * 
		 * public static void main(String[] args) {
		 * 
		 * String num1 = args[1]; String num2=args[2]; String num3=args[3];
		 * 
		 * System.out.println("number is "+ num3);
		 * 
		 * } }
		 * 
		 * commend line: Javac classname.java java classname args[0] arr[1] .....
		 * (arguments)
		 * 
		 * 
		 * Which command-line arguments should you pass to the program to obtain the
		 * following output? number is 2
		 * 
		 * A. java Spartans 0 1 2 3 args= [ 0, 1, 2, 3 ] args[3]= 3 B. java Spartans 1 2
		 * 2 3 args= [ 1, 2, 2, 3 ] args[3]= 3 C. java Spartans 1 2 2 3 4 args= [ 1, 2,
		 * 2, 3, 4] args[3]= 3 D. java Spartans 1 3 2 2 args= [1, 3, 2, 2 ] args[3]= 2 (
		 * Correct)
		 * 
		 */

		/*
		 * 
		 * 8. Which of the following code fragment inserted at line 1, enables the
		 * console to prints: red blue small medium ?
		 * 
		 * public static void main(String[] args) {
		 * 
		 * String shirts[][] =new String[2][2]; shirts[0][0]="red"; shirts[0][1]="blue";
		 * shirts[1][0]="small"; shirts[1][1]="medium";
		 ** 
		 * Line 1 ***
		 * 
		 * }
		 * 
		 * A. for(int i=1; i<2; i++) { for(int j=1; j<2; j++) {
		 * System.out.println(shirts[i][j]);
		 * 
		 * } }
		 * 
		 * 
		 * B. for(int i=0; i<2; ) { for(int j=0; j<2; ) {
		 * System.out.println(shirts[i][j]); j++; } i++;
		 * 
		 * }
		 * 
		 * 
		 * C. for(int i=1; i<2; i++) { for(int j=1; j<i; j++) {
		 * System.out.println(shirts[i][j]); } }
		 * 
		 * D. none of the above
		 * 
		 */

		/*
		 * 
		 * 9. public static void main(String[] args) { String str ="Batch 11"; int z =
		 * str.trim().length(); System.out.println( z );
		 * 
		 * } What's the result?
		 * 
		 * A. 9 B. 7 C. compile error D. 8
		 * 
		 */

	}
}
