package Javatraining;

import java.util.Scanner;

public class ATM {
	static Scanner sc = new Scanner(System.in);
	static Double Balance=0.0;	
	public static void PinNumber()
	{
		System.out.println("Enter Your ATM PIN Number ");
		String pin=sc.next();
		
		for(int i=1;i<=4;i++)
		{
			if(i==4)
			{
				if(pin.equals("123"))
				{
					System.out.println("PIN is correct..");
					EnterChoice();	}
				else 
				System.out.println("Your account is Blocked.... \nVisit Your Nearest branch to unblock your account.");
			}		
			else if(i<=3)
			{
				if(pin.equals("123"))
				{
					System.out.println("PIN is correct..");
					EnterChoice();	}
				else 
				{
					System.out.println("Please enter the valid PIN Number");
					pin=sc.next();	}	
				}	}	}
	public static void Deposite()
	{
		System.out.println("Enter the amount to Deposite");
		double dep = sc.nextDouble();
		if(dep<100)
			System.out.println("Deposit cannot be less than Rs 100");
		else
		{
		Balance = Balance+dep;
		System.out.println("Rs."+dep+" Amount is Deposited successfully");
		System.out.println("Your Account current balance is Rs "+Balance);	}
	}

	public static void Withdraw()
	{
		System.out.println("Enter the amount to Withdraw");
		double wid = sc.nextDouble();
		if(wid<100)
			System.out.println("Withdravel cannot be less than Rs 100");
		else if(Balance<wid)
		{
			System.out.println("Insufficient Balance");	}
		else {
		Balance = Balance-wid;
		System.out.println("Rs."+wid+" Amount is Withdrawed successfully");
		System.out.println("Your Account current balance is Rs "+Balance);	}
	}

	public static void Transaction()
	{
		System.out.println("Do you want to continue? Say Yes or No");
		String yn = sc.next();
		if(yn.equalsIgnoreCase("yes"))
		{
			EnterChoice();	}
		else if(yn.equalsIgnoreCase("no"))
		{
			System.out.println("Thank you for visiting our services");	}
		else
		{
			System.out.print("Please enter valid option, ");	
			Transaction();	}
	}
	public static void EnterChoice()
	{
		System.out.println("Pleasea enter your choice as 1 / 2 / 3 for... \n 1. Balance Check \n 2. Deposite \n 3. Witdrawal");
		String ch = sc.next();
		switch(ch)
		{
		case "1":
		{
			System.out.println("Your Account current balance is Rs "+Balance);
			Transaction();
			break;	}
		case "2":
		{
			Deposite();
			Transaction();
			break;	}
		case "3":
		{
			Withdraw();
			Transaction();
			break;
		}
		default:
			System.out.println("Invalid Choice");
			EnterChoice();
			break;
		}
	}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			PinNumber();		
		}

}
