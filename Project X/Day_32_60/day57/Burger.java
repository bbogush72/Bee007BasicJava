package day57;

public  class Burger implements Edible {
	/*
	 * /// ---- TASK 1
	 * 
	 * Create two interfaces called
	 * 
	 * Edible with single abstract method void eat(); , Drinkable with single
	 * abstract method void drink();
	 * 
	 * Drinkable extends Edible interface
	 * 
	 * create a class called Burger and it implements Edible interface it has 2
	 * instance fields name and size it has constructors to set the value and it has
	 * toString method
	 * 
	 * create another class called IceCoffee it implements Drinkable interface it
	 * has 1 instance field -- size it has constructors to set the value and it has
	 * toString method
	 */
	String food;
	double cost;

	public Burger(String food, double cost) {
		this.food=food;
		this.cost=cost;
		
		System.out.println(food + "cost is " + cost + " $");

	}

	@Override
	public String toString() {
		return "Burger [food=" + food + ", cost= " + cost + "]";
	}

	@Override
	public void eat() {
		System.out.println("Eat in Burger place");
	}

	@Override
	public void drink() {
		System.out.println("Drink in Burger place");
	}

}
