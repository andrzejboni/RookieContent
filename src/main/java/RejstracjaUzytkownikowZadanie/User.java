package RejstracjaUzytkownikowZadanie;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String imie;
    private String nazwisko;
    private String haslo;
    private String login;

    public static List<User> listaUserow = new ArrayList<>();
    public static List<User> listaUserowDoWalidacji = new ArrayList<>();

    public void setUp(){

    }

    public User() {
    }

    @Override
    public String toString() {
        return imie +";" + nazwisko + ";"+
                ";" + haslo + ";" +
                ";" + login;
    }

    public User(String imie, String nazwisko, String haslo, String login) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.haslo = haslo;
        this.login = login;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getHaslo() {
        return haslo;
    }

    public void setHaslo(String haslo) {
        this.haslo = haslo;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
}
