package com.company.WczytywaniePlikow;

import java.io.*;
import java.util.Scanner;

import static sun.java2d.cmm.ColorTransform.In;

public class MainWczytywaniePlikow {


    public static void main(String[] args) {
// WCZYTYWANIE
//
//        // The name of the file to open.
//        String fileName = "E:\\elo.txt";
//
//        // This will reference one line at a time
//        String line = null;
//
//        try {
//            // FileReader reads text files in the default encoding.
//            FileReader fileReader =
//                    new FileReader(fileName);
//
//            // Always wrap FileReader in BufferedReader.
//            BufferedReader bufferedReader =
//                    new BufferedReader(fileReader);
//
//            while((line = bufferedReader.readLine()) != null) {
//                System.out.println(line);
//            }
//
//            // Always close files.
//            bufferedReader.close();
//        }
//        catch(FileNotFoundException ex) {
//            System.out.println(
//                    "Unable to open file '" +
//                            fileName + "'");
//        }
//        catch(IOException ex) {
//            System.out.println(
//                    "Error reading file '"
//                            + fileName + "'");
//            // Or we could just do this:
//            // ex.printStackTrace();
//        }
//// @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ ZAPISYWANIE @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

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
            bufferedWriter.write("Hello darknees,");
            bufferedWriter.write(" my old friend.");
            bufferedWriter.newLine();
            bufferedWriter.write("We are waiting");
            bufferedWriter.write(" to you again.");

            // Always close files.
            bufferedWriter.close();
        }
        catch(IOException ex) {
            System.out.println(
                    "Error writing to file '"
                            + fileName + "'");
            // Or we could just do this:
            // ex.printStackTrace();
        }


    }
}