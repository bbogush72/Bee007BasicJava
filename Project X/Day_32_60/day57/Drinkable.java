package day57;

public interface Drinkable extends Edible {
	String cupSize = "tall";
	
	//void eat(); invisible here from Edible 
	@Override
	void drink(); 
	
	public void IceDrink (String cupSize);

	void eat();
		
}
