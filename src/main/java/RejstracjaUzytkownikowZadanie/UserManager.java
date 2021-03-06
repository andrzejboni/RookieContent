package RejstracjaUzytkownikowZadanie;

import RejstracjaUzytkownikowZadanie.Enums.DeleteEnum;
import RejstracjaUzytkownikowZadanie.Enums.LogowanieEnum;
import RejstracjaUzytkownikowZadanie.Enums.RegisterEnum;
import com.sun.org.apache.regexp.internal.RE;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserManager implements UserEditorManagerProxy, LoginManagerProxy {


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

    public RegisterEnum registerAll() {

        for (int i = 0; i < usersToValidate.size(); i++) {
            if (usersToValidate.get(i).getHaslo() == null || usersToValidate.get(i).getLogin() == null || usersToValidate.get(i).getImie() == null || usersToValidate.get(i).getNazwisko() == null) {
                return RegisterEnum.FIELDS_MISSING;
            }
            if (listaUserow.contains(usersToValidate.get(i))) { // check if there there any duplicate of user
                return RegisterEnum.USER_ALREADY_EXISTS;
            }
            listaUserow.add(usersToValidate.get(i));

        }
        return RegisterEnum.SUCCESS; // Throw if all registration goes ok

    }


    @Override
    public RegisterEnum registerOneUser(User user) {  // Regist one user

        if (user.getHaslo().equals("") || user.getLogin().equals("") || user.getImie().equals("") || user.getNazwisko().equals("")) {
            return RegisterEnum.FIELDS_MISSING;
        }

        if (listaUserow.contains(user)) { // check if there there any duplicate of user
            return RegisterEnum.USER_ALREADY_EXISTS;
        }

        listaUserow.add(user);
        return RegisterEnum.SUCCESS; // Throw if all registration goes ok

    }


    public LogowanieEnum logInMethod(String haslo, String login) {
        int licznikPassword = 0;
        int licznikUser = 0;

        for (int i = 0; i < listaUserow.size(); i++) {

            if (listaUserow.get(i).getLogin().equals(login)) {
                licznikUser++;

                if (listaUserow.get(i).getHaslo().equals(haslo)) {
                    licznikPassword++;

                }
            }

        }

        if (licznikUser == 0 || licznikPassword == 0) {
            if (licznikUser == 0) {
                return LogowanieEnum.USER_DOESNT_EXIST;
            }
            return LogowanieEnum.WRONG_PASSWORD;
        }

        return LogowanieEnum.SUCCESS;
    }

    @Override
    public DeleteEnum deleteUser(String login) { // podanie loginu ktory chcesz usunac
        for (int i = 0; i < listaUserow.size(); i++) {
            if (listaUserow.get(i).getLogin().equals(login)) {
                listaUserow.remove(i);
                return DeleteEnum.SUCCESS;
            }
        }
        return DeleteEnum.USER_DOESNT_EXIST;
    }


    public Optional<User> lookup(String login) { // Search user
        for (int i = 0; i < listaUserow.size(); i++) {
            if (listaUserow.get(i).getLogin().equals(login)) {
                return Optional.ofNullable(listaUserow.get(i));
            }
        }

        return Optional.ofNullable(null);
    }


}

