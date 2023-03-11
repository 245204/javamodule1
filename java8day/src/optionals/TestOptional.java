package optionals;

import java.util.Optional;
                                 //to check whether null is present or not we use this method for that.the normal method is not always acceptable
public class TestOptional {
	public static void main(String args[])
	{
		String str=null;
		String str2="hello";
		//Optional <String> optional=Optional.of(str);
				//System.out.println(optional.get());
				
				Optional<String> optional2=Optional.ofNullable(str2);
				if(optional2.isPresent())
				{
				System.out.println("Value is present "+optional2.get());
				}
				else 
				{
					//System.out.println("is null "+optional2.get());
					System.out.println("is null"+optional2.orElse("str not initialized"));
				}
	}

}
