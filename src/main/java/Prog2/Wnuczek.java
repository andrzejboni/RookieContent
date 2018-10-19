package Prog2;

public class Wnuczek extends Babcia {
    int portfelWnuczka =0;

    public Wnuczek(int pieniadzeWskarpecie) {
        super(pieniadzeWskarpecie);
    }

    public int zakosBabciPieniadze(int ileZakosic) { // Ile zakosiłeś
        setPieniadzeWskarpecie(super.pieniadzeWskarpecie - ileZakosic);
        this.portfelWnuczka = getPieniadzeWskarpecie(ileZakosic);
        return portfelWnuczka;
    }

}
