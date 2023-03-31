package creationalpatterns.factorymethods;

public class Seltos implements Vehicle{
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
		System.out.println("Pomm Pomm......"+getClass());
		
	}
	@Override
	public void moove() {
		System.out.println("its moving......."+getClass());
		
	}
}
