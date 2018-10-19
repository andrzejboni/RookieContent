package com.company.BiuroStatycznosc;

public class BiuroMain {
    public static void main(String[] args) {   // Alogrytm działa klasycznie. Klasyczny jest ten algol klasyczny, jak ja perdole.
        int licznik =0;

        Pracownik p1 = new Pracownik();
        Pracownik p2 = new Pracownik();
        Pracownik p3 = new Pracownik();
        Pracownik p4 = new Pracownik();



        p1.wejdzDoBiura();
        p2.wejdzDoBiura();
        p3.wejdzDoBiura();
        p1.wejdzDoBiura();

        p1.wyjdzZbiura();
        p1.wyjdzZbiura();
        p2.wyjdzZbiura();
        p3.wyjdzZbiura();

    }

}
