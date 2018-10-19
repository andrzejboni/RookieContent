package Prog2;

public class Wnuczek extends Babcia {
    int portfelWnuczka =0;

    // API czyli to jest sposób za pomocą możesz sie kompunikować, czyli skad bierzesz pieniadze itp


    public Wnuczek(int pieniadzeWskarpecie) {
        super(pieniadzeWskarpecie);
    }


    public int zakosBabciPieniadze(int ileZakosic) { // Ile zakosiłeś
        setPieniadzeWskarpecie(super.pieniadzeWskarpecie - ileZakosic);
        this.portfelWnuczka = getPieniadzeWskarpecie(ileZakosic);
        return portfelWnuczka;
    }

    @Override
    public int dajWnuczkowiKase(int ileKasyDlaWnuczka) {
        setPortfelWnuczka(super.dajWnuczkowiKase(ileKasyDlaWnuczka));
        return ileKasyDlaWnuczka;
    }

    public int getPortfelWnuczka() {
        return portfelWnuczka;
    }

    public void setPortfelWnuczka(int portfelWnuczka) {
        this.portfelWnuczka = portfelWnuczka;
    }
}
