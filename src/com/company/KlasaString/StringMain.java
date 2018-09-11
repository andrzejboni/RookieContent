package com.company.KlasaString;
import java.util.Arrays;
import java.util.regex.Pattern;

public class StringMain {

    public static void main(String[] args) {
        String test1 = "pocztBapolBka";   //12 liter
        String test2 = "POCZTAPOLSKA";
        //test.concat("ALSKDAHH");

        //String test2 = test.toLowerCase();
        String test3 = test1.toUpperCase();
//
//        (char) test1;
//
//        char[] tekst =

        String str = "Java";
        char[] actualCharArray = str.toCharArray();
        char[] expectedCharArray = {'J', 'a', 'v', 'a'};
        //assertArrayEquals(expectedCharArray, actualCharArray);

        System.out.println(test1.substring(3,7));
        System.out.println(test1.substring(4,12));
        System.out.println(test1.substring(0,8));


        System.out.println(test1.replace('a','b'));
        System.out.println(test1.indexOf('B'));


        String string = "Poczta Polska";
        //String[] parts = string.split("t");
        String[] parts = string.split(" ");



        String part1 = parts[0]; // 004
        String part2 = parts[1]; // 034556


        String Str = new String("Mleczny start w promocji");
        System.out.print("Return Value :" );
        System.out.println(Str.matches("(.*)start(.*)"));



        System.out.println(part1+part2);

    }
}
