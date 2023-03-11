package functionalinterfaces;

import java.util.Arrays;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerTest {

	public static void main(String[] args) {
		List<String> strings = Arrays.asList("Tamilnadu", "Telangana", "Kerala", "Karnataka", "Andhra Pradesh");
		
		
		
		Consumer<String> consumer=(str)->{
			
			System.out.println(str);
			
		};
		consumer.accept("I am doing great");
		for(String str:strings)
		{
			consumer.accept(str);  //TO PASS VALUE
		}
		printStrings(strings,consumer);
	}
		public static void printStrings(List<String> strings,Consumer<String>c)
		{
			for(String str:strings) {
				c.accept(str);	
			}
			
			
		}
		
	}


