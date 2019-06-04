package Abstraction;

public class StudentLocal extends Student {

	public StudentLocal(int id, String name) {
		super(id, name);
		
	}

	int seatId;
	
	@Override
	public void attendClass() {
		System.out.println("attend class in classroom");
	}
}
