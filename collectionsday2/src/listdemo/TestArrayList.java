package listdemo;
import java.util.ArrayList;
import java.util.Iterator;
public class TestArrayList {

	public static void main(String[] args) {
		
		
		ArrayList flowers=new ArrayList();
		flowers.add(new Integer("1"));
		//flowers.add(new java.util.Date()); to show we can add
		flowers.add(new java.util.Scanner(System.in));
		flowers.add(new Double("10.10"));
		flowers.add("TulipS");
		flowers.add("Rose");
		flowers.add("Jasmine");
		flowers.add("Lilly");
		flowers.add("Cosmos");
		
		
		//String str=(String) flowers.get(3);
		
		Object obj =flowers.get(3);
		if (obj instanceof Integer)
		{
           Integer in=(Integer)obj;
           System.out.println(in.MIN_VALUE);
		}
		else if(obj instanceof Double)
		{
			Double d=(Double) obj;
			System.out.println(d.MAX_VALUE);
		}
		else if(obj instanceof String)
		{
			String str=(String) obj;
			System.out.println(str.toUpperCase());
		}
		String str=(String)flowers.get(5);
		System.out.println();
		
		
		/*
		 * 
		 * System.out.println(flowers); System.out.println(flowers.size());
		 * System.out.println(flowers.get(2));
		 * System.out.println(flowers.contains("lilly")); flowers.add(2,"Sunflower");
		 * 
		 * for(Object obj:flowers) { System.out.println(obj); }
		 * 
		 * flowers.remove(4); System.out.println(flowers); Iterator
		 * iter=flowers.iterator();
		 * 
		 * 
		 * while(iter.hasNext()) { System.out.println(iter.next()); }
		 * 
		 * for(int i=0;i<flowers.size();i++) { System.out.println(flowers.get(i)); }
		 * 
		 */
	}

}
