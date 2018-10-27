package RejstracjaUzytkownikowZadanie;

import RejstracjaUzytkownikowZadanie.Enums.DeleteEnum;
import RejstracjaUzytkownikowZadanie.Enums.RegisterEnum;

public interface UserEditorManagerProxy {


    RegisterEnum registerOneUser(User user);

    DeleteEnum deleteUser(String login);
}
