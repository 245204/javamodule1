package structural.adapter.phone.wrap;

import structural.adapter.phoneifaces.LightingPhone;
import structural.adapter.phoneifaces.MicroUsbPhone;

public class LightningToMicroUsbAdapter implements MicroUsbPhone {
	
	private final LightingPhone lightingPhone;

    public LightningToMicroUsbAdapter(LightingPhone lightningPhone) {
        this.lightingPhone = lightningPhone;
    }

    @Override
    public void useMicroUsb() {
        System.out.println("MicroUsb connected");
        lightingPhone.useLightning();
    }

    @Override
    public void recharge() {
        lightingPhone.recharge();
    }
}


