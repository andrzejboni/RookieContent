package RejstracjaUzytkownikowZadanie;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;

public class SaveToFile {
    public static String filePath = "C:\\git\\Rookie77\\src\\main\\java\\RejstracjaUzytkownikowZadanie\\users.txt";

    public static String getFilePath() {
        return filePath;
    }

    public void saveToFile(List<User> lista){
        try (PrintWriter out = new PrintWriter(filePath)) {
            out.println(lista);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}
