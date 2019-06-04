package Abstraction;

public class  StudentOnline extends Student {

	int zoomId;
	
	@Override
	public void attendClass() {
		System.out.println("attend class using zoom");
	}
	public StudentOnline(int id, String name, int zoomId) {
		super(id, name);
		this.zoomId=zoomId;
	}
	public static void main(String[] args) {
		
		StudentOnline s1= new StudentOnline(25, "mysteron", 502205);
//		s1.id=100;
//		s1.name= "Snail";
//		s1.zoomId= 2001;
//		s1.attendClass();
		
	//	cannot make object from abstract class
	//	Student s2 = new Student();
	}
}
