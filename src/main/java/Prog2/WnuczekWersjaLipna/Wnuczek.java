package Prog2.WnuczekWersjaLipna;

import Prog2.Consumer.Portfel;

public class Wnuczek extends Babcia implements Portfel {
    int portfelWnuczka =0;

    int kasa;

    // API czyli to jest sposób za pomocą możesz sie kompunikować, czyli skad bierzesz pieniadze itp


    public Wnuczek(int pieniadzeWskarpecie) {
        super(pieniadzeWskarpecie);
    }

//
//    public int zakosBabciPieniadze(int ileZakosic) { // Ile zakosiłeś
//        setPieniadzeWskarpecie(super.pieniadzeWskarpecie - ileZakosic);
//        this.portfelWnuczka = getPieniadzeWskarpecie(ileZakosic);
//        return portfelWnuczka;
//    }
//
//    @Override
//    public int dajWnuczkowiKase(int ileKasyDlaWnuczka) {
//        setPortfelWnuczka(super.dajWnuczkowiKase(ileKasyDlaWnuczka));
//        return ileKasyDlaWnuczka;
//    }
//
//    public int getPortfelWnuczka() {
//        return portfelWnuczka;
//    }
//
//    public void setPortfelWnuczka(int portfelWnuczka) {
//        this.portfelWnuczka = portfelWnuczka;
//    }


    @Override
    public void dodajKase(int ileWplacic) {
        this.kasa += ileWplacic;

    }
    @Override
    public boolean wyciagnijKase(int ileWyciagnac) {
        if (this.kasa >= ileWyciagnac) {
            return true;
        } else {
            return false;
        }
    }
    @Override
    public void sprawdzStan() {
        System.out.println("Stan portfela to: " + this.kasa + " zł ");
    }

    @Override
    public int getKwota() {
        return kasa;
    }


}
