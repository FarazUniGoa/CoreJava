package AbstarctAndInterface;

public class Circle extends shape  implements Drawable {
	
	private int radius;
	
	public void setRadius(int radius)
	{
		this.radius = radius;
	}
	
	  double CalculateArea()
	{
		return 22/7 * radius * radius;
	}
	  
	  public void draw()
	  {
		  System.out.println("Drawing a Circle");
	  }

}
