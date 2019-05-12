package day25;

public class ArrayFindContain {

	public static void main(String[] args) {
		String[] courses = { "Welcome Kit", "Online-Java Programming", "Online-Software Development Lifecycle",
				"Online-Software QA Testing", "Online-Team Activity", "Online-Mentoring", "Online-Selenium",
				"Online-SQL", "Online-API Testing" };

		int[] courseId = { 143, 166, 168, 170, 163, 203, 169, 171, 164 };

		//The course id for Welcome Kit is <143>
		
		for (int i =0; i<courses.length; i++) { 
			
			String eachCourse = courses[i];
			//System.out.println("The course id for "+courses[i]+" is "+courseId[i]);
			
			if(eachCourse.equals("Online-Java Programming")) {
				System.out.println("Index is "+ courseId[i]);
				break;
			}
		}
		
		String location="";
        int id=0;
        int idcourse=0;
        for(int i=0; i<courses.length; i++) {
            
            if(courseId[i]==203) {
                location=courses[i];
                
            }
            if(courses[i].contains("Software")) {
                id++;
            }
            
            if(courses[i].equalsIgnoreCase("Online-Java Programming")) {
                idcourse=courseId[i];
            }
            
            
        }
        System.out.println("203 id is "+location );
        System.out.println(id +" courses have Software");
        System.out.println(idcourse+" is Id of Online java Programming ");	 
		
		
	}

}