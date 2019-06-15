package day58;

public class Burger implements Edible {

	String name;
	int size;

	public Burger(String name, int size) {
		this.name = name;
		this.size = size;
	}

//	public void Burger(String name0, int size0) {
//
//	}

	@Override
	public String toString() {
		return "Burger [name=" + name + ", size=" + size + "]";
	}

	@Override
	public void eat() {
		System.out.println("Spartan Eating burger");
	}

}
