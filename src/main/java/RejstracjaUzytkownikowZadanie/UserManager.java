package RejstracjaUzytkownikowZadanie;

import RejstracjaUzytkownikowZadanie.Enums.DeleteEnum;
import RejstracjaUzytkownikowZadanie.Enums.LogowanieEnum;
import RejstracjaUzytkownikowZadanie.Enums.RegisterEnum;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class UserManager {


    public static List<User> listaUserow = new ArrayList<>();
    public static List<User> usersToValidate = new ArrayList<>();


    public UserManager() {

    }

    public void readFromFile() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(SaveToFile.getFilePath()));
        try {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());

                line = br.readLine();
                line.split(";");
//                User.listaUserowDoWalidacji.addAll();
            }
            String everything = sb.toString();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            br.close();
        }
    }


    // Do poprawki! !!!!
    public RegisterEnum registerUser() { // chceck  if there are duplicate of user
        for (int i = 0; i < usersToValidate.size(); i++) {
            for (int j = 0; j < listaUserow.size(); j++) {
                if (usersToValidate.get(i).equals(listaUserow.get(j))) {
                    return RegisterEnum.USER_ALREADY_EXISTS;
                }
            }
        }

        return null;
    }


    public LogowanieEnum logIn(List<User> userList, String haslo, String login) {
        for (int i = 0; i < userList.size(); i++) {
            if (!userList.get(i).getLogin().equals(login)) {
                return LogowanieEnum.USER_DOESNT_EXIST;
            } else if (!userList.get(i).getHaslo().equals(haslo)) {
                return LogowanieEnum.WRONG_PASSWORD;
            } else {
                return LogowanieEnum.SUCCESS;
            }
        }
        return LogowanieEnum.SUCCESS;
    }





    public DeleteEnum usun(String login) { // podanie loginu ktory chcesz usunac
        for (int i = 0; i < listaUserow.size(); i++) {
            if (listaUserow.get(i).getLogin().equals(login)) {
                listaUserow.remove(i);
                return DeleteEnum.SUCCESS;
            }
        }
        return DeleteEnum.USER_DOESNT_EXIST;
    }

    public void lookup() {
    }


}

