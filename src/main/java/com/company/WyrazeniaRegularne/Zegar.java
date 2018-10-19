package com.company.WyrazeniaRegularne;

public class Zegar {

    public final String nazwa;
    public final double wielkoscTarczy;
    public final double cena;
    public final double trwaloscNaBaterii;
    public final String kolorTarczy;
    public final String kolorRamy;
    public final boolean czyKwarcowy;
    public final boolean liczbyRzymskieTrueArabskieFalse;



    public Zegar(String nazwa, double wielkoscTarczy, double cena, double trwaloscNaBaterii, String kolorTarczy, String kolorRamy, boolean czyKwarcowy, boolean liczbyRzymskieTrueArabskieFalse) {
        this.nazwa = nazwa;
        this.wielkoscTarczy = wielkoscTarczy;
        this.cena = cena;
        this.trwaloscNaBaterii = trwaloscNaBaterii;
        this.kolorTarczy = kolorTarczy;
        this.kolorRamy = kolorRamy;
        this.czyKwarcowy = czyKwarcowy;
        this.liczbyRzymskieTrueArabskieFalse = liczbyRzymskieTrueArabskieFalse;

    }
}
