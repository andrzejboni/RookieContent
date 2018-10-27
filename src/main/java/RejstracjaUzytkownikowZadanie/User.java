package RejstracjaUzytkownikowZadanie;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class User {
    private String imie;
    private String nazwisko;
    private String haslo;
    private String login;

    public void setUp(){

    }

    public User() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(login, user.login);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login);
    }




    @Override
    public String toString() {
        return imie +";" + nazwisko +
                ";" + haslo +
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
