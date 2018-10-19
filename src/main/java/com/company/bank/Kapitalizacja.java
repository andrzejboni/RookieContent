package com.company.bank;

public enum Kapitalizacja {
    MIESIECZNA(12),
    KWARTALNA(4),
    ROCZNA(1);

    int iloscKapitalizacjiwRoku;

    Kapitalizacja(int iloscKapitalizajiwRoku) {
        this.iloscKapitalizacjiwRoku = iloscKapitalizajiwRoku;
    }


}
