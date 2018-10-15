package com.company.WzorceProjektoweOnceAgain.Builder;

public class HouseBuilder {
    private float area;
    private float price;
    private int floor;
    private int roomsCount;
    private String adress;
    private int buildYear;
    private int age;
    private boolean hasBalcony;
    private boolean hasPool;
    private float garageArea;
    private float height;


    public House build() {

        return new House(area,price,floor,roomsCount,adress,buildYear,age,hasBalcony,hasPool,garageArea,height);
    }

    public void setDefaultHouseWithoutGarage(){
        this.setArea(16.0f);
        this.setGarageArea(0.0f);
        this.setArea(16.0f);
    }


    public void setArea(float area) {
        this.area = area;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public void setRoomsCount(int roomsCount) {
        this.roomsCount = roomsCount;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setBuildYear(int buildYear) {
        this.buildYear = buildYear;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHasBalcony(boolean hasBalcony) {
        this.hasBalcony = hasBalcony;
    }

    public void setHasPool(boolean hasPool) {
        this.hasPool = hasPool;
    }

    public void setGarageArea(float garageArea) {
        this.garageArea = garageArea;
    }

    public void setHeight(float height) {
        this.height = height;
    }



}
