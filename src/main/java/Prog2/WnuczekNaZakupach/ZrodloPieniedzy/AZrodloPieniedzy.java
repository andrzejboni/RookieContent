package Prog2.WnuczekNaZakupach.ZrodloPieniedzy;

public abstract class AZrodloPieniedzy implements ZrodloPieniedzy {
    private int kwota;


    public AZrodloPieniedzy (int kwota){
        this.kwota = kwota;
    }

    public int getKwota(){return kwota;}
}
