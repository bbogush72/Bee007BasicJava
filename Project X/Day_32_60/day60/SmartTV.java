package day60;

public class SmartTV extends TV{
	
	int channelCount =200 ;
	
	@Override
	public void play() 
	{
	System.out.println("playing snail smart tv");	
	}
	
	@Override
	public int getChannelCount() 
	{
//this method will look for the closest value up under the class: 200
		return channelCount;
	}
	
	
	public static void main(String[] args) 
	{
		SmartTV tv1 = new SmartTV();
		tv1.play();
		System.out.println("smart tv1 count: "+tv1.getChannelCount());
		
		TV tv2 = new SmartTV();
		System.out.println("tv2 channel count: "+ tv2.channelCount);
		System.out.println("get channel count: "+tv2.getChannelCount());
		
		System.out.println("get channel count by new key "+ new SmartTV().getChannelCount() );
		
	}

	
	
}
