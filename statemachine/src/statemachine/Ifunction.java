//package statemachine;
//import java.util.*;
//
//public class Ifunction implements StateIface 
//{
//	public Ifunction() {
//		// TODO Auto-generated constructor stub
//	}
//	Scanner sc=new Scanner(System.in);
//	int index=0;
//	double amt;
//	BankDemo[]objArr=new BankDemo[2]; //created the array for the denominations(2 means type of note and then its count like that 2)
//	BankDemo b1=new BankDemo();
//	
//
//	@Override
//	public double Amount() 
//	{
//		objArr[0]=new BankDemo(100,10);
//		objArr[1]=new BankDemo(200,30);
//		
//		int f=0;
//		loop1: while(f<3)
//		{
//			f++;
//		System.out.println("Enter the amount you desire");
//		amt=sc.nextDouble();
//		double dtn2=Denomination();
//		double co=0;
//		for(int k=0;k<objArr.length;k++)
//		{
//			if(dtn2==objArr[k].value)
//			{
//				co=objArr[k].getdCount();
//			}
//		}
//		
//			if((amt%dtn2)==0)
//			{
//				double  div=amt/dtn2;
//				if(div<co)
//				{
//					b1.dCount=b1.dCount-div;
//				}
//			}
//		}
//		
//
//		
//		return 0;
//	}
//
//	@Override
//	public double Denomination() {
//		System.out.println("The denominations available are");
//		for(int i=0;i<objArr.length;i++)
//		{
//			System.out.println(objArr[i]);
//		}
//		
//		System.out.println("");
//		System.out.println("enter your choice");
//		double dnt=sc.nextInt();
//		for(int j=0;j<objArr.length;j++)
//		{
//			if(dnt==objArr[j].value)
//			{
//				return objArr[j].getValue();
//			}
//			else
//			{
//				System.out.println("not the correct denomination");
//			}
//		}
//		
//		
//
//	}
//
//	@Override
//	public double Balance() {
//		
//		
//		return 0;
//	}
//
//}
