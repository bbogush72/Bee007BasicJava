package day51;

public class Horse extends Animals {


	@Override
	public void makeNoise() {
		super.makeNoise();
		this.eat("horse");
		
		
	System.out.println(" nai nai nailed it");	
	}

	public void eat(String name) {
		
		System.out.println(name+" is eating");
	}

}
