package com.company.WzorceProjektoweOnceAgain.Builder.BuilderAnotherExample;

public class WashMachineBuilder {

    private WashMachine result;
    public WashMachineBuilder() {


        result = new WashMachine();
    }


    public void setResult(WashMachine result) {
        this.result = result;
    }

    public WashMachineBuilder setCena(double cena) {
        result.setCena(cena);
        return this;
    }

    public WashMachineBuilder setIloscObrotow(int iloscObrotow) {
        result.setIloscObrotow(iloscObrotow);
        return this;
    }

    public WashMachineBuilder setTemperaturaWody(int temperaturaWody) {
        result.setTemperaturaWody(temperaturaWody);
        return this;
    }

    public WashMachineBuilder setMarka(String marka) {
        result.setMarka(marka);
        return this;
    }

    public WashMachineBuilder setWaga(double waga) {
        result.setWaga(waga);
        return this;
    }

    public WashMachineBuilder setIloscProgramowPrania(int iloscProgramowPrania) {
        result.setIloscProgramowPrania(iloscProgramowPrania);
        return this;
    }

    public WashMachineBuilder setIloscWsadu(int iloscWsadu) {
        result.setIloscWsadu(iloscWsadu);
        return this;
    }


    public WashMachine build(){
        return result;
    }

}
