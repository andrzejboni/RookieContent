package com.company.Wyjatki;

import java.io.IOException;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

import static com.sun.corba.se.impl.util.Utility.printStackTrace;

public class WyjatkiMain {

    //
    public static void main(String[] args)  {  // DOdanie do metody takiej akcji oznacza, że zostanie złapany wyjątek dotyczący SQL try to cały kod od poczatku maina
        Wyjatekk wyjatekk = new Wyjatekk();

        Scanner scanner = new Scanner(System.in);

        System.out.println(" podaj jakąś liczbę. Nie podawaj Stringa bo wywali wyjątek!");

        printStackTrace(); // Przydatna metoda do pokazania, gdzie sie wywalił system.

        try {
            int liczba = scanner.nextInt();
        }
        catch (InputMismatchException e){
            System.out.println("Zły format numeru! Zamiast Stringa to podaj liczbę");
            wyjatekk.przekazanoMiWyjatek();

            }

        }

    }


    //