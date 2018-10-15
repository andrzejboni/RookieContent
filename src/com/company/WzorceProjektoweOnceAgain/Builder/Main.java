package com.company.WzorceProjektoweOnceAgain.Builder;

public class Main {
    public static void main(String[] args) {

        HouseBuilder builder = new HouseBuilder();

        builder.setAdress("Psie Pole 88");
        House house = builder.build();

        System.out.println(house.getAdress());

    }
}
