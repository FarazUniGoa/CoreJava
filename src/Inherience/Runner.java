package Inherience;

public class Runner {
	
	
	public static void main(String args[])
	{
		Student student = new Student("Faraz Siddiqui",22,2024);
		
		GraduateStudent gstudent = new GraduateStudent("John Doe",25 ,20123322, "Data Science");
		gstudent.setSport("Football");
		
		System.out.println("Welcome to Goa University \n");
		System.out.println("Students List");
		
		student.DisplayDetails();
		
		System.out.println("\nGraduate student List");
		
		gstudent.DisplayDetails();
	}

}
