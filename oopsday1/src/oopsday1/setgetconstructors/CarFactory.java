package oopsday1.setgetconstructors;

public class CarFactory {

	public static void main(String[] args) {
		
	Car toyota =new Car("pink",49000,"toyota","345");
	
	System.out.println(toyota);
	System.out.println(Integer.toHexString(toyota.hashCode()));
	System.out.println(toyota.hashCode());
	
		toyota.setColor("Red");
		toyota.setBrand("Jeep");
		toyota.setModel("2023");
		toyota.setPrice(340000);
		
	
	Car bmw =new Car("blue",678000,"bmw","245");
	
	System.out.println(bmw);
	System.out.println(Integer.toHexString(bmw.hashCode()));
	System.out.println(bmw.hashCode());
	
	bmw.setBrand("audi");
	bmw.setColor("Blue");
	bmw.setModel("2017");
	bmw.setPrice(123000);

	
	}

}

