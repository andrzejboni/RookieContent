package TorGokartowy;

public enum Znizka {

    BRAK(1),
    SZKOLNA(0.3),
    STUDENCKA(0.51),
    SENIOR(0.8);

    private double znizka;

    Znizka(double znizka) {
        this.znizka = znizka;
    }
}
