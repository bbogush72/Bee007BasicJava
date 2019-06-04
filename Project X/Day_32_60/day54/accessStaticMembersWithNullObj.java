package day54;

public class accessStaticMembersWithNullObj {
public static void main(String[] args) {
	

	cupName1 s1= new cupName1();
	
	s1.printScore();
	s1.printCupName();
	
	//static members don't need object! we can access directly.
	//className.MemberName == static way
	//non-static way like below works but not recommended
	cupName1 s2= null;
	//s2.printScore();
	s2.printCupName();
	System.out.println(s2.cupName);
}
}