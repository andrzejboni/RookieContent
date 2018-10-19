package com.company.WzorceProjektoweOnceAgain.Builder.Builder2Better;

//import com.company.WzorceProjektoweOnceAgain.Builder.House;

import com.company.WzorceProjektoweOnceAgain.Builder.House;
import com.company.WzorceProjektoweOnceAgain.Builder.HouseBuilder;

public class HouseBuilderFluentApi {

    private House result;

    public HouseBuilderFluentApi() {
        result = new House();
    }

    public HouseBuilderFluentApi setArea(double area) {
        result.setArea(area);
        return this;
    }

    public HouseBuilderFluentApi setGarage(boolean hasGarage) {
        result.setFloor(5);
        return this;
    }

    public House build(){
        return result;
    }

}
