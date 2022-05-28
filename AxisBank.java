package week3.day1;

public class AxisBank extends BankInfo {
	
	public void deposit()
	{
		System.out.println("deposit method override");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AxisBank bank=new AxisBank();
		//deposit method override
		    bank.deposit();
		//extend bankinfo methods
			bank.fixed();
			bank.saving();
		

	}

}
