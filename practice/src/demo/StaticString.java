package demo;

//here then copy is being changed and not the address 
//so if str=goodbye world then it will be printed 
public class StaticString
{

  static String str = "Hello World";
  public static void changeIt(String s)
  {
    s = "Good bye world";
  }
  public static void main(String[] args)
  {
	  
    changeIt(str);
    System.out.println(str);
  }
}


//String str1 = "one";
//String str2 = "two";
//System.out.println( str1.equals(str1=str2) );