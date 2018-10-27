package RejestracjaUzytkownikowZadanie;

import RejstracjaUzytkownikowZadanie.Enums.LogowanieEnum;
import RejstracjaUzytkownikowZadanie.User;
import RejstracjaUzytkownikowZadanie.UserManager;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static RejstracjaUzytkownikowZadanie.UserManager.listaUserow;
import static RejstracjaUzytkownikowZadanie.UserManager.usersToValidate;

public class UserManagerTest {

    UserManager userManager;


    @Before
    public void setUp(){
        userManager = new UserManager();





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

    }

    @Test
    public void logInTestWhatIfPasswordComeFromOtherUserThanLogin() {
        LogowanieEnum correctAnswer = LogowanieEnum.WRONG_PASSWORD;
        String haslo = "aaa";
        String login = "333";
        Assert.assertEquals(correctAnswer, userManager.logInMethod(haslo,login));
    }

    @Test  // Unnesseary
    public void logInTestWhatIfLoginComeFromOtherUserThanPassword() {
        LogowanieEnum correctAnswer = LogowanieEnum.WRONG_PASSWORD;
        String haslo = "bbb";
        String login = "111";
        Assert.assertEquals(correctAnswer, userManager.logInMethod(haslo,login));
    }

    @Test
    public void logInTestWhatIfPasswordIsIncorrect() {
        LogowanieEnum correctAnswer = LogowanieEnum.WRONG_PASSWORD;
        String haslo = "ppp";
        String login = "444";
        Assert.assertEquals(correctAnswer, userManager.logInMethod(haslo,login));
    }

    @Test
    public void logInTestWhatIfLoginIsInncorrect() {
        LogowanieEnum correctAnswer = LogowanieEnum.USER_DOESNT_EXIST;
        String haslo = "eee";
        String login = "121212";
        Assert.assertEquals(correctAnswer, userManager.logInMethod(haslo,login));
    }
}
