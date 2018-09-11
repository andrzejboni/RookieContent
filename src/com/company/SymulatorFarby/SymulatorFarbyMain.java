package com.company.SymulatorFarby;

public class SymulatorFarbyMain {
    public static void main(String[] args) {

        Figura[] figura = new Figura[4];
        double pojemnikNaFarbe = 50;


        Figura figura1= new Kwadrat(2,4);
        Figura figura2= new Koło(8);
        Figura figura3= new Trapez(12,8,5);
        Figura figura4= new Koło(20);

        figura[0] = figura1;
        figura[1] = figura2;
        figura[2] = figura3;
        figura[3] = figura4;

        System.out.println("Potrzbujesz " + SymulatorFarby.obliczZapotrzebowanieNaFarbe(figura, pojemnikNaFarbe) + " puszek farby aby pomalować całą powierzchnię " );


    }
}
