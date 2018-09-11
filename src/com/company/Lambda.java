package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Lambda {

    public static void main(String[] args) {

        List<String> hardaware = Arrays.asList("Spectrum", "Amiga", "Commodore", "LOL","DUPA","DUPA21");

//        Collections.sort(hardaware,(str1, str2)->(porownaj(str1.length(),str2.length())));


//        Collections.sort(hardaware,(str1,str2)->(str2.length() % 2) - str1.length() %2);

        hardaware.forEach(h-> System.out.println(h));

        int a= 5;
        int b= 7;

//
//

//        System.out.println(aa);

    }
//
//    public static int porownaj(int a, int b){
//        if (a > b) return 1;
//        else return -1;
//    }
//
//    public static int porownaj(int a, int b){
//        if (a > b) return 1;
//        else return -1;
//    }
}
