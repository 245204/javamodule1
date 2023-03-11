package userdefinedobjects;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class TestEmpTreeSet {

	public static void main(String[] args) {
		
		TreeSet<Employee> empTreeSet=new TreeSet<Employee>();
		
		Employee emp1=new Employee("John Doe","Male",24,101,"Research",40000);
		Employee emp2=new Employee("John Doe","Male",26,102,"Research",40000);
		Employee emp3=new Employee("John Doe","Male",24,103,"Research",40000);
		Employee emp4=new Employee("John Doe","Male",24,104,"Research",40000);
		Employee emp5=new Employee("John Doe","Male",24,105,"Research",40000);
		
		empTreeSet.add(emp1);
		empTreeSet.add(emp2);
		empTreeSet.add(emp3);
		empTreeSet.add(emp4);
		empTreeSet.add(emp5);
		
		System.out.println(empTreeSet.size());
		System.out.println(empTreeSet);

		

	}

}
