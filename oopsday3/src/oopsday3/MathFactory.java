package oopsday3;

public class MathFactory {

	public static void main(String[] args) {
		MathInt mat=new MathInt();
		System.out.println(mat.addition(30, 5));
		System.out.println(mat.subtraction(20, 10));
		System.out.println(mat.division(30, 10));
		System.out.println(mat.multiplication(30, 10));
		mat.primenumber(3);
		System.out.println(mat.factorial(4));
		mat.swap(3, 4);
		System.out.println(mat.area(3, 5));
		System.out.println(mat.perimeter(4, 2));
		System.out.println(mat.reverse(123));

	}

}
