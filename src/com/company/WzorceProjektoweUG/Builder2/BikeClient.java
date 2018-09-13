package com.company.WzorceProjektoweUG.Builder2;


import com.company.WzorceProjektoweUG.Builder2.bike_parts.Bike;
import com.company.WzorceProjektoweUG.Builder2.bikes.SlowBike;

public class BikeClient {

    public static void main(String[] args) {
        IBikeBuilder bikeBuilder = new SlowBike();
        BikeDirector bikeDirector = new BikeDirector(bikeBuilder);
        bikeDirector.makeBike();
        Bike bike = bikeDirector.getBike();
        System.out.print(bike);
    }
}
