package oopsday4.composition;

public class CompanyHR {

	public static void main(String[] args) {
	
		Address resAdd= new Address("31","Mannath","Worli","Mumbai",59009);
		Address comAdd= new Address("32","Antela","Bandra","Mumbai",55045);
		
		Employee emp1=new Employee("John Doe","Male",24,101L,"Research",40000.00,resAdd,comAdd);
		System.out.println(emp1);
		Employee emp2=new Employee("John Doe","Male",26,102,"Research",40000,resAdd,comAdd);
		System.out.println(emp2);
		Employee emp3=new Employee("John Doe","Male",24,101,"Research",40000,resAdd,comAdd);
		System.out.println(emp3);
		Employee emp4=new Employee("John Doe","Male",24,101,"Research",40000,resAdd,comAdd);
		System.out.println(emp4);
		Employee emp5=new Employee("John Doe","Male",24,101,"Research",40000,resAdd,comAdd);
		System.out.println(emp5);
		
		if(emp1.equals(emp5))
		{
			System.out.println("the object are same");
		}
		else
		{
			System.out.println("the objects are not same");
		}
	}

}
