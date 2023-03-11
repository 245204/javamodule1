package listdemo;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class TestLinkedList {

	public static void main(String[] args) {
		LinkedList<String> list=new LinkedList<>();
		list.add("marker");
		list.add("pencil");
		list.add("book");
		list.add("eraser");
		list.add("ruler");
		
		System.out.println(list);
		System.out.println(list.size());
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		System.out.println(list.get(2));
		list.add(2,"sticky notes");
		System.out.println(list);
		Iterator iter=list.descendingIterator();
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
		ListIterator<String> listIter=list.listIterator();
	}
	

}
