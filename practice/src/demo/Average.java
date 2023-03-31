package demo;
//Print the average of three numbers entered by user by creating a class named 
//'Average'having a method to calculate and print the average
import java.util.Scanner;

class Averagee {
	private int num1;
	private int num2;
	private int num3;
	private int avg=0;
	public  Averagee() {
		
	}
	
	public Averagee(int num1,int num2,int num3) {
		this.num1=num1;
		this.num2=num2;
		this.num3=num3;
		//this.avg=avg;
		
	}
	public void CalculateAverage() {
		avg=((num1+num2+num3)/3);
		
		//return ((num1+num2+num3)/3);
	}
	public void PrintAverage() {
		System.out.println(avg);
	}

}
public class Average {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 3 numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		Averagee obj=new Averagee(a,b,c);
		obj.CalculateAverage();
		obj.PrintAverage();
	}
}
