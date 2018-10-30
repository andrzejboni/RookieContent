package com.company.WzorceProjektoweOnceAgain.FabrykaAbstrakcyjna2Podejscie;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String bla;

        IntelFactory intelFactory = new IntelFactory();
        AMDFactory amdFactory= new AMDFactory();


        intelFactory.buildCPU();
        intelFactory.buildGPU();

        amdFactory.buildCPU();
        amdFactory.buildGPU();


        do {
            System.out.println("Podaj czesc do komputera!");

            bla = scanner.nextLine();

            System.out.println("Twoje slowo to : " + bla);

        } while (!scanner.nextLine().equals("quit"));

    }
}
