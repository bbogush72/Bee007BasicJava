package day25;

public class StringShortArray {

	public static void main(String[] args) {
		String[] courses = { "Welcome Kit", "Online-Java Programming", "Online-Software Development Lifecycle",
				"Online-Software QA Testing", "Online-Team Activity", "Online-Mentoring", "Online-Selenium",
				"Online-SQL", "Online-API Testing" };

		int[] courseId = { 143, 166, 168, 170, 163, 203, 169, 171, 164 };

		
		
		System.out.println(courses.length);
		
		//The course id for Welcome Kit is <143>
		
		System.out.println();
		
		
		for (int i =0; i<courses.length; i++) { 
			System.out.println("The course id for "+courses[i]+" is "+courseId[i]);
		}
		
		int max=0;
		int index=0;
		
	/*	
		 for(int i=0 ; i<courses.length ;i++) {
			    System.out.println(courses[i]);
			    for(int j=0 ; j<courseId.length; j++) 
			        System.out.println(courseId[j]);
			           System.out.println(); 		}   */
		 
		
		
	}

}
