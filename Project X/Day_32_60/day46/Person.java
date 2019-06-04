package day46;

public class Person {

	String name;
	float height;
	char gender;
	
	
	private static String race="Humaaans";
	static int counter;
	
	public Person(String name, float height, char gender)
	{
		this.name=name;
		this.height=height;
		this.gender=gender;
		
		counter++;
	}

	public static String getRace() {
		return race;
	}

	public static void setRace(String race) {
		Person.race = race;
	}
}
