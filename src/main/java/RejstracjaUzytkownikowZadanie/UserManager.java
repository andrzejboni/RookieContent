package RejstracjaUzytkownikowZadanie;

import RejstracjaUzytkownikowZadanie.Enums.LogowanieEnum;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class UserManager {

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


    public LogowanieEnum logIn(List<User> userList, String haslo, String login) {
        for (int i = 0; i < userList.size(); i++) {
            if ( !userList.get(i).getLogin().equals(login)) {
                return LogowanieEnum.USER_DOESNT_EXIST;
            } else if ( !userList.get(i).getHaslo().equals(haslo)) {
                return LogowanieEnum.WRONG_PASSWORD;
            } else {
                return LogowanieEnum.SUCCESS;
            }
        }
        return LogowanieEnum.SUCCESS;
    }


    public void validateUsers(String login, String haslo) { // chceck  if there are duplicate of user


//
//        if (login.equals()){
//
//        }

    }


    public void zarejestruj() {
    }

    public void usun() {
    }

    public void lookup() {
    }


}

