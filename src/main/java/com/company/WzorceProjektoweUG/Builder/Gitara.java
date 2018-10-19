
package com.company.WzorceProjektoweUG.Builder;

public class Gitara {
    private Struny struny;
    private KolorGitary kolor;
    private Drewno drewno;


    public Struny getStruny() {
        return struny;
    }
    public void setStruny(Struny struny) {
        this.struny = struny;
    }

    public KolorGitary getKolorGitary() {
        return kolor;
    }
    public void setKolor(KolorGitary kolor) {
        this.kolor= kolor;
    }

    public Drewno getDrewno() {
        return drewno;
    }
    public void setDrewno(Drewno drewno) {
        this.drewno = drewno;
    }

    @Override
    public String toString() {
        return struny + "" + kolor + "" + drewno;
    }
}