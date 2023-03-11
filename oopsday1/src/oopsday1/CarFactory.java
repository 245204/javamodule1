package oopsday1;

public class CarFactory {

	public static void main(String[] args) {
		Car toyota =new Car();
		toyota.color ="black";
		toyota.price= 50000;
		toyota.brand="Toyota";
		toyota.model="Fortuner";
	System.out.println(toyota.color);
	System.out.println(toyota.price);
	System.out.println(toyota.model);
	System.out.println(toyota.brand);
	
	Car bmw =new Car();
	System.out.println(bmw);
	bmw.color="white";
	bmw.price=400000;
	bmw.model="2020";
	System.out.println("next car");
	System.out.println(bmw.color);
	System.out.println(bmw.price);
	System.out.println(bmw.model);
	}

}
