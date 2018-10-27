package RejstracjaUzytkownikowZadanie;

import java.util.ArrayList;
import java.util.List;


import static RejstracjaUzytkownikowZadanie.UserManager.listaUserow;
import static RejstracjaUzytkownikowZadanie.UserManager.usersToValidate;

public class Main {

    public static void main(String[] args) {

        User u1 = new User("Robalt", "Zuch", "aaa","111");
        User u2 = new User("Ygrek", "Much", "bbb","222");
        User u3 = new User("Zych", "Cuch", "ccc","333");
        User u4 = new User("Pych", "Uh", "ddd","444");
        User u5 = new User("Mych", "Puch", "eee","555");

        usersToValidate.add(u1);
        usersToValidate.add(u2);
        usersToValidate.add(u3);
        usersToValidate.add(u4);
        usersToValidate.add(u5);







//
//        if (usersToValidate.contains(u1)){
//            System.out.println("DZIAŁA");
//        }



//
//        User user = new User();
//        user.setUp();
//
//        SaveToFile saveToFile = new SaveToFile();
//        saveToFile.saveToFile(listaUserow);


    }
}
