import java.util.*;
public class ATM_Complete_Project 
{
	public static void main(String[] args) 
	{
		int pin=2001;
		int balance=10000;
		
		int AddAmount=0;
		int TakeAmount=0;
		
		String name;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Your Pin Number:");
		
		int password=sc.nextInt();
		
		if(password==pin)
		{
			System.out.println("Enter Your Name:");
			name=sc.next();
			System.out.println("Welcome "+name);
			
			while(true)
			{
				System.out.println("Press 1 To Check Your Balance");
				System.out.println("Press 2 To Add Amount");
				System.out.println("Press 3 To Take Amount");
				System.out.println("Press 4 To Take Recipt");
				System.out.println("Press 5 To Exit");
				
				int opt=sc.nextInt();
				
				switch(opt)
				{
				case 1:
					System.out.println("Your Current Balance is :"+balance);
					break;
				case 2:
					System.out.println("How Much Amount Do You Want To Add To Your Account");
					AddAmount=sc.nextInt();
					System.out.println("Successfully Credited");
					balance =AddAmount+balance;
					break;
				case 3:
					System.out.println("How Much Amount Did You Want To Take ");
					TakeAmount=sc.nextInt();
					if(TakeAmount>balance)
					{
						System.out.println("Your Balance Is Insufficiant");
						System.out.println("Try Less Then Your Available Balance ");
					}
					else
					{
						System.out.println("Successfully Taken ");
						balance = balance-TakeAmount;
					}
					break;
				case 4:
					System.out.println("Welcome To A1 ATM ");
					System.out.println("Available Balance Is: "+balance);
					System.out.println("Amount Deposited "+AddAmount);
					System.out.println("Amount Taken "+TakeAmount);
					System.out.println("THANKS FOR A1 ATM");
					break;
				}
				if(opt==5)
				{
					System.out.println("Thank You");
					break;
				}
			}
		}
		else
		{
			System.out.println("Wrong Pin Number");
		}
		
		
	}

}
