package com.company.WzorceProjektoweUG.Adapter;


public class FenderGitaraKlasyczna implements GitaraKlasyczna {

    @Override
    public void zagrajSolo() {
        System.out.println("Jest akustyczne, liryczne solo");
    }

    @Override
    public void nastrojGitare() {
        System.out.println("D A D G B E- strojenie dla gitary akustycznej");
    }
}
