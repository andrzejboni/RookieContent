package Strategy.Zadanie2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class StrategiaZapisu2 implements Strategia {
    String file = "C:\\git\\Rookie77\\src\\main\\java\\Strategy\\Zadanie2\\plikZobjektami.txt";





    @Override
    public void zapisz(List<Student> students) {

        try {
            FileWriter writer = new FileWriter("Zapis1.txt");
            BufferedWriter bwr = new BufferedWriter(writer);
            bwr.write(students.size()); // TUtaj jest wyszczegolniana metoda zapisu!

            bwr.close();
            System.out.println("succesfully written to a file");
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

    }


}
