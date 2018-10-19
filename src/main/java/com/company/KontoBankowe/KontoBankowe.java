package com.company.KontoBankowe;

public class KontoBankowe {

    public long numerKonta;
    private int stanKonta;

    public void wyswietlStanKonta() {
        System.out.println("Stan konta " + numerKonta +" w .†:AndyBank:†. to " + stanKonta + " zł ");
    }

    private void wplacSrodki(int wplacanaKwota) {
        stanKonta = stanKonta + wplacanaKwota;
    }


    private int pobierzSrodki(int wyplacanaKwota) {
        if (wyplacanaKwota < stanKonta) {
            stanKonta = stanKonta - wyplacanaKwota;
        }
//        else {
//            System.out.println("Błąd! Nie możesz wypłacić więcej niż posiadasz!");
//        }
        return stanKonta;
    }


    protected void przelejSrodki(int kwotaDoPrzelania, KontoBankowe konto ){
        this.stanKonta = stanKonta- kwotaDoPrzelania;
        konto.stanKonta = konto.stanKonta+kwotaDoPrzelania;
        System.out.println("~~ Dokonano przelewu srodkow " + kwotaDoPrzelania + " zł z konta " + this.numerKonta + " na numer konta " + konto.numerKonta);

    }


    KontoBankowe(long numerKonta, int stanKonta) {
        this.numerKonta = numerKonta;
        this.stanKonta = stanKonta;

    }


}
