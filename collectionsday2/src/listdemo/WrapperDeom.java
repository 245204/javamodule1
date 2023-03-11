package listdemo;

public class WrapperDeom {

	public static void main(String[] args) {

		int i=455;
		String str=i+"";
		StringBuilder sb =new StringBuilder(str);
		sb.reverse();
		System.out.println(sb);
		boolean result=str.equals(sb.toString());
		System.out.println(result);
		
	}

}
