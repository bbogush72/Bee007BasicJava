package repl_81_90;

import java.util.Scanner;

public class cat {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number = 0;
        String str = "";
        
        int countOfCats = 0;
		int countOfDogs = 0;
		String word = scan.next();
        
        
        for(int i = 0; i < word.length(); i++) {
            if(word.charAt(i) == 'd' && word.charAt(i+1) == 'o' && word.charAt(i+2) == 'g')
                countOfDogs++;
          
          
            if(word.charAt(i) == 'c' && word.charAt(i+1) == 'a' && word.charAt(i+2) == 't')
                countOfCats++;
          
          if(countOfCats == countOfDogs)
          str = "true";
          else
          str = "false";
          
          number++;
        }
//        System.out.println("number of cats " + countOfCats);
//        System.out.println("number of dogs " + countOfDogs);
        System.out.println(str);

	}

}
