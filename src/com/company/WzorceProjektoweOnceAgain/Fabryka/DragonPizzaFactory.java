package com.company.WzorceProjektoweOnceAgain.Fabryka;

import com.sun.org.apache.regexp.internal.RE;

public class DragonPizzaFactory implements Factory<Pizza> {

    @Override
    public Pizza getSpecialOfTheDay(DayOfWeek day) {
        Pizza result;

        switch (day) {
            case Monday:
                result = new Pizza("Rogoolo&DragonPizza", 55.00f, 20.f, 0.5f);
                break;
            case Tuesday:
                result = new Pizza("Ululu&DragonPizza", 20.00f, 10.f, 1.1f);
                break;
            case Wedensday:
                result = new Pizza("Wololo&DragonPizza", 30.00f, 40.f, 2.1f);
                break;
            case Thursday:
                result = new Pizza("HowDoYouFeel&DragonPizza", 20.00f, 50.f, 4.1f);
                break;
            case Friday:
                result = new Pizza("ZRokitnikiem&DragonPizza", 25.00f, 21.f, 3.1f);
                break;
            case Saturday:
                result = new Pizza("WezPigulke&DragonPizza", 30.00f, 12.f, 2.1f);
                break;
            case Sunday:
                result = new Pizza("CienkaJakKartka&DragonPizza", 30.00f, 19.f, 1.1f);
                break;
            default:
                result = new Pizza("",20.0f,20.0f,1.0f);
                break;
        }

        return result;
    }
}
