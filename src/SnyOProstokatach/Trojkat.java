package SnyOProstokatach;

public class Trojkat implements Figura{
    int a = 0;
    int b = 0;
    int c = 0;
    int obwod = 0;

    String wzor = "a+b+c";


    @Override
    public double obliczObwod() {
        obwod = a+b+c;
        return obwod;
    }

    public Trojkat(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public String getWzor() {
        return this.wzor;
    }}
