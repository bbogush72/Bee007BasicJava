package day54;

public class SoccerClub {
	int playerCount;
	int fanCount;
	String name;
	
	public int getPlayerCount() {
		return playerCount;
	}

	public void setPlayerCount(int playerCount) {
		this.playerCount = playerCount;
	}

	public int getFanCount() {
		return fanCount;
	}

	public void setFanCount(int fanCount) {
		this.fanCount = fanCount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Stadium getStadium() {
		return stadium;
	}

	public void setStadium(Stadium stadium) {
		this.stadium = stadium;
	}

	Stadium stadium;

	@Override
	public String toString() {
		return "SoccerClub [playerCount=" + playerCount + ", fanCount=" + fanCount + ", name=" + name + ", stadium="
				+ stadium + ", getPlayerCount()=" + getPlayerCount() + ", getFanCount()=" + getFanCount()
				+ ", getName()=" + getName() + ", getStadium()=" + getStadium() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
}


class Stadium {
	 int capacity;
	String food;

	public Stadium (int capacity,String food ) {
		this.capacity=capacity;
		this.food=food;
		
		
	}

	public Stadium() {
	
	}

	@Override
	public String toString() {
		return "Stadium [capacity=" + capacity + ", food=" + food + ", toString()=" + super.toString() + "]";
	}
	
	
	public static void main(String[] args) {
		Stadium s1 = new Stadium();
		Stadium s2 = new Stadium(500, "Goal");
		s2.capacity=5000;
		System.out.println(s2.toString());
		
	}
	
}