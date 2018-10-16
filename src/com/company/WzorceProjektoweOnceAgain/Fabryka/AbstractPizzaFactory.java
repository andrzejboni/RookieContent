package com.company.WzorceProjektoweOnceAgain.Fabryka;

public class AbstractPizzaFactory {

    public Factory<Pizza> getPizza(String restaurantName) {
        Factory<Pizza> result;

        switch (restaurantName) {
            case "Dragon":
                result = new DragonPizzaFactory();
                break;
            case "Grzyb":
                result = new GrzybPizzaFactory();
                break;
                default:
                    result = new PimpMyPizzaFactory();
        }

        return result;
    }
}
