package testlambdas;

@FunctionalInterface
interface Shape{
	double area();//only one method is possible 
//	double parameter(); no error but the lambda function wont work
}

interface Math{
	double power(int b,int e);
}


public class Example1 {

	public static void main(String[] args) {
		int a =10;
		
		Runnable r1=new Runnable() {
			public void run() {
				System.out.println("from the run method");
			}
		};
		Thread t1=new Thread(r1);
		t1.start();
		
		
		Runnable r=()->{            //Runnable is an inbuilt interface
			for(int i=1;i<5;i++) {
				System.out.println("in run method"+ i+ a );
			}
		};
		Thread t=new Thread(r);
		t.start();
		
		
		
		
		Shape s=()-> {   //lambda function
			return 0.0;
		};
		double result=s.area();    //calling the function with the help of lambda(object of lambda and the function name to refer and call
		System.out.println(result);
		
		
		
		
		Math m=(int b, int e)->{
			int p=1;
			for(int i=1;i<=e;i++) {
				p*=b;
			}
			return p;
		
		};
		double resultt=m.power(2,4);
		System.out.println(resultt);
		
		
		
		
		}
	}


