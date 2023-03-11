package oopsday1.setget;

public class CarFactory {

	public static void main(String[] args) {
		Car toyota =new Car();
		toyota.setColor("Red");
		toyota.setBrand("Jeep");
		toyota.setModel("2023");
		toyota.setPrice(340000);
		System.out.println(toyota.getColor());
		System.out.println(toyota.getBrand());
		System.out.println(toyota.getModel());
		System.out.println(toyota.getPrice());
		
		/*
		 * toyota.color ="black"; toyota.price= 50000; toyota.brand="Toyota";
		 * toyota.model="Fortuner"; System.out.println(toyota.color);
		 * System.out.println(toyota.price); System.out.println(toyota.model);
		 * System.out.println(toyota.brand);
		 */
	
	Car bmw =new Car();
	bmw.setBrand("audi");
	bmw.setColor("Blue");
	bmw.setModel("2017");
	bmw.setPrice(123000);
	System.out.println(bmw.getBrand());
	System.out.println(bmw.getColor());
	System.out.println(bmw.getModel());
	System.out.println(bmw.getPrice());
	
	/*
	 * bmw.color="white"; bmw.price=400000; bmw.model="2020";
	 * System.out.println("next car"); System.out.println(bmw.color);
	 * System.out.println(bmw.price); System.out.println(bmw.model);
	 */
	}

}

