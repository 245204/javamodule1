package demo;
//inheritance question
public class Person {
	private String name;
	private int age;

public Person(){
	
}
public Person(String name,int age) {
	this.name=name;
	this.age=age;
}
public void getDetails() {
	System.out.println(this.name);
	System.out.println(this.age);
}

}
class Student extends Person{
	private int studentId;
	public Student() {
		
	}
	public Student(String name,int age,int studentId) {
		super(name,age);
		this.studentId=studentId;
	}
	@Override
	public void getDetails() {
		super.getDetails();
		System.out.println(studentId);
	
	}
}
class Teacher extends Person{
	private String subject;
	public Teacher(String name,int age,String subject) {
		super(name,age);
		this.subject=subject;
		
	}
	@Override
	public void getDetails() {
		super.getDetails();
		System.out.println(this.subject);
		
	}
}
