package Games.Wisielec;

import java.io.*;

import static Games.Wisielec.Wisielec.dodajSlowaDoTablicy;

public class WczytajSlowo {

    public static String line = null;
    public void wczytaj() {
//         ?The name of the file to open.
        String fileName = "C:\\Users\\Andrzej\\IdeaProjects\\RookieContent\\src\\Games\\Wisielec\\config";  // PLIK KONFIGURACYJNY

        // This will reference one line at a time


        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader =
                    new FileReader(fileName);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader =
                    new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {
//                System.out.println(line);

                dodajSlowaDoTablicy(line);
            }

            // Always close files.
            bufferedReader.close();
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                    "Unable to open file '" +
                            fileName + "'");
        }
        catch(IOException ex) {
            System.out.println(
                    "Error reading file '"
                            + fileName + "'");
            // Or we could just do this:
            // ex.printStackTrace();
        }
        }
    }

