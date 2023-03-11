package oopsday1.withbusinessmethods;

public class CarFactory {

	public static void main(String[] args) {
	Car toyota =new Car("pink",49000,"toyota","345");
	toyota.start();
	toyota.changeGear(2);
	toyota.stop();
	
	
	Car bmw =new Car("blue",678000,"bmw","245");
	bmw.start();
	bmw.changeGear(3);
	bmw.stop();
	
	}

}

