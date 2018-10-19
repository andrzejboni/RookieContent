package com.company.WczytywaniePlikow;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Zapisy {
    public static void main(String[] args) {
        Path sciezka = Paths.get("D:/", "sraka.txt");

        try ( BufferedReader czytnik = Files.newBufferedReader(sciezka, StandardCharsets.UTF_8) )
        {
            String linia;
            while ((linia = czytnik.readLine()) != null)
            {
                System.out.println(linia);
            }
        } catch (IOException e1) {
            e1.printStackTrace();
        }


        sciezka = Paths.get("D:/", "sraka.txt");
        try (BufferedWriter skryba = Files.newBufferedWriter(sciezka, StandardCharsets.UTF_8,
                StandardOpenOption.WRITE)) {
            skryba.write(String.format("Wiadomosc1234567890\n"));
        } catch (Exception e) {
            System.err.println(e);
        }

    }
}
