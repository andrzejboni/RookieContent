package com.company.WzorceProjektoweOnceAgain.Fabryka;

public class PimpMyPizzaFactory implements Factory<Pizza> {


    @Override
    public Pizza getSpecialOfTheDay(DayOfWeek day){
        Pizza result;

        switch (day) {
            case Monday:
                result = new Pizza("Diabolo", 45.00f, 20.f, 0.5f);
                break;
            case Tuesday:
                result = new Pizza("Cappriciosa", 15.00f, 10.f, 1.1f);
                break;
            case Wedensday:
                result = new Pizza("Pepperoni", 35.00f, 40.f, 1.1f);
                break;
            case Thursday:
                result = new Pizza("Gyros", 25.00f, 50.f, 4.1f);
                break;
            case Friday:
                result = new Pizza("Wiejska", 5.00f, 21.f, 3.1f);
                break;
            case Saturday:
                result = new Pizza("A Hard Day’s Night", 12.00f, 12.f, 2.1f);
                break;
            case Sunday:
                result = new Pizza("Pomodoro", 19.00f, 19.f, 1.1f);
                break;
                default:
                    result = new Pizza("",0.0f,0.0f,0.0f);
                    break;
        }

        return result;
    }

}
