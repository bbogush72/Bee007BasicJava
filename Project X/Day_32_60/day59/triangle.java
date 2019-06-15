package day59;

public class triangle extends Shape{
	public static void main(String[] args) {
		triangle t1= new triangle("red", 10, 5);
		System.out.println(t1.calculateArea());
		t1.draw();
		t1.draw(3);
		t1.drawLine(3);
		
		Square s1 = new Square(" Blue ", 7);
		s1.draw();
		s1.drawLine(4);
		
		
	}
		//String color inherited
		int height = 0;
		int base = 0;
		int area;
		
		public triangle(String color, int base, int height) {
			this.color = color;
			this.base = base;
			this.height= height;
			
		}
		public triangle() 
		{
			System.out.println("default constructor");
		}

		
		@Override
		public double calculateArea() {
			int area = (base * height) / 2;
			return area;
		}
		@Override
		public String toString() {
			return "triangle [height=" + height + ", base=" + base + ", area=" + area + "]";
		}
	
		@Override
		public void Draw() {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void draw() {
			// TODO Auto-generated method stub
			
		}
		
	
}
