package javaioserialization.test;

import java.io.ObjectOutputStream;
import java.util.Iterator;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestEmployee {
	public static void main(String[] args) throws IOException
	{
		Employee emp = new Employee(101, "John Doe", 4000, "kkl");
		FileOutputStream fos = new FileOutputStream("emp.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(emp);

	}
}