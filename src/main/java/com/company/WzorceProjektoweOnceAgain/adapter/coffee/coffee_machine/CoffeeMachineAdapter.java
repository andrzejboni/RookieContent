package com.company.WzorceProjektoweOnceAgain.adapter.coffee.coffee_machine;

import adapter.coffee.device.KitchenDevice;

public class CoffeeMachineAdapter implements KitchenDevice {
    private CoffeeMachine coffeeMachine;

    public CoffeeMachineAdapter(CoffeeMachine coffeMachine) {
        this.coffeeMachine = coffeMachine;
    }

    public void turnDeviceOn() {
        coffeeMachine.on();
    }
}
