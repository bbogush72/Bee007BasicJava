package day58;

public class IceCoffee implements Drinkable{

	  int size ; 
	  public IceCoffee() {
	    size = 3; 
	  }
	  
	  public static void main(String[] args) {
	    
	    Burger b1 = new Burger("BlackBeanBurger", 5);
	    b1.eat();
	    
	    
	    IceCoffee coffee = new IceCoffee(); 
	    coffee.eat();
	    coffee.drink();
	    
	  }
	  
	  @Override
	  public void eat() {
	    System.out.println("ice coffee can be consumed by drinking ");
	  }

	  @Override
	  public void drink() {
	    System.out.println("Spartan is drinking ice coffee");
	  }

	  

	}