package com.company.WzorceProjektoweUG.Builder2;


import com.company.WzorceProjektoweUG.Builder2.bike_parts.Bike;

public class BikeDirector {

    private IBikeBuilder bikeBuilder;

    public BikeDirector(IBikeBuilder bikeBuilder) {
        this.bikeBuilder = bikeBuilder;
    }

    public void makeBike() {
        bikeBuilder.buildFrame();
        bikeBuilder.buildSteergingWheel();
        bikeBuilder.buildWheels();
    }

    public Bike getBike() {
        return bikeBuilder.getBike();
    }
}
