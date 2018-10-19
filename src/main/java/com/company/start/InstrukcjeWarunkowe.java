package com.company.start;

import java.util.Scanner;

public class InstrukcjeWarunkowe {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj dwie liczby");

        int liczba = scanner.nextInt();
        int liczba2 = scanner.nextInt();


        if (liczba%liczba2 ==0){

            System.out.println(":)");

        }

        else {
            System.out.println(":(");
        }


    }
}
