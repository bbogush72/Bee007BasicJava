package day54;

public class ProgrammingLanguage extends Language{

	  
	  public static void main(String[] args) {
	    
		  
		  Language a = new Language();
		  a.obeyGrammaRule();
		  a.display();
	    
	  }
	  
	//  @Override
	//  public void obeyGrammaRule() {
//	    System.out.println("MUST OBEY THE SYNTAX RULE, are you sure");
//	    super.obeyGrammaRule();
	//  }
	//  public final static void display() {
//	    System.out.println("display language");  
	//  }
	  
	  
	}

	class Language{
	  
	  
	  public final void obeyGrammaRule() {
	    
	    System.out.println("MUST OBEY THE SYNTAX RULE");
	    
	  }
	  public final static void display() {
	    System.out.println("display language");  
	  }
	  
	  
	}
