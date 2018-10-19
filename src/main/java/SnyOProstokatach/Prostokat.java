package SnyOProstokatach;

public class Prostokat implements Figura {
    int a = 0;
    int b = 0;
    int obwod = 0;


    String wzor = "2a+2b";

    @Override
    public double obliczObwod() {
        obwod = (2*this.a)+(2*this.b);
        return obwod;
    }

    public Prostokat(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public String getWzor() {
        return this.wzor;
    }

}
