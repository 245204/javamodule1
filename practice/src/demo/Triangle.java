package demo;
//Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5units 
//by creating a class named 'Triangle' without any parameter in its constructor.

class Trianglee {
	private int length;
	private int height;
	private int width;

Trianglee() {
	length=3;height=5;width=4;	
}
public void getArea() {
	System.out.println(length*width*height);
	
}
}
public class Triangle{
	public static void main(String[]args) {
		Trianglee t1=new Trianglee();
		t1.getArea();
		
	}
		
	}
