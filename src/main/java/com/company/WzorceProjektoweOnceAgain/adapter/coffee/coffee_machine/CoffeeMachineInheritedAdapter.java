package com.company.WzorceProjektoweOnceAgain.adapter.coffee.coffee_machine;

import adapter.coffee.device.KitchenDevice;

public class CoffeeMachineInheritedAdapter extends CoffeeMachine implements KitchenDevice {

    public void turnDeviceOn() {
        super.on();
    }
}
