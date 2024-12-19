package Collections;
import java.util.*;

public class ListRunner {
	
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		List StudentManager = new List();
		
		boolean cont = true;
		int ch;
		
		while(cont)
		{
			System.out.println("Enter your choice\n1:Add Student\n2:Display Students\n"
					+ "3:Get Strength \n4:Delete Student By ID\n5: Delete Student by name"
					+ "\n6: Update By ID\n7:Get Student by ID\n8:Exit the process");
			ch = sc.nextInt();
			sc.nextLine();
			
			switch(ch)
			{
			
			case 1 : System.out.println("Enter the name of the student");
					 sc.reset();
					 String name = sc.nextLine();
					 StudentManager.addStudent(name);
					 break;
					 
			case 2 : StudentManager.DisplayStudents();
				     break;
				     
			case 3 : int strength = StudentManager.GetStrength();
					  System.out.println("\nTotal Number of Students : "+strength);
				     break;
				     
			case 4 : System.out.println("\nEnter the ID of the student : ");
					 int ID = sc.nextInt();
					 sc.nextLine();
					 
					 StudentManager.DeleteStudentByID(ID);
				     break;
				     
			case 5 : System.out.println("\nEnter the Name of the Student");
					 String Name = sc.nextLine();
					 if(StudentManager.Exists(Name))
						 StudentManager.DeleteStudentByName(Name);
					 
					 else
						 System.out.println("\nStudent Does not Exists");
					 break;
					 
			case 6 : System.out.println("\nEnter ID of the Student to Update : ");
				     ID = sc.nextInt();
				     sc.nextLine();
				     System.out.println("\nEnter the new Name of the student : ");
				     name = sc.nextLine();
				     
				     StudentManager.UpdateStudent(ID, name);
				     break;
				     
			case 7 : System.out.println("\nEnter the ID : ");
					 ID = sc.nextInt();
					 sc.nextLine();
					 System.out.println("Name : "+StudentManager.getStudebtByID(ID));
				     break;
				     
			case 8 : System.out.println("\nThank you for using the System");
					 cont = false;
				     break;
				     
			default : System.out.println("\nInvalid Input Please Try Again !!!");
					  break;
			}
			
			
			
		}
		
		sc.close();
	}

}
