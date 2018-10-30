package com.company.WzorceProjektoweOnceAgain.FabrykaAbstrakcyjna2Podejscie;

public class GPU_AMD implements GPU {

    String companyName= "AMD GPU";
    String modelName = "AMD RAZR";
    Integer memory = 8; // gb albo mb, kto co chce kto czego pragnie

    public GPU_AMD(String companyName, String modelName, Integer memory) {
        this.companyName = companyName;
        this.modelName = modelName;
        this.memory = memory;
    }

    @Override
    public GPU getMemory(Float flo) {
        return null;
    }

    @Override
    public String companyName() {
        return null;
    }

    @Override
    public String modelName() {
        return null;
    }

    @Override
    public Integer memory() {
        return null;
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
