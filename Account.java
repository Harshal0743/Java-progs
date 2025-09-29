package BankDetails;

public class Account 
{
	int accountNo;
	String name;
	double balance;
	public Account(int accountNo ,String name,double balance)
	{
		this.accountNo=accountNo;
		this.name=name;
		this.balance=balance;
	}
	public void deposit(double amount)
	{
		if (amount<=0)
		{
			throw new ArithmeticException("Deposit amount must be positive");
		}
		balance+=amount;
		System.out.println("Amount deposited sucessfully");
		System.out.println("New Balance:"+balance);
		
	}
	public void withdraw(double amount) throws InsufficientBalanceException
	{
		if (amount<=0)
		{
			throw new ArithmeticException("Withdrawal amount must be positive");
		}
		if (amount > balance)
		{
            throw new InsufficientBalanceException("Insufficient balance for withdrawal.");
        }
		balance=balance-amount;
        System.out.println("Withdrawal successful");
        System.out.println("New balance:" + balance);
    }
	public void showBalance()
	{
		System.out.println("Your current balance is:"+balance);
	}
}

