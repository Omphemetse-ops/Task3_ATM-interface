import java.util.Scanner;

public class TestATM {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		ATM_Machine_Task3 [] arrAccount = new ATM_Machine_Task3[20];
        arrAccount = fillArray(arrAccount);
        char chara, chara2;
        int i,k;

        while(true)
        {
            System.out.printf("\nDo you want to do transection? (y or n): ");
            chara = input.next().charAt(0);
            if(chara == 'y' || chara == 'Y')
            {
                displayArray(arrAccount);
                System.out.printf("\nEnter number to proceed: ");
                k = input.nextInt();
                k = k - 1;
                System.out.printf("Do you want to Withdraw(w) or Deposit(d): ");
                chara2 = input.next().charAt(0);
                if(chara2 == 'w' || chara2 == 'W')
                {
                    System.out.printf("\nEnter amount to withdraw: ");
                    double amount = input.nextDouble();
                    if(arrAccount[k].Withdraw(amount)== false)
                    {
                        System.out.printf("You have insufficient funds");
                    }
                    else
                    {
                        System.out.printf("\nYour balance is: R" + arrAccount[k].getAmount());
                        System.out.printf("\n\nTransection Done.");
                    }
                }
                else
                {
                    System.out.printf("Enter amount to Deposit: ");
                    double amount = input.nextDouble();
                    arrAccount[k].Deposit(amount);
                    System.out.printf("\nYour new balance is: R" + arrAccount[k].getAmount());
                    System.out.printf("\n\nTransection Done.");
                }
            }
            else
            {break;}
        }
		
	}
	
	public static ATM_Machine_Task3[] fillArray(ATM_Machine_Task3[] arrAccount)
    {
        Scanner input = new Scanner(System.in);

        System.out.printf("\f");
        int counter = 0;
        String Fname, Lname,accType;
        double balance;

        
        System.out.printf("\nEnter the Firstname of account holder: ");
        Fname = input.next();

        System.out.printf("Enter the Lastname of account holder: ");
        Lname = input.next();

        System.out.printf("Enter account number");
        accType = input.next();

        System.out.printf("Enter the amount: ");
        balance = input.nextDouble();
        System.out.printf("\n");

        arrAccount[counter] = new ATM_Machine_Task3(accType,Fname,Lname,balance);
        counter++;
            
        return arrAccount;
    }
	
	
    public static void displayArray(ATM_Machine_Task3 [] arrAccount)
    {
        for(int i =0; i < ATM_Machine_Task3.getNumObject() ;i++)
        {

            System.out.printf((i + 1) + ". " + arrAccount[i].toString());
            System.out.println();
        }
    }
	

}
