package com.company.WzorceProjektoweOnceAgain.Fabryka;

public class Pizza {
    private String name;
    private double radius;
    private double price;
    private double thickness;


    public Pizza(String name, double radius, double price, double thickness) {
        this.name = name;
        this.radius = radius;
        this.price = price;
        this.thickness = thickness;
    }

    public String getName() {
        return name;
    }

    public double getRadius() {
        return radius;
    }

    public double getPrice() {
        return price;
    }

    public double getThickness() {
        return thickness;
    }
}
