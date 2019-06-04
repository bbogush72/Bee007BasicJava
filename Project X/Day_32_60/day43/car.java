package day43;

public class car {
	  String model;
      int year;
      String color;
      int speed;
      
      
      public void increaseSpeed(int speed) {
    		for(int i=0; i< 70; i++ ) {
    			speed+=1;
    		}
      }
      
      public void decreaseSpeed(int speed) {
    	  for(int i=speed; i>0; i++ ) {
  			speed=speed-1;
  		}
      }
}


