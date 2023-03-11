package functionalinterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;


public class FunctionalTest {
	
	public static void printLength (List<String> strings,Function<String,Integer> fRef)
	{
			for(String str:strings) {
				System.out.println(fRef.apply(str));
			}
		
	}
	
	public static void printUpper (List<String> strings,Function<String,String> fRef1)
	{
		for(String str:strings) {
			System.out.println(fRef1.apply(str));
		}
	}
	public static void printLower (List<String> strings,Function<String,String> fRef2)
	{
		for(String str:strings) {
			System.out.println(fRef2.apply(str));
		}
	}
	
	public static void printReverse(List<String> strings,Function<String,String> fRef3)
	{
		for(String str:strings) {
			System.out.println(fRef3.apply(str));
		}
	}
	

	public static void main(String[] args) {

		List<String> strings = Arrays.asList("Tamilnadu", "Telangana", "Kerala", "Karnataka", "Andhra Pradesh");

		Function<String, Integer> f = (str) -> {
			return str.length();
		};
		printLength(strings,f); 

		
		Function<String,String> f1=(str)->{
			return str.toUpperCase();
		};
		printUpper(strings,f1); 

	
		
		
		Function<String,String> f2=(str)->{
			return str.toLowerCase();
		};
		printLower(strings,f2); 
		
		Function<String,String> f3=(str)->{
			StringBuilder sb=new StringBuilder(str);
			sb.reverse();
			String rev=sb.toString();
			return rev;
			};
			printReverse(strings,f3);

	}
	}


