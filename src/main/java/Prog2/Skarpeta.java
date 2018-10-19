package Prog2;

public class Skarpeta {
    int pieniadzeWskarpecie;

    public int getPieniadzeWskarpecie(int danePieniadze) {
        return pieniadzeWskarpecie -= danePieniadze;
    }

    public void setPieniadzeWskarpecie(int pieniadzeWskarpecie) {
        this.pieniadzeWskarpecie = pieniadzeWskarpecie;
    }

    public Skarpeta(int pieniadzeWskarpecie) {
        this.pieniadzeWskarpecie = pieniadzeWskarpecie;
    }
}
