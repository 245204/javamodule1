package oopsday2;

public class carFactory2 {

	public static void main(String[] args) {
		
                                   //CarIface car=new carIface();

		//CarIface car;              // not referring to any object
		CarIface car = new Car(5000,500,0,false);  //class object being assigned to interface...we cannot create object for interface
		car.start();
		car.honk();
		car.move();
		car.stop();
	}

}
