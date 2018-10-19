package com.company.WczytywaniePlikow;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


public class ZapisywanieDoPliku {

    public static void main(String[] args) {


        System.out.println("Witaj, zapiszę dane odnośnie meczy piłkarskich.");
        String decyzja;
        Scanner scanner = new Scanner(System.in);
        PrintWriter plik = null;

        try {
            plik = new PrintWriter("D:\\sraka.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Taki plik nie istnieje.");
        }

        do {
            System.out.println("Podaj 2 drużyny (po enterze):");
            String druzyna1 = scanner.nextLine();
            String druzyna2 = scanner.nextLine();

            System.out.println("Podaj wyniki (po enterze):");
            String wynik1 = scanner.nextLine();
            int wynikInt1 = Integer.parseInt(wynik1);
            String wynik2 = scanner.nextLine();
            int wynikInt2 = Integer.parseInt(wynik2);

            System.out.println("Czy drużyna wygrała w karnych? TAK lub NIE");
            String odpowiedz = scanner.nextLine();

            if (odpowiedz.equals("TAK")) {
                System.out.println("Podaj wyniki rzutów karnych (po ENTERZE):");
                String rzutyKarne1 = scanner.nextLine();
                int rzutyInt1 = Integer.parseInt(rzutyKarne1);
                String rzutyKarne2 = scanner.nextLine();
                int rzutyInt2 = Integer.parseInt(rzutyKarne2);

                plik.println(druzyna1 + " " + wynikInt1 + " " + "<" + rzutyInt1 + ">" + " : " + "<" + rzutyInt2 + ">" + " " + wynikInt2 + " " + " " + druzyna2);
                System.out.println("Czy chcesz wpisać kolejne wyniki? TAK lub NIE");

            } else if (odpowiedz.equals("NIE")) {
                plik.println(druzyna1 + " " + wynik1 + " : " + wynik2 + " " + " " + druzyna2);
                System.out.println("Czy chcesz wpisać kolejne wyniki? TAK lub NIE");
            }
            decyzja = scanner.nextLine();
        } while (decyzja.equals("TAK"));
        System.out.println("Dziękuję, program zakończył działanie.");
        plik.close();

    }
}
