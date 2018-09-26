package Dentysta;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Zapisywanie {


    public static void zapisz(RegistrationDesk registrationDesk) throws  IOException{
        // The name of the file to open.
        String fileName = "E:\\elo.txt";

        try {
            // Assume default encoding.
            FileWriter fileWriter =
                    new FileWriter(fileName);

            // Always wrap FileWriter in BufferedWriter.
            BufferedWriter bufferedWriter =
                    new BufferedWriter(fileWriter);

            // Note that write() does not automatically
            // append a newline character.
            bufferedWriter.write(String.valueOf(registrationDesk));
            bufferedWriter.newLine();

            // Always close files.
            bufferedWriter.close();
        } catch (
                IOException ex) {
            System.out.println(
                    "Error writing to file '"
                            + fileName + "'");
            // Or we could just do this:
            // ex.printStackTrace();
        }
    }
}
