package Dentysta;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class ZapisOdczyt {


    public static void zapisz(RegistrationDesk registrationDesk) throws IOException {
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
            bufferedWriter.write((registrationDesk.mapaWizyt.toString()));
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

    public void odczyt() {
        Path sciezka = Paths.get("E:/", "elo.txt");

        try (BufferedReader czytnik = Files.newBufferedReader(sciezka, StandardCharsets.UTF_8)) {
            String linia;
            while ((linia = czytnik.readLine()) != null) {
                System.out.println(linia);
                ogarniajZnakiStopu(linia);
                tworzObiektPacjent(linia);
            }

        } catch (IOException e1) {
            e1.printStackTrace();
        }

    }


    List<String> listaOdczytanych = new ArrayList<>(); // lista przechowuje odczytane w konsoli rzeczy, znakiem odzielającym jest %.


    public void ogarniajZnakiStopu(String linia) { // Znakiem stopu jest % dzielę ciąg na elementy od % do %
        char[] tablicaSlowa = new char[linia.length()];

//        tablicaSlowa = linia.toCharArray();

        String[] split = linia.split("%");

        for (int i = 0; i < split.length; i++) {
            listaOdczytanych.add(i, split[i]);
        }
    }


    private Pacjent tworzObiektPacjent(String linia) { // Metoda odwraca cały proces -> ze sczytanego tekstu tworzy obiekt klasy Pacjent.
        String[] split = linia.split("%");

        String imie = split[0];
        String nazwisko = split[1];
        long pesel = Long.parseLong(split[2]);

        Pacjent pacjent = new Pacjent(imie, nazwisko, pesel);

        return pacjent;
    }


//        sciezka = Paths.get("E:/", "elo.txt");
//        try (BufferedWriter skryba = Files.newBufferedWriter(sciezka, StandardCharsets.UTF_8,
//                StandardOpenOption.WRITE)) {
//            skryba.write(String.format("Wiadomosc\n"));
//        } catch (Exception e) {
//            System.err.println(e);
//        }


}

