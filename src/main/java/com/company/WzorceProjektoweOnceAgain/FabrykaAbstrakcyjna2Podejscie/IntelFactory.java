package com.company.WzorceProjektoweOnceAgain.FabrykaAbstrakcyjna2Podejscie;

public class IntelFactory implements ComputerFactory {



    @Override
    public CPU buildCPU() {
        return new CPU_i5(4, "intel", "i5CPU", 2,12,"Intel");
    }

    @Override
    public GPU buildGPU() {
        return new GPU_AMD("AMD","GeAMD",5);
    }
}
