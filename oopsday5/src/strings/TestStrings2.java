package strings;

public class TestStrings2 {

	public static void main(String[] args) {
	String str=new String("16-11-477/6/A/3 Hyderabad 50036");
	int alp=0;
	int other=0;
	int digit=0;
	for(int i=0;i<str.length();i++)
	{
	Character c = str.charAt(i);
		if(Character.isDigit(c))
		{
			digit++;
		}
		else if(Character.isAlphabetic(c))
		{
			alp++;
		}
		else 
		
		{
			other++;
		}
	}
	System.out.println(digit);
	System.out.println(alp);
	System.out.println(other);
	}
}
	
