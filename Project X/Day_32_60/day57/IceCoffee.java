package day57;

public abstract class IceCoffee implements Drinkable {
	int size;
	public IceCoffee() {
		size=3;
	}
	 
	public  void eat(){
		System.out.println(
		"ICU coffee drink in drink method alright!");
	}
	@Override
	public  void drink() {
		System.out.println("Drinking ICU coffeee");
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		Burger b1 = new Burger("BlackbeanBurger", 5);
		b1.eat();
		b1.drink();
		
		Edible d1 = new Burger("fries", 2);
		d1.eat(); 
		
	    
	}

}
