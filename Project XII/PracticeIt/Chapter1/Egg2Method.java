package Chapter1;

public class Egg2Method {

	public static void main(String[] args) {
		/* Write a complete Java program in a class named Egg2 that generates the following output. 
		 * Use static methods to show structure and eliminate redundancy in your solution.
		* 
		*   _______
		*  /       \
		* /         \
		* \         /
		*  \_______/
		* -"-'-"-'-"-
		*   _______
		*  /       \
		* /         \
		* \         /
		*  \_______/
		* -"-'-"-'-"-
		* \         /
		*  \_______/
		*   _______
		*  /       \
		* /         \
		* -"-'-"-'-"-
		* \         /
		*  \_______/
		*/

	
		        top();
		        bottom();
		        line();
		        top();
		        bottom();
		        line();
		        bottom();
		        top();
		        line();
		        bottom();
		    }
		

		public static void top(){
		        System.out.println("  _______");
		        System.out.println(" /       \\");
		        System.out.println("/         \\");
		}

		public static void bottom(){
		        System.out.println("\\         /");
		        System.out.println(" \\_______/");
		}

		public static void line(){
		        System.out.println("-\"-'-\"-'-\"-");
		}

	}


