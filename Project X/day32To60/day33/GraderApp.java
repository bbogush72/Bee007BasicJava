package day33;

public class GraderApp {

	public static void main(String[] args) {
		System.out.println(gradeScore(91));
		
		System.out.println(gradeScore(81));
		System.out.println(gradeScore(71));
		System.out.println(gradeScore(61));
	}
	
	public static char gradeScore(int score) {
		
		
		if(score<100&& score>=90 )return 'A';
		if(score<90&& score>=80 )return 'B';
		if(score<80&& score>=70 )return 'C';
		
		return 'F';
		
		//if (score <= 100 && score >= 90) {
		//	return 'A';
			
	//	}else if (score < 90 && score >= 80) {
	//		return 'B';
			
	//	}else if (score < 80 && score >= 70) {
	//		return 'C';
			
	//	}else {
	//		return 'D';
	//	}
		
		//return num>90?'A':num>=80?'B':num>=70?'C':'D';
	}


}