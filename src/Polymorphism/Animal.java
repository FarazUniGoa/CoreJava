package Polymorphism;

public class Animal {
	
	String Name ;
	
	void makesound()
	{
		System.out.println("Animal Noises!!!");
	}
	
	void setname(String name)
	{
		this.Name = name ;
	}
	
	String getName()
	{
		return this.Name;
	}

}
