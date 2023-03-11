package testlambdas;

interface Factorial{
	int fact(int a);
}
public class Example2 {

	public static void main(String[] args) {
		Factorial f=(int a)-> {
			int result=1;
			for(int i=1;i<=a;i++)
			{
			 result*=i;
			}
			return result;
			
		};
		int result=f.fact(4);
		System.out.println(result);

	}

}
