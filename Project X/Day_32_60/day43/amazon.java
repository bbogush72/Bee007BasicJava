package day43;

public class amazon 
	{
	private String domainName;
	private int establishedYear;
	private float duration;
	private String ceo;
	private long gValue;
	
	public String getDomain() 
	{
		return domainName;
	}
	
	public void setDomain(String dName) 
	{
		this.domainName=dName;
	}
	public int getYear() 
	{
		return establishedYear;
	}
	public void setYear(int syear) 
	{
		this.establishedYear= syear;
	}
	public String getCeo() 
	{
		
		return ceo;
	}
	public void setCeo(String newCeo) 
	{
		this.ceo= newCeo;
	}
	public long getGvalue() 
	{
		return gValue;
	}
	public void setGvalue(long newGvalue) 
	{
		this.gValue= newGvalue;
	}
	
}
