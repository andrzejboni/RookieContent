package RejestracjaUzytkownikowZadanie;

import RejstracjaUzytkownikowZadanie.Enums.RegisterEnum;
import RejstracjaUzytkownikowZadanie.User;
import RejstracjaUzytkownikowZadanie.UserManager;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static RejstracjaUzytkownikowZadanie.UserManager.listaUserow;
import static RejstracjaUzytkownikowZadanie.UserManager.usersToValidate;

public class UserManagerRegisterOneUserMethodTest {


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
        u5 = new User("Mych", "Puch", "", "555");
        u6 = new User("Mych", "Puch", "999", "555");
        u7 = new User("Jordan", "Belfort", "aaa", "999");

        usersToValidate.add(u1);
        usersToValidate.add(u2);
        usersToValidate.add(u3);
        usersToValidate.add(u4);
        usersToValidate.add(u5);
    }

    @Test
    public void registerOneUserMissingNaziwskoFieldTest() {
        RegisterEnum correctAnswer = RegisterEnum.FIELDS_MISSING;
        Assert.assertEquals(correctAnswer, userManager.RegisterOneUser(u1));
    }


    @Test
    public void registerOneUserMissingImieFieldTest() {
        RegisterEnum correctAnswer = RegisterEnum.FIELDS_MISSING;
        Assert.assertEquals(correctAnswer, userManager.RegisterOneUser(u2));
    }


    @Test
    public void registerOneUserTryToAddExistingUserTest() {
        RegisterEnum correctAnswer = RegisterEnum.USER_ALREADY_EXISTS;
        listaUserow.add(u6);
        Assert.assertEquals(correctAnswer, userManager.RegisterOneUser(u6));
    }


    @Test
    public void registerOneEverythingIsOK() {
        RegisterEnum correctAnswer = RegisterEnum.SUCCESS;
        Assert.assertEquals(correctAnswer, userManager.RegisterOneUser(u7));
    }


}