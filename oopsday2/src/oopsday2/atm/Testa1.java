package oopsday2.atm;

public class Testa1 {
	private int number;
	private String name;
	public Testa1(int number,String name)
	{
		super();
		this.number=number;
		this.name=name;
	}
	public int getnumber()
	{
		return number;
	}
	public String getname() 
	{
		return null;
	}
	public void setnumber(int number) 
	{
		this.number=number;
	}
	public void setname(String name) 
	{
		this.name=name;
	}
	/*
	 * public int withdraw(int accno,int amount) { double temp=0; for(int
	 * i=0;i<=account.length;i++) { if(account[i].getactno()==accno) {
	 * temp=account[i].getbalance; temp=temp-amount; account[i].setbalance(temp) } }
	 * }
	 */

}
