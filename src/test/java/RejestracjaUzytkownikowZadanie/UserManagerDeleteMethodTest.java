package RejestracjaUzytkownikowZadanie;

import RejstracjaUzytkownikowZadanie.Enums.DeleteEnum;
import RejstracjaUzytkownikowZadanie.Enums.RegisterEnum;
import RejstracjaUzytkownikowZadanie.User;
import RejstracjaUzytkownikowZadanie.UserManager;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static RejstracjaUzytkownikowZadanie.UserManager.listaUserow;


public class UserManagerDeleteMethodTest {

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

        u1 = new User("GorPel", "", "aaa", "111");
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
    }

    @Test
    public void deleteUserMethodSUCCESTest() {
        DeleteEnum correctAnswer = DeleteEnum.SUCCESS;
        Assert.assertEquals(correctAnswer, userManager.deleteUser("111"));
    }


    @Test
    public void deleteUserUSER_DOESNT_EXISTMethodTest() {
        DeleteEnum correctAnswer = DeleteEnum.USER_DOESNT_EXIST;
        Assert.assertEquals(correctAnswer, userManager.deleteUser("oooo"));
    }

    @Test
    public void deleteUserUSER_DESENT_EXISTMethodTest(){


    }

}
