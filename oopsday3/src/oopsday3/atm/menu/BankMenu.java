package oopsday3.atm.menu;  //sir's code

import java.util.*;

import oopsday3.atm.NegativeAmountException.NegativeAmountException;
import oopsday3.atm.exception.InsufficcientFundsException;

public class BankMenu {
	BankofAmerica2 boa=new BankofAmerica2();
	public BankMenu()
	{
		
	Account a1=new Account(101,"John Doe","savings",500);
	Account a2=new Account(102,"John Doe","savings",700);
	Account a3=new Account(103,"John Doe","savings",850);
	Account a4=new Account(104,"John Doe","savings",250);
	Account a5=new Account(105,"John Doe","savings",650);
	
	boa.addAccount(a1);
	boa.addAccount(a2);
	boa.addAccount(a3);
	boa.addAccount(a4);
	boa.addAccount(a5);
	}
	public void menu()
	{
		Scanner sc= new Scanner(System.in);
		int choice= 0;
		loop: do
	{
		System.out.println("1.Create account");
		System.out.println("2.Deposit");
		System.out.println("3.Withdraw");
		System.out.println("4.BalanceEnquiry");
		System.out.println("5.Exit");
		System.out.println("enter choice 1..5");
		
		choice = sc.nextInt();
		
		switch(choice)
	{
		case 1:
		{
			System.out.println("Enter actno");
			int actno=sc.nextInt();
			boa.displayAccount(actno);
			break;
		}
		
		case 2:
		{
			System.out.println("Enter actno");
			int actno= sc.nextInt();
			System.out.println("Enter amount to deposit");
			int amount=sc.nextInt();
		    double balance=0;
			try {
				balance = boa.deposit(amount, actno);
			} catch (NegativeAmountException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    System.out.println(balance);
		    break;
		}
		
		case 3:
		{
			System.out.println("Enter actno");
			int actno=sc.nextInt();
			System.out.println("enter amount to withdraw");
			int amount=sc.nextInt();
			double balance=0;
			try {
				balance = boa.withdraw(amount, actno);
			} catch (InsufficcientFundsException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(balance);
			break;
		}
		
		case 4:
		{
			System.out.println("Balance Enquiry");
			System.out.println("enter actno");
			int actno=sc.nextInt();
			double balance= boa.BalanceEnquiry(actno);
			System.out.println(balance);
			break;
		}
		
		case 5:
		{
		break loop;
		}
	}
	
	}while(choice!=5);
	
	}
}



