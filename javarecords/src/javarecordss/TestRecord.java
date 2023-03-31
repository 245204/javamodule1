package javarecordss;

public class TestRecord {

	public static void main(String[] args) {
		Person John=new Person("John",30);
		Person Sarah= new Person("Sarah",25);
		
		System.out.println(John.name());
		System.out.println(John.age());
		System.out.println(Sarah.age());
		
	}

}
