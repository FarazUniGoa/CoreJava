package AccessModifier;

public class MainRunner extends BankAccount{
	
	public MainRunner(int Accno, String Name, int bal) {
		super(Accno, Name, bal);
		// TODO Auto-generated constructor stub
	}

	public static void main(String args[])
	{
		MainRunner SBI = new MainRunner(1233323,"John Doe",25000);
		
		SBI.DisplayAccountInfo(1233323);
	}

}
