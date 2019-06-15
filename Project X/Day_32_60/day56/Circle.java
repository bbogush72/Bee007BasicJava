package day56;

abstract class Circle extends Shape {

	/*
	 * Perimeter for circle : 2*Pi*r; area : Pi*r*r
	 */
	double radius;

	public void calculatePerimeter(double c) {
		c = 2 * Math.PI * radius;
		System.out.println("Circle perimeter: " + c);
	}

	@Override
	public void calculatePerimeter() {

		System.out.println(2 * Math.PI * radius);
	}

	// Perimeter for circle : 2*Pi*r; area : Pi*r*r
	@Override
	public double calculateArea() {
		return Math.PI * radius * radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}

}
