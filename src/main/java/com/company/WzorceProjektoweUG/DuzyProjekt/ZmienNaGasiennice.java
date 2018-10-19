package com.company.WzorceProjektoweUG.DuzyProjekt;

public class ZmienNaGasiennice implements ZmianaNaped {


    @Override
    public void zmienNaped(Robot r1) {
        r1.setNaped("gasiennice");
        r1.setNapedIlosc(2);
    }
}
