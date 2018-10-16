package com.company.WzorceProjektoweOnceAgain.Fabryka;

import com.sun.org.apache.regexp.internal.RE;

public class GrzybPizzaFactory implements Factory<Pizza> {

    @Override
    public Pizza getSpecialOfTheDay(DayOfWeek day) {
        Pizza result;

        switch (day) {
            case Monday:
                result = new Pizza("Chłop----GrzybPizza", 55.00f, 20.f, 0.5f);
                break;
            case Tuesday:
                result = new Pizza("Baba----GrzybPizza", 20.120f, 10.f, 1.1f);
                break;
            case Wedensday:
                result = new Pizza("Szczur----GrzybPizza", 30.00f, 40.f, 2.1f);
                break;
            case Thursday:
                result = new Pizza("Kaktus----GrzybPizza", 20.22f, 50.f, 4.1f);
                break;
            case Friday:
                result = new Pizza("Anchois----GrzybPizza", 25.00f, 21.f, 3.1f);
                break;
            case Saturday:
                result = new Pizza("ZKiszonymSledziem----GrzybPizza", 30.00f, 12.f, 2.1f);
                break;
            case Sunday:
                result = new Pizza("CienkaJakKartka----GrzybPizza", 30.00f, 19.f, 1.1f);
                break;
            default:
                result = new Pizza("",20.0f,20.0f,1.0f);
                break;
        }

        return result;
    }
}

