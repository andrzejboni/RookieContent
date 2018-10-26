package RejstracjaUzytkownikowZadanie;

import java.util.ArrayList;
import java.util.List;

import static RejstracjaUzytkownikowZadanie.User.listaUserow;

public class Main {

    public static void main(String[] args) {

        User u1 = new User("Robalt", "Zuch", "aaa","111");
        User u2 = new User("Ygrek", "Much", "bbb","222");
        User u3 = new User("Zych", "Cuch", "ccc","333");
        User u4 = new User("Pych", "Uh", "ddd","444");
        User u5 = new User("Mych", "Puch", "eee","555");

        listaUserow.add(u1);
        listaUserow.add(u2);
        listaUserow.add(u3);
        listaUserow.add(u4);
        listaUserow.add(u5);


        User user = new User();
        user.setUp();

        SaveToFile saveToFile = new SaveToFile();
        saveToFile.saveToFile(listaUserow);


    }
}
