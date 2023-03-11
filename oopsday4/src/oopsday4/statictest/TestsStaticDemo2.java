package oopsday4.statictest;

public class TestsStaticDemo2 {
	public static void main(String[] args) {
		
		 StaticDemo2 d1=new StaticDemo2(); 
		 d1.method(); 
		 StaticDemo2.method();
		 
		System.out.println("from start");
		//method(); //cannot call as it is non static
		}
	public void method2()
	{
		System.out.println(StaticDemo2.a);
		//method(); //possible as non static can call static
	}
}
