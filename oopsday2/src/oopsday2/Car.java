package oopsday2;

public class Car implements CarIface {
	
	private double fuel;
	private double battery;
	private double kilometersRun;
	private boolean engineStatus;
	
	public Car() {
		                                          //default constructor 
		
	}

	public Car(double fuel, double battery, double kilometersRun, boolean engineStatus) {     //parameterized constructor
		super();
		this.fuel = fuel;
		this.battery = battery;
		this.kilometersRun = kilometersRun;
		this.engineStatus = engineStatus;
	}

	public double getFuel() {
		return fuel;                             //to get values in case of instance variables when they are private 
	}

	public void setFuel(double fuel) {
		this.fuel = fuel;
	}

	public double getBattery() {
		return battery;
	}

	public void setBattery(double battery) {
		this.battery = battery;
	}

	public double getKilometersRun() {
		return kilometersRun;
	}

	public void setKilometersRun(double kilometersRun) {
		this.kilometersRun = kilometersRun;
	}

	public boolean isEngineStatus() {
		return engineStatus;
	}

	public void setEngineStatus(boolean engineStatus) {
		this.engineStatus = engineStatus;
	}

	
	@Override
	public void start() {
		if(engineStatus == false && fuel> 1000 && battery >100)
		{
			System.out.println("Engine Starting....");
			engineStatus =true;
		}

	}
	
	
	
	@Override
	public void honk() {
		System.out.println("PO PO POOOO...");
	}
	
	
	@Override
	public void move() {
		if(engineStatus) {
			for(int i=0;i<50;i++) {
				System.out.println("Car is moving...");
				fuel=fuel-10;
				battery=battery - 2;
				kilometersRun++;
				
					try {                
						Thread.sleep(1000);       //gets delayed at the time of printing
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}

	
	@Override
	public void changeGear() {
	}
	
	
	@Override
	public void stop() {
		System.out.println("Car is stopping....");	
	}

	@Override
	public String toString() {
		return "Car [fuel=" + fuel + ", battery=" + battery + ", kilometersRun=" +
		  kilometersRun + ", engineStatus=" + engineStatus + "]";
		 
	}
}
