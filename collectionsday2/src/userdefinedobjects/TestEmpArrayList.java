package userdefinedobjects;

import java.util.ArrayList;
import java.util.Iterator;

public class TestEmpArrayList {

	public static void main(String[] args) {
		
		ArrayList<Employee> empList=new ArrayList<Employee>();
		
		Employee emp1=new Employee("John Doe","Male",24,101,"Research",40000);
		Employee emp2=new Employee("John Doe","Male",26,102,"Research",40000);
		Employee emp3=new Employee("John Doe","Male",24,103,"Research",40000);
		Employee emp4=new Employee("John Doe","Male",24,104,"Research",40000);
		Employee emp5=new Employee("John Doe","Male",24,105,"Research",40000);
		
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
		empList.add(emp5);
		
		System.out.println(empList);

		

	}

}
