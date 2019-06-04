package day55;

public class OnlineStudent extends Student {

//  int id; 
//  String name; 
  int zoomId; 
  

  @Override
  public void attendClass() {
    System.out.println("attend class using zoom");
  }
  
  
  public static void main(String[] args) {
    
    OnlineStudent s1 = new OnlineStudent(); 
    s1.id = 101; 
    s1.name = "Spartan";
    s1.zoomId = 20001;
    s1.attendClass();
    
//    Student s2 = new Student() ; 
    
    
    
    
  }
  
}
