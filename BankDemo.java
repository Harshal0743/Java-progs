package BankDetails;
import java.util.InputMismatchException;
import java.util.Scanner;

public class BankDemo 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Account acc = new Account(108, "Harsh", 8000.0);
		int choice = 0;
		while (true)
		{
			System.out.println("\n--- Banking Menu ---");
			System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Show Balance");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            
            try
            {
            	choice = sc.nextInt();
            	switch (choice)
            	{
            	case 1:
            		System.out.print("Enter deposit amount: ");
                    double depositAmt = sc.nextDouble();
                    acc.deposit(depositAmt);
                    break;
            	case 2:
            		System.out.print("Enter withdrawal amount: ");
                    double withdrawAmt = sc.nextDouble();
                    acc.withdraw(withdrawAmt);
                    break;
            	case 3:
            		acc.showBalance();
                    break;
            	case 4:
            		 System.out.println("Exiting... Thank you");
                     System.exit(0);
            	default:
            		 System.out.println("Invalid choice! Please try again.");
            	}
            }
            catch (InputMismatchException e)
            {
            	System.out.println("❌ Invalid input! Please enter numeric values only.");
                sc.nextLine();
            }
            catch (InsufficientBalanceException e)
            {
            	System.out.println(e.getMessage());
            }
            catch (ArithmeticException e)
            {
            	System.out.println("❌ Error: " + e.getMessage());
            }
		}
	}
}

