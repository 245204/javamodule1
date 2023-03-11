package functionalinterfaces;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierTest {

	public static void main(String[] args) {
		List<String> strings = Arrays.asList("Tamilnadu", "Telangana", "Kerala", "Karnataka", "Andhra Pradesh");
		Supplier<String> supplier=()->{
			
			return new String("Hola!");
		};
		System.out.println(supplier.get());
		
	}

}
