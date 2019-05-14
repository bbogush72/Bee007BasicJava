package day43;

public class Cars {
	private String make;
	private String model;
	private int year;
	private String color;
	private int speed;

	public String getMake() {
		return make;
	}

	public void setMake(String m) {
		m = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String mod) {
		mod = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int y) {
		y = year;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String c) {
		c = color;
	}

	public int getSpeed() {
		return speed;
		//this.speed=speed; if you remove int and add void
	}

	public void setSpeed(int s) {
		s = speed;
	}

	public void increaseSpeed(int increaseBy) {

		// speed = speed + increaseBy;
		for (int i = 1; i <= increaseBy; i++) {

			speed++;
			System.out.print(speed + "->");
		}

		System.out.println();

	}

	public void decreaseSpeed(int decreaseBy) {

		for (int i = 1; i <= decreaseBy; i++) {

			speed--;
			System.out.print(speed + "->");
		}

		System.out.println();
	}
	public void stop() {
	//	speed=0;
		this.speed=0;
	//	this.setSpeed(0);
		//setSpeed(0);
	}
}
