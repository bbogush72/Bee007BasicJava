package chapter3;

public class StringConcat {

	public static void main(String[] args) {
		String a = "";
		a += 2;
		a += 'c';
		a += false;
		if (a == "2cfalse") // memory address is checked which is not equal, moves to the next condition.
			System.out.println("==");
		if (a.equals("2cfalse"))
			System.out.println("equals");

	}
}