package strings;

public class TestStrings {
	public static void main(String[] args) {
		byte bytes[]= {65,66,67,68,69};
		 String str=new String(bytes); System.out.println(str.length());
		/*
		 * byte bytes[]= {65,66,67,68,69};
		 * 
		 * String str=new String(bytes); System.out.println(str.length());
		 * System.out.println(str); str= "Welcome to UST";
		 * 
		 * bytes=str.getBytes(); for(byte b:bytes) { System.out.println(b); } char
		 * chars[]= {'U','S','T',' ','G'}; str= new String(chars);
		 * System.out.println(str);
		 * 
		 * str.getChars(0, chars.length-1, chars,0); for(char c: chars) {
		 * System.out.println(c); }
		 */
		str=new String("she sells sea shells in. the sea shore");
		int s=0;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch=='s')
			{
				s++;
			}
		}
		System.out.println(s);
		
		String words[]=str.split("[.]");
		System.out.println(words.length);
		for(String word: words) {
			System.out.println(word);
		}
		str=new String("Cartoon");
		System.out.println(str.startsWith("Car"));
		System.out.println(str.endsWith("toon"));
		
		int apos=str.indexOf('a');
		int tpos=str.indexOf('t');
		
		String str2=str.substring(apos,tpos+1);  //incase of the substring in between two points
		System.out.println(str2);
		
		str2=str.substring(tpos);
		System.out.println(str2);
		
		
		str =new String("madam");
		int dpos=str.indexOf('d');
		System.out.println(dpos);
		str2=str.substring(dpos);
		str2=str.substring(dpos, str.length());
		System.out.println(str2);
		
		String email=new String("aneeta.roy@gmail.com");
		int cpos=email.lastIndexOf(".com");
		String str3=email.substring(0,cpos);
		System.out.println(str3);
		
		String str4=new String("WELCOME");
		String str5=new String("welcome");
		
		boolean result=str4.equalsIgnoreCase(str5);
		System.out.println(result);
		
		int val=str5.compareTo(str4);
		System.out.println(val);
		
		System.out.println(str.toUpperCase());
		System.out.println(str);
		String fs=new String("yyUP");
		System.out.println(fs.toLowerCase());
		System.out.println(fs);
		
		
		
		}
}
