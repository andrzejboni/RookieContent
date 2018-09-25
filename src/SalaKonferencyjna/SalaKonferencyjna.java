package SalaKonferencyjna;

public class SalaKonferencyjna {

    int numerSali;
    boolean stanSali;
    int pojemnoscSali;
    double cenaSali;

    public SalaKonferencyjna(int numerSali, boolean stanSali, int pojemnoscSali, double cenaSali) {
        this.numerSali = numerSali;
        this.stanSali = stanSali;
        this.pojemnoscSali = pojemnoscSali;
        this.cenaSali = cenaSali;
    }

    @Override
    public String toString() {
        return "SalaKonferencyjna{" +
                "numerSali=" + numerSali +
                ", stanSali=" + stanSali +
                ", pojemnoscSali=" + pojemnoscSali +
                ", cenaSali=" + cenaSali +
                '}';
    }

    public int getNumerSali() {
        return numerSali;
    }

    public void setNumerSali(int numerSali) {
        this.numerSali = numerSali;
    }

    public boolean isStanSali() {
        return stanSali;
    }

    public void setStanSali(boolean stanSali) {
        this.stanSali = stanSali;
    }

    public int getPojemnoscSali() {
        return pojemnoscSali;
    }

    public void setPojemnoscSali(int pojemnoscSali) {
        this.pojemnoscSali = pojemnoscSali;
    }

    public double getCenaSali() {
        return cenaSali;
    }

    public void setCenaSali(double cenaSali) {
        this.cenaSali = cenaSali;
    }
}
