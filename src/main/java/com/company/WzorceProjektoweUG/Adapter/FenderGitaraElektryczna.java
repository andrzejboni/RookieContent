package com.company.WzorceProjektoweUG.Adapter;

public class FenderGitaraElektryczna implements GitaraElektryczna {

    @Override
    public void zagrajSolo() {
        System.out.println("Prawdziwe, najmocniejsze heavymetalowe solo!");
    }

    @Override
    public void nastrojGitare() {
        System.out.println("E A D G B E- dla gitary elektrycznej");
    }
}
