package AbstarctAndInterface;

public class Rectangle  extends shape implements Drawable {
	private int length;
	private int breadth;
	
	public void SetProperties(int length , int breadth)
	{
		this.length = length;
		this.breadth = breadth;
	}
	
	
	double CalculateArea()
	{
		return length * breadth;
	}
	
	public void draw()
	{
		System.out.println("Drawing a rectangle");
	}

}
