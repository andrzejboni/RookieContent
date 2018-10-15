package com.company.WzorceProjektoweOnceAgain.Builder;

public class House {

    private double area;
    private double price;
    private int floor;
    private int roomsCount;
    private String adress;
    private int buildYear;
    private int age;
    private boolean hasBalcony;
    private boolean hasPool;
    private boolean hasGarage;
    private double garageArea;
    private double height;

    public House(){}

    public House(double area, double price, int floor, int roomsCount, String adress, int buildYear, int age, boolean hasBalcony, boolean hasPool, double garageArea, double height) {
        this.area = area;
        this.price = price;
        this.floor = floor;
        this.roomsCount = roomsCount;
        this.adress = adress;
        this.buildYear = buildYear;
        this.age = age;
        this.hasBalcony = hasBalcony;
        this.hasPool = hasPool;
        this.garageArea = garageArea;
        this.height = height;
    }


    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getRoomsCount() {
        return roomsCount;
    }

    public void setRoomsCount(int roomsCount) {
        this.roomsCount = roomsCount;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getBuildYear() {
        return buildYear;
    }

    public void setBuildYear(int buildYear) {
        this.buildYear = buildYear;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isHasBalcony() {
        return hasBalcony;
    }

    public void setHasBalcony(boolean hasBalcony) {
        this.hasBalcony = hasBalcony;
    }

    public boolean isHasPool() {
        return hasPool;
    }

    public void setHasPool(boolean hasPool) {
        this.hasPool = hasPool;
    }

    public double getGarageArea() {
        return garageArea;
    }

    public void setGarageArea(double garageArea) {
        this.garageArea = garageArea;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
