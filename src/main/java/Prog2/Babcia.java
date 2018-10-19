package Prog2;

public class Babcia extends Skarpeta {
    public Babcia(int pieniadzeWskarpecie) {
        super(pieniadzeWskarpecie);
    }

    public void krzyczNaWnuczka(){
        System.out.println("Stasiu, jesteś złym wnuczkiem i podbierasz babci pieniadze ze skarpety!");
    }

    public void dajWnuczkowiKase(int ileKasyDlaWnuczka){
        setPieniadzeWskarpecie(super.pieniadzeWskarpecie - ileKasyDlaWnuczka);
        int pobranaKasaDlaWnuczka = getPieniadzeWskarpecie(ileKasyDlaWnuczka);
    }


}
