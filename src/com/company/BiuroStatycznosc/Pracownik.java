package com.company.BiuroStatycznosc;

import static com.company.BiuroStatycznosc.Biuro.liczbaOsobWewnatrz;

public class Pracownik {
    public static int licznik = 0; // zmienna static jest dla całego programu, dostępna ogólnie .
    boolean czyTypWszedl = false; // zmienna dla konkretnego obieku klasy Pracownik

    public void wejdzDoBiura() {
        if (czyTypWszedl) {
            System.out.println("Typ wszedł do biura! Nie może wejsc do niego po raz wtóry!");
        } else {
            liczbaOsobWewnatrz++;
            System.out.println("Dodano typa, teraz jest w biurze tylu typów " + liczbaOsobWewnatrz);
            czyTypWszedl = true;
        }

    }

    public void wyjdzZbiura() {

        if (czyTypWszedl) {
            liczbaOsobWewnatrz--;
            System.out.println("Typers wyszedł, teraz jest w biurze tylu typów " + liczbaOsobWewnatrz);
            czyTypWszedl = false;
        } else {
            System.out.println("Typ wyszedł już z biura!@@@@@ Nie może wyjść z niego po raz wtóry!");
        }
    }
}
