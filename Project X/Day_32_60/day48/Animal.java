package day48;

	class Animal
	{ 
		private char[] breed;
		private boolean wild; 
		private char[] color;
		public void eat(String animal)
		{
	System.out.println(animal+" is eating");
		}

		public boolean isWild() {
			return wild;
		}

		public void setWild(boolean wild) {
			this.wild = wild;
		}

		public char[] getBreed() {
			return breed;
		}

		public void setBreed(char[] breed) {
			this.breed = breed;
		}

		public char[] getColor() {
			return color;
		}

		public void setColor(char[] color) {
			this.color = color;
		}
	}

	class Birds extends Animal
	{
		public void fly()
		{
			
		}
	}
	
	class Mammal extends Animal
	{
		public void giveMilk()
		{
			
		}
	}