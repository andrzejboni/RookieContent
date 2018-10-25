package com.company.WzorceProjektoweOnceAgain.adapter.coffee;

import com.company.WzorceProjektoweOnceAgain.adapter.coffee.coffee_machine.CoffeeMachine;
import com.company.WzorceProjektoweOnceAgain.adapter.coffee.coffee_machine.CoffeeMachineAdapter;
import com.company.WzorceProjektoweOnceAgain.adapter.coffee.coffee_machine.CoffeeMachineInheritedAdapter;

public class Main {
    public static void main(String[] args) {

        Kitchen kitchen = new Kitchen();
        //niedozwolone!
       // kitchen.addDevice(new CoffeeMachine());

        kitchen.addDevice(new CoffeeMachineAdapter(new CoffeeMachine()));
        //lub:
        kitchen.addDevice(new CoffeeMachineInheritedAdapter());
        kitchen.turnEverythingOn();
    }
}
