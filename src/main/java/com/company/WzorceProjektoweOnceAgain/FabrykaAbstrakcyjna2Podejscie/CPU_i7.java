package com.company.WzorceProjektoweOnceAgain.FabrykaAbstrakcyjna2Podejscie;

public class CPU_i7 implements CPU {
    Integer cores = 4;
    String companyName = "Intel";
    String modelName = "i7";
    Integer frequency = 3;
    Integer manufacturingTechnology = 12; // nm
    String computerName = "intel";

    @Override
    public Integer getCores(Integer integer) {
        return this.cores;
    }

    @Override
    public String companyName() {
        return this.companyName;
    }

    @Override
    public String modelName() {
        return this.modelName;
    }

    @Override
    public Integer frequency() {
        return this.frequency;
    }

    @Override
    public Integer manufacturingTechnology() {
        return this.manufacturingTechnology;
    }

    @Override
    public ComputerPart getName() {
        return null;
    }

    @Override
    public ComputerPart getManufacturer() {
        return null;
    }
}
