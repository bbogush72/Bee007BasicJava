package day49;


public class Action {

	public static void main(String[] args) {
		
	
		Employee e = new Employee(); 
		// e can only access title id 
		
		FullTimeEmployee f = new FullTimeEmployee(); 
		//  salary , insurace 
		// title id  coming from Employee
		
		Teacher t = new Teacher(); 
		
		
			// teacherID energy level 
			//  salary , insurace coming from Fulltime
			// title id  coming from Employee
		
		Action a = new Action(); 
		
		
	}

}
