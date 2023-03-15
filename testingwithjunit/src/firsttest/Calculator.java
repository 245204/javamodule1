package firsttest;

public class Calculator {
	public int power(int b,int e) {
		int p=1;
		int i=1;
		if(b==0||e==0)
		{
			return 0;
		}
		else {
			while(i<=e) {
				p*=b;
			}
		}
		return p;
		
	}
	public int addition(int a,int b)
	{
		int sum;
		sum=a+b;
		return sum;
	}
	public int squarenumber(int c)
	{
		int square;
		square=c*c;
		return square;
	}
	public int factorial(int n)
	
	{
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		
		}
		return fact;
	}

}
