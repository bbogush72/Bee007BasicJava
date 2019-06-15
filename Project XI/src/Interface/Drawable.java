package Interface;

public interface Drawable {

		public final static String DRAWINGTOOL = "Pen";
		
		//public static int a=10;
		
		public abstract void draw();
		
		public default void drawLine()
		{
			System.out.println("drawing line with "+ DRAWINGTOOL);	
		}
		
		

		
}
