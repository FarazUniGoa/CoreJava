package AccessModifier;

public class BankAccount {
	protected int Accno;
	private String Name;
	private int bal;
	
	public BankAccount(int Accno , String Name , int bal)
	{
		this.Accno = Accno;
		this.Name = Name;
		this.bal = bal;
	}
	
	
	private String getnameByID(int Accno)
	{
		if(this.Accno == Accno)
			return this.Name;
		
		else 
			return "";
	}
	
	private int getBalByID(int Accno)
	{
		if(this.Accno == Accno)
			return this.bal;
		
		else 
			return -1;
	}
	
	public void DisplayAccountInfo(int Accno)
	{
		 String Name = getnameByID(Accno);
		 int bal = getBalByID(Accno);
		
		if(Name == "")
			System.out.println("\nNo Info Found please check the Account number ");
		
		else 
			System.out.println("\nAccount Holder Name : "+ Name + "\nBal : "+ bal);
	}

}
