package com.company.TypyGeneryczne;

public class TypyGeneryczneMain {
    public static void main(String[] args) {

        Sportowiec Rysiek = new Piłkarz();
        Sportowiec Ignac = new Tenisista();
        Sportowiec Zenek = new Lekkoatleta();

        Sportowiec Marek = new Tenisista();


        Trener<Piłkarz> Piotrek = new Trener(Rysiek);
        Trener<Lekkoatleta> Krzysiek = new Trener(Ignac);
        Trener<Tenisista> Mariusz = new Trener(Zenek);


        Piotrek.prowadzTrening();
        Piotrek.dajSumplementy();

        Krzysiek.prowadzTrening();
        Krzysiek.dajSumplementy();

        Mariusz.prowadzTrening();
        Mariusz.dajSumplementy();


        PsychologSportowy<Lekkoatleta>  Ronald = new PsychologSportowy(Zenek); // Oddzielny psycholog sportowy dla lekkoatlety i dla teniististy
        PsychologSportowy<Tenisista> Bogdan = new PsychologSportowy(Ignac);


        Ronald.wesprzyjDuchowo();
        Bogdan.wesprzyjDuchowo();

    }
}
