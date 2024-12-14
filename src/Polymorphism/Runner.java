package Polymorphism;

public class Runner {
	
	public static void main (String args[])
	{
		//Upcasting
		Animal dog = new Dog();
		dog.makesound();
		
		dog.setname("Pluto");
		
		//Downcasting
		Dog puppy = (Dog) dog;
		
		puppy.makesound();
		
		System.out.println("Name : "+puppy.getName());
		
		
		puppy.fetch();
	}

}
