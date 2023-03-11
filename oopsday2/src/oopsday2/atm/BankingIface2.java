package oopsday2.atm;

public interface BankingIface2 {
	public double withdraw(double amount,int actno);
	public double deposit(double deposit,int actno );
	public double BalanceEnquiry(int actno);
}
