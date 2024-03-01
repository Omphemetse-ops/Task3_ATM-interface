
public class ATM_Machine_Task3 {
	private String accountNum, LName, FName;
	private double Bank_Amount;
	private static int NumObject;
	

	public ATM_Machine_Task3(String AccountNumber,String FName,String LName, double Amount)
	{
		this.accountNum = AccountNumber;
		this.Bank_Amount = Amount;
		this.LName = LName;
		this.FName = FName;
		NumObject++;
	}
	
	public String getAccount()
	{
		return accountNum;
	}
	
	public String getFname()
	{
		return FName;
	}
	
	public String getLname()
	{
		return LName;
	}
	
	public double getAmount()
	{
		return Bank_Amount;
	}
	
	public static int getNumObject()
    {
        return NumObject;
    }
	
	public boolean Withdraw(double Withdraw_Amount)
	{
		double Balance = 0.0;
		
		if(Bank_Amount >= Withdraw_Amount)
		{
			Balance = Bank_Amount - Withdraw_Amount;
			Bank_Amount = Balance;
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public void Deposit(double deposit_Amount)
	{
		double Total_Amount = 0.0;
		Total_Amount = Bank_Amount + deposit_Amount;
		
		Bank_Amount = Total_Amount;
	}
	
	public String toString()
    {
        String str;
        str = getAccount() + " " + getFname() + " " + getLname() + " " + getAmount();
        return str;
    }

}
