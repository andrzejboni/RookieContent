package com.company.WzorceProjektoweOnceAgain.FabrykaAbstrakcyjna2Podejscie;

public interface GPU extends ComputerPart {
    GPU getMemory(Float flo);

    String companyName = "";
    String modelName = "";
    Integer memory = 0;


    String companyName();

    String modelName();

    Integer memory();
}
