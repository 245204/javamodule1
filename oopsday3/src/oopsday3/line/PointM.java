package oopsday3.line;
import java.util.Scanner;
public class PointM {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the 1 coordinates");
		int x1=sc.nextInt();
		int y1=sc.nextInt();
		Point p1=new Point(x1,y1);
		
		System.out.println("Enter the 2 coordinates");
		int x2=sc.nextInt();
		int y2=sc.nextInt();
		Point p2=new Point(x2,y2);
		
		Functiondemo f1=new Functiondemo();
		
		int a1=p1.getX();
		int b1=p2.getX();
		f1.drawline(a1,b1);
		
		
		
		
	}

}
