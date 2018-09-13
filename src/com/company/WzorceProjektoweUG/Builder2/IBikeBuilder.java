package com.company.WzorceProjektoweUG.Builder2;


import com.company.WzorceProjektoweUG.Builder2.bike_parts.Bike;

public interface IBikeBuilder {
    void buildFrame();

    void buildWheels();

    void buildSteergingWheel();

    Bike getBike();
}


