package Objects;


public class Car {
	private String name;
	private int year;
	private String color;
	private String Company;
	
	public Car(String name , int year , String color , String Company)
	{
		this.name = name;
		this.Company = Company;
		this.color= color;
		this.year = year;
	}
	
	public String getcarname()
	{
		return name;
	}
	
	public String getCompany()
	{
		return Company;
	}
	
	public String getcolor()
	{
		return color;
	}
	
	public int getyear()
	{
		return year;
	}
	
	
	public void showDetails()
	{
		System.out.println("Car Company :" + getCompany()+ "\nCar Name : "+getcarname() + 
				"\nColor : "+getcolor() + "\nModel : "+getyear() );
	}

}
