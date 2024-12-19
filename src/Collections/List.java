package Collections;
import java.util.*;


public class List {
	
	
	ArrayList<String> Students = new ArrayList<>();
	ListIterator<String> Display = Students.listIterator();
	
	
	
	public void  addStudent(String Name)
	{
		Students.add(Name);
	}
	
	
	
	public boolean Exists(String Name)
	{
		return Students.contains(Name);
	}
	
	public void DisplayStudents()
	{
		for (String name : Students)
		{
			System.out.println("\n" + name);
		}
	}
	
	
	public String getStudebtByID(int ID)
	{
		return Students.get(ID);
	}
	
	
	public void UpdateStudent(int ID,String name)
	{
		Students.set(ID, name);
	}
	
	public void DeleteStudentByID(int ID)
	{
		Students.remove(ID);
	}
	
	public void DeleteStudentByName(String name)
	{
		Students.remove(name);
	}
	
	public int GetStrength()
	{
		return Students.size();
	}

}
