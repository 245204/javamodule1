package demo;

public class exce {

	public static void main(String[] args) {
		try {
			int a=5;
			int sum=a/0;
//			throw new ArithmeticException();
			//System.out.println("rest");
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("finaly");
		}
	}
}
