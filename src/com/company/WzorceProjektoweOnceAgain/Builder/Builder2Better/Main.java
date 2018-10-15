package com.company.WzorceProjektoweOnceAgain.Builder.Builder2Better;

import com.company.WzorceProjektoweOnceAgain.Builder.House;
import com.company.WzorceProjektoweOnceAgain.Builder.HouseBuilder;

public class Main {
    public static void main(String[] args) {

        HouseBuilder builder = new HouseBuilder();
        House house = builder.build();



        house = new HouseBuilderFluentApi().setArea(25.0f).setGarage(true).build();
        System.out.println(house.getArea());
//        System.out.println(house.getGarageArea());

    }
}
