package Inherience;

public class GraduateStudent extends Student implements Sports{
	
	private String Specialization;
	private String Sports;
	
	
	public GraduateStudent(String Name , int age , int RollNo , String Specialization)
	{
		super(Name , age , RollNo);
		this.Specialization = Specialization;
	}
	
	public void setSport(String SportsName)
	{
		this.Sports = SportsName;
	}
	
	public void DisplaySport()
	{
		System.out.println("Sports : "+ this.Sports);
	}
	
	void DisplayDetails()
	{
		super.DisplayDetails();
		System.out.println("Specialization : "+this.Specialization);
		DisplaySport();
	}

}
