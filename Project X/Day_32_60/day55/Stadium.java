package day55;

public class Stadium {
	 int capacity;
	String food;

	public Stadium (int capacity,String food ) {
		this.capacity=capacity;
		this.food=food;
		
		
	}

	public Stadium() {
	
	}

	@Override
	public String toString() {
		return "Stadium [capacity=" + capacity + ", food=" + food + ", toString()=" + super.toString() + "]";
	}
	
}
