package com.company.WzorceProjektoweOnceAgain.Fabryka;

public class Main {
    public static void main(String[] args) {

        Pizza p = new PimpMyPizzaFactory().getSpecialOfTheDay(DayOfWeek.Friday);
        Pizza p1= new PimpMyPizzaFactory().getSpecialOfTheDay(DayOfWeek.Monday);
        Pizza p2 = new PimpMyPizzaFactory().getSpecialOfTheDay(DayOfWeek.Wedensday);
        Pizza p3 = new PimpMyPizzaFactory().getSpecialOfTheDay(DayOfWeek.Saturday);
        Pizza p4 = new PimpMyPizzaFactory().getSpecialOfTheDay(DayOfWeek.Sunday);
        Pizza p5 = new PimpMyPizzaFactory().getSpecialOfTheDay(DayOfWeek.Tuesday);

        AbstractPizzaFactory abstractPizzaFactory = new AbstractPizzaFactory();
        abstractPizzaFactory.getPizza("Dragon");
        abstractPizzaFactory.getPizza("Grzyb");

        Pizza persza = new PimpMyPizzaFactory().getSpecialOfTheDay(DayOfWeek.Wedensday);

        Pizza fromOrder = new AbstractPizzaFactory().getPizza("Dragon").getSpecialOfTheDay(DayOfWeek.Wedensday);
        Pizza fromOrder2 = new AbstractPizzaFactory().getPizza("Grzyb").getSpecialOfTheDay(DayOfWeek.Wedensday);


    }
}
