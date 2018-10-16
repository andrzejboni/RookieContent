package com.company.WzorceProjektoweOnceAgain.Dekorator;

public class Car {
    private double speed; // actual speed
    private String name;
    private int places;
    private double acceleration;

    public Car(double speed, String name, int places, double acceleration) {
        this.speed = speed;
        this.name = name;
        this.places = places;
        this.acceleration = 2.0; // 2G
    }

    public void start(){
        System.out.println("Uruchamiasz silnik Twojego samochodu");
    }
    public void sell(){
        System.out.println("Sprzedajesz samochód");
    }
    public void accelerate(){
        speed += acceleration;
        System.out.println("Zwiększasz prędkosc o 2 m/s");
    }






}
