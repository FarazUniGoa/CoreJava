package Inherience;

public class Student extends Person{
	
	private int RollNo;
	
	public Student(String Name , int age , int RollNo)
	{
		super(Name , age);
		this.RollNo = RollNo;
	}
	
	void DisplayDetails()
	{
		super.Displaydetails();
		System.out.println("Roll No : "+ this.RollNo);
	}

}
