package Chapter1;

public class methodTernary {
	public static void main(String[] args) {
		System.out.println(max(2, 5));
		//int larger = max(2,5);
		
	}

	// public and static are modifiers
	// int is return value type and max is method name
	// int n1, int n2 are parameters- as one parameter list
	public static int max(int n1, int n2) {
		int max = (n1 > n2) ? n1 : n2;
		// max is return value
		return max;
	}
}
