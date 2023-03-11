package functionalinterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
public class PredicateTest {

	public static void main(String[] args) {
		List<String> strings = Arrays.asList("Tamilnadu", "Telangana", "Kerala", "Karnataka", "Andhra Pradesh");
		
		Predicate<String> p=(String str)->{
			return str.length()>10;
		};
		System.out.println(p.test("Hola"));
		for(String str:strings) {
			System.out.println(p.test(str));
		}
	}
	public static void desiredLength(List<String> strings,Predicate<String>p)
	{
		for(String str:strings)
			System.out.println(p.test(str));
	}

}
