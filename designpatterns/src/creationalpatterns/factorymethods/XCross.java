package creationalpatterns.factorymethods;

public class XCross implements Vehicle{
	@Override
	public void start() {
		System.out.println("started......"+getClass());
		
	}
	@Override
	public void stop() {
		System.out.println("stopped..."+getClass());
		
	}
	@Override
	public void honk() {
		System.out.println("Pamm Pamm......"+getClass());
		
	}
	@Override
	public void moove() {
		System.out.println("its moving......."+getClass());
		
	}


}
