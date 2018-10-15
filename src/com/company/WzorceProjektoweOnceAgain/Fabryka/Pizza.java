package com.company.WzorceProjektoweOnceAgain.Fabryka;

public class Pizza {
    private String name;
    private float radius;
    private float price;
    private float thickness;


    public Pizza(String name, float radius, float price, float thickness) {
        this.name = name;
        this.radius = radius;
        this.price = price;
        this.thickness = thickness;
    }

    public String getName() {
        return name;
    }

    public float getRadius() {
        return radius;
    }

    public float getPrice() {
        return price;
    }

    public float getThickness() {
        return thickness;
    }
}
