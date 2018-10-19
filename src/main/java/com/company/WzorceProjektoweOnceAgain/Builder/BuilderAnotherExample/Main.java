package com.company.WzorceProjektoweOnceAgain.Builder.BuilderAnotherExample;

public class Main {
    public static void main(String[] args) {


        WashMachine washMachine1 = new WashMachine();
        WashMachine washMachine2 = new WashMachine();
        WashMachine washMachine3 = new WashMachine();
        WashMachine washMachine4 = new WashMachine();


        washMachine1 = new WashMachineBuilder()
                .setCena(999)
                .setIloscObrotow(1000)
                .setTemperaturaWody(90)
                .setMarka("Middle-Middle(M-M)")
                .setWaga(45.0)
                .setIloscProgramowPrania(12)
                .setIloscWsadu(5).build();



        washMachine2 = new WashMachineBuilder()
                .setCena(1800)
                .setIloscObrotow(1400)
                .setTemperaturaWody(95)
                .setMarka("PrimaSort($PS$)")
                .setWaga(60.0)
                .setIloscProgramowPrania(29)
                .setIloscWsadu(8).build();


        washMachine3 = new WashMachineBuilder()
                .setCena(699)
                .setIloscObrotow(600)
                .setTemperaturaWody(60)
                .setMarka("FromPoorToPoor(FPTP)")
                .setWaga(55.0)
                .setIloscProgramowPrania(4)
                .setIloscWsadu(4).build();


        washMachine4 = new WashMachineBuilder()
                .setCena(45750)
                .setIloscObrotow(2200)
                .setTemperaturaWody(140)
                .setMarka("D.R.E.Wash-Only for Rapers and Hip-Hop PP (D.R.EWOfRaHHP) ")
                .setWaga(70.0)
                .setIloscProgramowPrania(112)
                .setIloscWsadu(15).build();



        System.out.println(washMachine3.toString());
        System.out.println(washMachine1.toString());
        System.out.println(washMachine2.toString());
        System.out.println(washMachine4.toString());

//        System.out.println(washMachine1.getClass());
//        System.out.println(house.getGarageArea());

    }
}
