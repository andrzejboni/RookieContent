package com.company.WzorceProjektoweOnceAgain.Fabryka;

public class Main {
    public static void main(String[] args) {

        Pizza p = new PimpMyPizzaFactory().getSpecialOfTheDay(DayOfWeek.Friday);
        Pizza p1= new PimpMyPizzaFactory().getSpecialOfTheDay(DayOfWeek.Monday);
        Pizza p2 = new PimpMyPizzaFactory().getSpecialOfTheDay(DayOfWeek.Wedensday);
        Pizza p3 = new PimpMyPizzaFactory().getSpecialOfTheDay(DayOfWeek.Saturday);
        Pizza p4 = new PimpMyPizzaFactory().getSpecialOfTheDay(DayOfWeek.Sunday);
        Pizza p5 = new PimpMyPizzaFactory().getSpecialOfTheDay(DayOfWeek.Tuesday);


    }
}
