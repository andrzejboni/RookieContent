package Strategy.Zadanie2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteToFile {

    String file = "C:\\git\\Rookie77\\src\\main\\java\\Strategy\\Zadanie2\\plikZobjektami.txt";

    public void writeToFile(List<Student> students) throws IOException {
        FileWriter writer = new FileWriter(file, true);
        writer.write(String.valueOf(students));  // PIES WIE CZY ZADZIAŁA
        writer.close();
    }
}
