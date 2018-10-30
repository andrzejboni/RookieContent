package com.company.WzorceProjektoweOnceAgain.FabrykaAbstrakcyjna2Podejscie;

public class CPU_i5 implements CPU{
    Integer cores = 2;
    String companyName = "Intel";
    String modelName = "i5";
    Integer frequency = 2;
    Integer manufacturingTechnology = 14; // nm
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
