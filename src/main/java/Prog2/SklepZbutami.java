package Prog2;

public class SklepZbutami extends Wnuczek {
    int kosztButow = 40; // złotych

    public SklepZbutami(int pieniadzeWskarpecie) {
        super(pieniadzeWskarpecie);
    }

    public void kupButy(){
        portfelWnuczka = portfelWnuczka- kosztButow;
    }

}
