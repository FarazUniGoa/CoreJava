package AbstarctAndInterface;
import java.util.Scanner;

public class Main {
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Circle circle = new Circle();
		Rectangle rect = new Rectangle();
		int Radius , length , breadth;
	
		System.out.println("Enter the radius of the circle");
		Radius = sc.nextInt();
		
		
		System.out.println("Enter the Length of the rectangle");
		length = sc.nextInt();
		System.out.println("Enter the Breadth of the rectangle");
		breadth = sc.nextInt();
		
		sc.close();
		
		circle.setRadius(Radius);
		
		rect.SetProperties(length, breadth);
		
		System.out.println("Area of the Cirlce : "+circle.CalculateArea());
		
		circle.draw();
		
		
		System.out.println("Area of the rectangle : "+ rect.CalculateArea());
		rect.draw();
		
		
	}

}
