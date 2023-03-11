package statemachine;

public class BankDemo {
	double dCount; // the no of notes left
	double value; // the 100 500 200 notes

	public BankDemo() {
		
	}

	public BankDemo(int dCount, double value) {
		super();
		this.dCount = dCount;
		this.value = value;
	}

	public double getdCount() {
		return dCount;
	}

	public void setdCount(int dCount) {
		this.dCount = dCount;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

}
