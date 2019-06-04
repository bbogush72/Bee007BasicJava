package day55;


public class Soccer {

  int playerCount; 
  String name; 
  Stadium stadium;
  
  public Soccer(int playerCount, String name, Stadium stadium) {
    this.playerCount = playerCount;
    this.name = name;
    this.stadium = stadium;
  }
  
  public static void main(String[] args) {
    
    Soccer st = new Soccer(10000, "Burger", null); 
    
    System.out.println( st.toString() );
    
    Soccer chelcea = new Soccer(25, "Chelcea", null); 
    
    System.out.println(chelcea.toString());
    
  }

  @Override
  public String toString() {
    return "SoccerClub [playerCount=" 
        + playerCount + ", "
        + "name=" + name 
        + ",stadium=" + stadium.toString() + "]";
  }


  public int getPlayerCount() {
    return playerCount;
  }

  public void setPlayerCount(int playerCount) {
    this.playerCount = playerCount;
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
  
  
  
  
  // ADD 3 ARGS CONSTRUCTOR 
  // ADD GETTERS AND SETTERS 
  // ADD TOSTRING METHOD 
  // CREATE A MAIN METHOD 
  // CREATE YOUR FAVORITE SOCCER CLUB OBJECT 
  // AND TAKE SOME ACTIONS 
  
}