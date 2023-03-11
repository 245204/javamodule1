package oopsday3;

public class MathInt implements MathIface {
	
	
	public MathInt() {
		// TODO Auto-generated constructor stub
	}
	
	

	@Override
	public int addition(int a,int b) {
		int add=0;
		add= a+b;
		return add;
	}

	@Override
	public int subtraction(int a,int b) {
		int sub=0;
		sub=a-b;
		
		return sub;
	}

	@Override
	public void swap(int a ,int b) {
		
		int c=0;
		c=a;
		a=b;
		b=c;
		System.out.println("a is"+ a + "b is" + b);
	}

	@Override
	public int factorial(int n) {
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		
		return fact;
	}

	@Override
	public double division(int a,int b) {
		double div=0;
		div=a/b;
		return div;
	}

	@Override
	public int multiplication(int a,int b) {
		int multi=0;
		multi=a*b;
		return multi;
	}

	@Override
	public int area(int a,int b) {
		int area=0;
		area=a*b;
		
		return area;
	}

	@Override
	public int reverse(int rev) {
		int n=rev;
		int r=0,sum=0;
		//for(int i=0;i<=rev;i++)
		while(n>0)
		{
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		return sum;
	}

	@Override
	public int perimeter(int a,int b) {
		int peri=0;
		peri=2*(a+b);
		
		return peri;
	}

	@Override
	public void primenumber(int n) {
		int flag=0;
		if(n==0||n==1)
		{
			System.out.println("it is not prime");
		}
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				flag++;
			}
		}
		if(flag==0)
		{
			System.out.println("it is prime");
		}
		else
		{
			System.out.println("not prime");
		}
	}

	
}

