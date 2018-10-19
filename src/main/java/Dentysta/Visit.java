package Dentysta;

public class Visit {
    Pacjent pacjent;
    String data;
    TypLekarza typLekarza;
    int cenaWizyty;


    public void dodajWizyte (){}
    public void usunWizyte (){}

    public Visit(Pacjent pacjent, String data, TypLekarza typLekarza, int cenaWizyty) {
        this.pacjent = pacjent;
        this.data = data;
        this.typLekarza = typLekarza;
        this.cenaWizyty = cenaWizyty;
    }

    @Override
    public String toString() {
        return  pacjent +"%" + data +"%" + typLekarza +"%" + cenaWizyty+"%";
    }
}
