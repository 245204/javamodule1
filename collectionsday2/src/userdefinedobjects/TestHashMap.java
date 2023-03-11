package userdefinedobjects;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.HashMap;

public class TestHashMap {

	public static void main(String[] args) {
		
		Employee emp1=new Employee("John Doe","Male",24,101,"Research",40000);
		Employee emp2=new Employee("John Doe","Male",26,102,"Research",40000);
		Employee emp3=new Employee("John Doe","Male",24,103,"Research",40000);
		Employee emp4=new Employee("John Doe","Male",24,104,"Research",40000);
		Employee emp5=new Employee("John Doe","Male",24,105,"Research",40000);
		
		
		ArrayList<Employee> empList=new ArrayList<Employee>();
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
		empList.add(emp5);
		
		HashSet<Employee> empSet=new HashSet<Employee>();
		empSet.add(emp1);
		empSet.add(emp2);
		empSet.add(emp3);
		empSet.add(emp4);
		empSet.add(emp5);
		
		TreeSet<Employee> empTreeSet=new TreeSet<Employee>();
		empTreeSet.add(emp1);
		empTreeSet.add(emp2);
		empTreeSet.add(emp3);
		empTreeSet.add(emp4);
		empTreeSet.add(emp5);
		
		HashMap<String,Collection> dataMap =new HashMap<>();
		
		dataMap.put("empList", empList);
		dataMap.put("empSet", empSet);
		dataMap.put("empTreeSet", empTreeSet);
		System.out.println(dataMap);
		
		Collection<Employee>list= dataMap.get("empList");
		Iterator<Employee> iter=list.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
			
		}
		
		Collection<Employee> set =dataMap.get("empTreeSet");
		iter=set.iterator();
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
		
		Collection<Employee>treeset=dataMap.get("empSet");
		iter=set.iterator();
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
	
	}

}
