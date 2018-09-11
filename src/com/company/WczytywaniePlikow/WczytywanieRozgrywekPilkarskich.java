package com.company.WczytywaniePlikow;

import java.io.*;
import java.util.Scanner;

public class WczytywanieRozgrywekPilkarskich {

    public static void main(String[] args) throws IOException {
        PrintWriter tekstowy = null;

        File file = new File("plik.txt");

        BufferedReader br = new BufferedReader(new FileReader(file));

        String st;
        while ((st = br.readLine()) != null)
            System.out.println(st);

//        Writer output = new BufferedWriter(new FileWriter("plik.txt", true));
//        output.append("sraka taka");
//        output.close();



        try {
            tekstowy = new PrintWriter("plik.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Pliku nie znaleziono");
        }
        tekstowy = new PrintWriter("plik.txt");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ile wynikow meczy chcesz dodać?");
        int ileWynikow = scanner.nextInt();
        scanner.nextLine();

        int i = 0;

        while (i < ileWynikow) {

            int wynikDruzynyA;
            int wynikDruzynyB;

            System.out.println("Podaj pierwsza druzyne: ");
            String druzynaA = scanner.nextLine();
            System.out.println("Podaj wynik druzyny A");
            int wynikA = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Podaj drugą druzyne");
            String druzynaB = scanner.nextLine();
            System.out.println("Podaj wynik druzyny B");
            int wynikB = scanner.nextInt();
            scanner.nextLine();

            if (wynikA == wynikB) {
                System.out.println("Podaj wynik karnych druzyny A");
                int wynikKarnychA = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Podaj wynik karnych  druzyny B");
                int wynikKarnychB = scanner.nextInt();

                tekstowy.println(druzynaA + " <" + wynikA + ">(" + wynikKarnychA + "):(" + wynikKarnychB + ") <" + wynikB + "> " + druzynaB);

            } else {
                tekstowy.println(druzynaA + " <" + wynikA + ">" + ":" + "<" + wynikB + "> " + druzynaB);

            }
            i++;
        }
        tekstowy.close(); // Zamykam plik
    }}
