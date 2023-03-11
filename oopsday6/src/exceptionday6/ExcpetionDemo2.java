package exceptionday6;

public class ExcpetionDemo2 {

	public static void main(String[] args) {
		try {
			System.out.println("task begins");
			int b = Integer.parseInt(args[0]); // string to integer "10" "20" string args soooo we need to changez
			int a = Integer.parseInt(args[1]); // it is input so we give in the run configuration part
			String name = args[2]; //at the time of run input even if we give no double quotes it will run in numbers
			
			int data[] = { a, b };
			
		} catch (ArrayIndexOutOfBoundsException e) {
			
			e.printStackTrace();
			
		} catch (NumberFormatException e) {
		
			e.printStackTrace(); //given to print the exception 
		}
		System.out.println("task completed");
	}
}
