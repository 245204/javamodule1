package demo;

class SavingsAccount {
	static double annualInteresteRate;
	private double SavingBalance;
	private double cml;


public int calculateMonthlyInterest() {
	cml=(annualInterestRate*SavingBalance)/12;
	SavingBalance=SavingBalance+cml;
}
}
