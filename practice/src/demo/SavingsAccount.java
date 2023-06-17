package demo;

class SavingsAccount {
	static double annualInteresteRate;
	private double SavingBalance;
	private double cml;


public int calculateMonthlyInterest() {
	cml=(annualInteresteRate*SavingBalance)/12;
	SavingBalance=SavingBalance+cml;
	return 0;
}
}
