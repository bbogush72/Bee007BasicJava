package repl_91_110;

public class LookingForwardInText {

	public static void main(String[] args) {
		
		
		String str = "I love food and food is great and I eat food";
		String target = "food";
		
		int firstIndex = str.indexOf(target);
		
		int lastIndex = str.lastIndexOf(target);
		
		int index=0;
		
		while(index<=lastIndex) {
			index=str.indexOf(target,index);
			System.out.println("Found at index: "+index);
			index+=target.length();
		}

	}

}
