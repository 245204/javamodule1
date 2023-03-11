package oopsday4.polymorphism;

public class TestShape {

	public static void main(String[] args) {
		Shape s1=new Square(5);
		System.out.println("square"+s1.area());
		Shape s2=new Rectangle(22.3,2);
		System.out.println("rectangle"+s2.area());
		Shape s3=new Circle();
		System.out.println("circle"+s3.area());
		

	}

}
