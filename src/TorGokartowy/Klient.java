package TorGokartowy;

public class Klient {
    String imie;
    String nazwisko;
    int pesel;
    Znizka znizka;

    public Klient(String imie, String nazwisko, int pesel, Znizka znizka) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.pesel = pesel;
        this.znizka = znizka;
    }
}
