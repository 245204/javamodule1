package listdemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.Set;

public class TestArrayDemo {

	public static void main(String[] args) {
		/*
		 * ArrayList<Integer> arr=new ArrayList<Integer>(); arr.add(1); arr.add(2);
		 * arr.add(78); arr.add(900); System.out.println(arr.get(3));
		 * System.out.println(arr.contains(78)); for(Integer inta:arr) {
		 * System.out.println(inta); System.out.println(arr.equals(1)); }
		 */
		
		/*
		 * LinkedList<String> ll=new LinkedList<String>(); ll.add("getout");
		 * ll.add("bye bye"); ll.add("hi hi"); ll.add("afteroon"); ll.set(2, null);
		 * System.out.println(ll.get(2)); System.out.println(ll.contains("be bye"));
		 */
		
		HashMap<String,Integer>hm=new HashMap<String,Integer>();
		hm.put("Raniya",90);
		hm.put("Aneeta",99);
		hm.put("annu", 98);
		Collection<Integer> val=hm.values();
		for(Integer inn:val)
		{
			System.out.println(inn);
		}
		Set<Entry<String,Integer>> ss=hm.entrySet();
				for(Entry<String,Integer>k:ss)
				{
					System.out.println(k);
				}
		Set<String>keys=hm.keySet();
		for(String str:keys)
		{
			System.out.println(str);
		}
	}
}
