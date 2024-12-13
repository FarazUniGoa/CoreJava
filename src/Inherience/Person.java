package Inherience;

public class Person {
	
	private String Name;
	private int age;
	
	public Person(String Name , int age)
	{
		this.Name = Name;
		this.age = age;
	}
	
	void Displaydetails()
	{
		System.out.println("Name : "+this.Name + "\nAge : "+this.age);
	}

}
