package RejstracjaUzytkownikowZadanie;


import RejstracjaUzytkownikowZadanie.Enums.LogowanieEnum;

public interface LoginManagerProxy {
    LogowanieEnum logInMethod(String haslo, String login);

}
