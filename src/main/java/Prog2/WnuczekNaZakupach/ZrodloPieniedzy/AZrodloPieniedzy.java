package Prog2.WnuczekNaZakupach.ZrodloPieniedzy;

import Prog2.WnuczekNaZakupach.FormaPlatnosci;

import java.util.ArrayList;
import java.util.Collection;

public abstract class AZrodloPieniedzy implements ZrodloPieniedzy {
    private int kwota;

    private FormaPlatnosci formaPlatnosci;


    private Collection<ZrodloPieniedzy> zrodlaPieniedzy = new ArrayList<ZrodloPieniedzy>();


    public AZrodloPieniedzy (int kwota){
        this.kwota = kwota;

    }

    public FormaPlatnosci getFormaPlatnosci()
    {return formaPlatnosci;}
    public int getKwota(){return kwota;}

    public Collection<ZrodloPieniedzy> getZrodlaPieniedzy(){return zrodlaPieniedzy;}
}
