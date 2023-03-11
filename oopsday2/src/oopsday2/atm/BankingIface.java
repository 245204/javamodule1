package oopsday2.atm;

public interface BankingIface {
	public double withdraw(double amount);
	public double deposit(double deposit);
	public double BalanceEnquiry(int actno);
}
