package day43;

public class carSale {

	public static void main(String[] args) {

		Cars car1 = new Cars();
		Cars car2 = new Cars();
		car1.setMake ("Tesla");
		car1.setModel ("Model X");
		car1.setYear(2016);
				
		car1.setSpeed(30);
		car1.increaseSpeed(50);
				
		car2.setSpeed(40);
		car2.decreaseSpeed(30);
		
		System.out.println();
		System.out.println("current speed of car 2: "+car2.getSpeed());
		System.out.println("current speed of car 1: "+car1.getSpeed());
		
		car1.stop();
		System.out.println("Final speed of car 1: "+car1.getSpeed());
	}

}
