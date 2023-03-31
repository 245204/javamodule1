package structural.adapter.phoneimpl;

import structural.adapter.phoneifaces.LightingPhone;

public class Iphone implements LightingPhone {

	private boolean connector;

	@Override
	public void useLightning() {
		connector=true;
		System.out.println("MicroUsb connected");
		
	}
	@Override
	public void recharge() {
		if(connector) {
			System.out.println("Recharge started");
			System.out.println("Recharge finished");
		}else {
			System.out.println("Connect MicroUsb finished");
		}
	}
	}


