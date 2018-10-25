package com.company.WzorceProjektoweOnceAgain.adapter.coffee;

import com.company.WzorceProjektoweOnceAgain.adapter.coffee.coffee_machine.CoffeeMachine;
import com.company.WzorceProjektoweOnceAgain.adapter.coffee.coffee_machine.CoffeeMachineAdapter;
import adapter.coffee.device.KitchenDevice;

import java.util.ArrayList;
import java.util.List;

public class Kitchen {

    private List<KitchenDevice> deviceList;

    public Kitchen() {
        this.deviceList = new ArrayList<KitchenDevice>();
    }

    public void turnEverythingOn(){
        for (KitchenDevice device : deviceList) {
            device.turnDeviceOn();
        }
    }

    // TODO: turn off

    public void addDevice(KitchenDevice device){
        this.deviceList.add(device);
    }
}
