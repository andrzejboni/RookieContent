package RejestracjaUzytkownikowZadanie;

import RejstracjaUzytkownikowZadanie.Enums.LogowanieEnum;
import RejstracjaUzytkownikowZadanie.User;
import RejstracjaUzytkownikowZadanie.UserManager;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Optional;

import static RejstracjaUzytkownikowZadanie.UserManager.listaUserow;

public class UserManagerLookUpMethodTest {

    UserManager userManager;
    User u1;
    User u2;
    User u3;
    User u4;
    User u5;
    User u6;
    User u7;

    @Before
    public void setUp() {
        userManager = new UserManager();

        u1 = new User("Zuch", "", "aaa", "111");
        u2 = new User("Ygrek", "", "bbb", "222");
        u3 = new User("", "", "", "");
        u4 = new User("Pych", "Uh", "ddd", "444");
        u5 = new User("Uch", "Puch", "", "555");
        u6 = new User("Mych", "Puch", "999", "555");
        u7 = new User("Zuch", "Belfort", "aaa", "999");

        listaUserow.add(u1);
        listaUserow.add(u2);
        listaUserow.add(u3);
        listaUserow.add(u4);
        listaUserow.add(u5);
        listaUserow.add(u6);
        listaUserow.add(u7);

    }


    @Test
    public void lookUpMethodTestSuccess() {
        Optional<User> correctAnswer = Optional.ofNullable(u7);
        String login = "999";
        Assert.assertEquals(correctAnswer, userManager.lookup(login));
    }


    @Test
    public void lookUpMethodTestFailure() {
        Optional<User> correctAnswer = Optional.ofNullable(null);
        String login = "192380";
        Assert.assertEquals(correctAnswer, userManager.lookup(login));
    }

}
