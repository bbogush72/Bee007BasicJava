package day31;

public class cookMethods {

	public static void main(String[] args) {

		order();

	}

	public static void prepare() {
		System.out.println("1- Boil the water");

	}

	public static void addIngredients() {
		System.out.println("2- add pasta to the water");

	}

	public static void tasteBringToTable() {
		System.out.println("3- cook it for 30 min");

	}

	public static void prepareTheTable() {
		System.out.println("4- prepare the dinner table");

	}

	public static void prepareTheDinner() {
		System.out.println("4- prepare the dinner table");

	}

	public static void order() {
		prepare();
		addIngredients();
		tasteBringToTable();
		prepareTheDinner();
	}

}
