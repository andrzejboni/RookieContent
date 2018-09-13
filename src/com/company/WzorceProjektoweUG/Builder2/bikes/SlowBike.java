package com.company.WzorceProjektoweUG.Builder2.bikes;

import com.company.WzorceProjektoweUG.Builder2.IBikeBuilder;
import com.company.WzorceProjektoweUG.Builder2.bike_parts.Bike;
import com.company.WzorceProjektoweUG.Builder2.bike_parts.Frame;
import com.company.WzorceProjektoweUG.Builder2.bike_parts.SteeringWheel;
import com.company.WzorceProjektoweUG.Builder2.bike_parts.Wheels;


public class SlowBike implements IBikeBuilder {

    private Bike bike;

    public SlowBike() {
        this.bike = new Bike();
    }

    @Override
    public void buildFrame() {
        Frame frame = new Frame("The most slow frame ever.");
        bike.setFrame(frame);
    }

    @Override
    public void buildWheels() {
        Wheels wheels = new Wheels("2 bad wheels for you.");
        bike.setWheels(wheels);
    }

    @Override
    public void buildSteergingWheel() {
        SteeringWheel steeringWheel = new SteeringWheel("Steeringwheel, is that good for bike anyway ?");
        bike.setSteeringWheel(steeringWheel);
    }

    @Override
    public Bike getBike() {
        return bike;
    }
}
