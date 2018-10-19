package Prog2;

public class Kino extends Wnuczek {
    int kosztKina = 35; // złotych

    public Kino(int pieniadzeWskarpecie) { // to moze byc niepotrdzebme
        super(pieniadzeWskarpecie);
    }


    @Override
    public int getPortfelWnuczka() {
        return super.getPortfelWnuczka();
    }

    public void pojdzNaFilmDoKina(){
        setPortfelWnuczka(getPortfelWnuczka()-kosztKina);
    }
}
