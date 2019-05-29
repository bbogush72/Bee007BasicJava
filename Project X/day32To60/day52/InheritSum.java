package day52;
import day51.Practice2;
 class practice extends Practice2 {
	 
	private String name = "CyberTek";
	 void method2()
	 {
		practice obj = new practice();
	 }
}

 
 public class InheritSum extends practice {
	 
	 public static void main(String[] args) 
	 {
		//features cannot be inherited, such as private String
		 //System.out.println(name);
		 
		//System.out.println(Defaultstr);
		 InheritSum obj = new InheritSum();
		//System.out.println(str);
	 }
 }