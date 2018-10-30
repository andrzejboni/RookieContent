package com.company.WzorceProjektoweOnceAgain.FabrykaAbstrakcyjna2Podejscie;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String bla;

        IntelFactory intelFactory = new IntelFactory();
        AMDFactory amdFactory = new AMDFactory();


        intelFactory.buildCPU();
        intelFactory.buildGPU();

        amdFactory.buildCPU();
        amdFactory.buildGPU();


        String zKlawiatury;
        System.out.println("Oto fantastyczy sklep dla najlepszych \n" +
                "uruchomiłem się aby sprzedać Ci komputer. \n" +
                "dostępne funkcje:   [1] Kup kompa AMD, [2] Kup kompa Intel. Pozdrawiam. ");
        do {
            zKlawiatury = scanner.nextLine();
            System.out.println("Podaj czesc do komputera");
            System.out.println("Twoje slowo to : " + zKlawiatury);

            if (zKlawiatury.equals("1")) {
                intelFactory.buildGPU();
                intelFactory.buildCPU();
                System.out.println("Właśnie stworzyłem komputer intela. Sprzedam Ci go za jedyne 8999zł. Podaj PIN do karty aby zapłacić.");
                zKlawiatury = scanner.nextLine();
                System.out.println("PIN OK \n Dziękujemy za skorzystanie z naszych usług.");
            }


            if (zKlawiatury.equals("2")) {
                intelFactory.buildGPU();
                intelFactory.buildCPU();

                System.out.println("Właśnie stworzyłem komputer intela. Sprzedam Ci go za jedyne 3999zł. Podaj PIN do karty aby zapłacić.");
                zKlawiatury = scanner.nextLine();
                System.out.println("PIN OK \n Dziękujemy za skorzystanie z naszych usług.");
            }

        } while (!zKlawiatury.equals("quit"));

    }
}
