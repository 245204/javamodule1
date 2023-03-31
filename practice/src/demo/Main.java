package demo;
//inheritance
public class Main {

	public static void main(String[] args) {
		Person p=new Person("meera",23);
		Student s=new Student("archana",55,7898);
		Teacher t=new Teacher("tessy",44,"maths");
		p.getDetails();
		s.getDetails();
		t.getDetails();

	}

}
