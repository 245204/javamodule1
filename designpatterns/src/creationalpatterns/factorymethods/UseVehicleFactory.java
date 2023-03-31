package creationalpatterns.factorymethods;

public class UseVehicleFactory {
	public static void main(String[] args) {
		Vehicle seltos=VehicleFactory.newInstance("Seltos");
		seltos.honk();
		Vehicle suzhki=VehicleFactory.newInstance("XCross");
		suzhki.moove();
	}

}
