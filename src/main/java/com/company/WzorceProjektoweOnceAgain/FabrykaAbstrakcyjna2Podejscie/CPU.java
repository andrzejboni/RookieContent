package com.company.WzorceProjektoweOnceAgain.FabrykaAbstrakcyjna2Podejscie;

public interface CPU extends ComputerPart {
    Integer getCores(Integer integer);

    String companyName();
    String modelName();
    Integer frequency();
    Integer manufacturingTechnology();


}
