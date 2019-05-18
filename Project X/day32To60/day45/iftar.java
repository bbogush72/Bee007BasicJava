package day45;


public class iftar {

  String food; 
  String time; 
  String beverage; 
  
  // what can we do inside constructor 
  // access the fiels , set the field value 
  // reuse other consructor functionality 
  // call methods 
  
  public iftar(String food, String time, String beverage) {
  
//    this.food = food;
//    this.time = time;
//    this.beverage = beverage;
    setFood(food);
    setTime(time);
    setBeverage(beverage);
    
  }
  
  
  
  public String toString() {
    return "Iftar [food=" + food + ", time=" + time + ", beverage=" + beverage + "]";
  }



  public String getTime() {
    return time;
  }
  public void setTime(String time) {
    this.time = time;
  }
  public String getFood() {
    return food;
  }
  public void setFood(String food) {
    this.food = food;
  }
  public String getBeverage() {
    return beverage;
  }
  public void setBeverage(String beverage) {
    this.beverage = beverage;
  }
}
