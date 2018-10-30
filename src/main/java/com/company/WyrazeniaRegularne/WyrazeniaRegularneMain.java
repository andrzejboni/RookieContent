package com.company.WyrazeniaRegularne;

import java.util.Scanner;

public class WyrazeniaRegularneMain {
    public static void main(String[] args) {
        System.out.println();


        String wzor = "(\\w)(\\s+)([\\.,])";
        System.out.println("Koniec . zzz .".replaceAll(wzor,"$1$3"));

        Scanner scanner = new Scanner(System.in);
        String napis = scanner.nextLine();
//
        napis = napis.replaceAll("\\d","");
//
        String wypisz = napis.replace("\\ba", "@amp;");

        System.out.println(wypisz);

//        String newStr = napis.replace('a', '@');

        String[] parts = napis.split(" ");

        String pierwszaLitera;

        for (int i=0; i< parts.length; i++){
            //pierwszaLitera = String.valueOf(napis.charAt(0));
            if (String.valueOf(napis.charAt(0)) == "a") {

                parts[i].replace("a","@");
                System.out.print(parts[i]);
            }
        }
        System.out.println();




    }
}
