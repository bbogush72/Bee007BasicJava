package repl_111_150;

import java.io.BufferedReader;
import java.io.InputStreamReader;
 
public class NonRepeatingElement {
    // Function to print elements with no duplicates
    static void printElementsWithNoDuplicates(int[] array){
        int i,j;
        int count;
        int x = 0;
        boolean[] flag = new boolean[array.length];
        for(i=0; i<array.length; i++){
            if(!flag[i]){
                count  = 1;
                for(j=i+1; j<array.length;j++){
                    if(array[j] == array[i])
                    {
                        count++;
                        flag[j] = true;
                    }
                }
                if(count == 1){
                    System.out.println(array[i]);
                    x++;
                }
            }
        }
        if(x==0){
            System.out.println("All elements are repeated");
        }
    }
}
