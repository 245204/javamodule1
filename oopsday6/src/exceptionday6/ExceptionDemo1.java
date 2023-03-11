package exceptionday6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo1 {

	public static void main(String[] args) {
		System.out.println("Program Begins");
		try {
			Scanner scanner = new Scanner(System.in);
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			int c = a / b; //point of exception
			int d=b/a;
			System.out.println(c);
			System.out.println(d);
		} catch (ArithmeticException e) {
			System.out.println("Cannot divide by 0");
		}catch(InputMismatchException e) {
			System.out.println("Invaild input");
		}
		System.out.println("Task completed");
	}

}
