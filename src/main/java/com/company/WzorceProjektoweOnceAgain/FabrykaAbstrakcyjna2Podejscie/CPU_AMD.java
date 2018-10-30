package com.company.WzorceProjektoweOnceAgain.FabrykaAbstrakcyjna2Podejscie;

public class CPU_AMD implements CPU{
    Integer cores = 5;
    String companyName = "AMD";
    String modelName = "Y220";
    Integer frequency = 1;
    Integer manufacturingTechnology = 13; // nm
    String computerName = "AMDY220";

    public CPU_AMD(Integer cores, String companyName, String modelName, Integer frequency, Integer manufacturingTechnology, String computerName) {
        this.cores = cores;
        this.companyName = companyName;
        this.modelName = modelName;
        this.frequency = frequency;
        this.manufacturingTechnology = manufacturingTechnology;
        this.computerName = computerName;
    }

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
