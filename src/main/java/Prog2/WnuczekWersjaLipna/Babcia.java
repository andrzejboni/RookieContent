package Prog2.WnuczekWersjaLipna;

public class Babcia extends Skarpeta {
    public Babcia(int pieniadzeWskarpecie) {
        super(pieniadzeWskarpecie);
    }

    public void krzyczNaWnuczka(){
        System.out.println("Stasiu, jesteś złym wnuczkiem i podbierasz babci pieniadze ze skarpety!");
    }

    public int dajWnuczkowiKase(int ileKasyDlaWnuczka){
        setPieniadzeWskarpecie(super.pieniadzeWskarpecie - ileKasyDlaWnuczka);
//        int pobranaKasaDlaWnuczka = getPieniadzeWskarpecie(ileKasyDlaWnuczka);
        return ileKasyDlaWnuczka;
    }


}
