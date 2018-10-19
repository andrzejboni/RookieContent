package Prog2;

public class Kino extends Wnuczek {
    int kosztKina = 35; // złotych

    public Kino(int pieniadzeWskarpecie) {
        super(pieniadzeWskarpecie);
    }

    public void pojdzDoKina(){
        portfelWnuczka = portfelWnuczka- kosztKina;
    }
}
