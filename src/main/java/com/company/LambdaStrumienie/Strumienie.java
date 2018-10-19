package com.company.LambdaStrumienie;

import com.company.WyrazeniaRegularne.Zegar;
//import com.company.WyrazeniaRegularne.Zegary;
import java.util.*;
import java.util.Arrays;
import java.util.List;


public class Strumienie {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz Zegar jaki cie interere");
        String kolorT= scanner.nextLine();


        Optional.ofNullable(kolorT)
                .ifPresent(j -> { System.out.println(kolorT +" nie istnieje !!!");});

//        Optional.of(kolorT);


//        Optional.ofNullable(jezyki)
//                .ifPresentOrElse(j -> { System.out.println(j[0]);},
//                        () -> {System.out.println("puste");} );

        List<Wykladzina> auta = Arrays.asList(
                new Wykladzina("Blue Curacao", 60, 16, 5, "zielony"),
                new Wykladzina("Leczo PikoBello", 390, 75, 18, "zielony"),
                new Wykladzina("Mroczna Truskawka", 90, 24, 7, "zielony"));
                new Wykladzina("Zakazana Szarpana Wołowina", 40, 13, 4, "zielony");
                new Wykladzina("Zakazana Szarpana Kurczakina", 45, 29, 3, "zielony");
                new Wykladzina("Podmieniony Hipokryta", 140, 35, 9, "niebieski");


        auta.stream()
                .filter(a -> a.gestoscWlosia > 30)
                .filter(a -> a.trwalosc > 1)
                .filter(a -> a.cena < 150)
                .filter(a -> a.kolor == "zielony")
                .map(a -> a.nazwa.toUpperCase())
                .forEach(System.out::println);

    List<Zegar> zegar = Arrays.asList(

                new Zegar("Luxry",18,90,84,"biała","bukszpan",true,true),
                new Zegar("Buxry",16,85,72,"biała","bukszpan",true,true),
                new Zegar("Szukxry",16,60,60,"biała","bukszpan",true,true),
                new Zegar("Midruxy",16,50,60,"biała","bukszpan",true,true),
                new Zegar("Downruxy",14,40,36,"biała","bukszpan",true,true),
                new Zegar("Biedaruxy",14,10,12,"czarna","sosnowy",false,false));

        zegar.stream()
                .filter(a -> a.wielkoscTarczy > 15)
            .filter(a -> a.trwaloscNaBaterii > 1)
            .filter(a -> a.czyKwarcowy == true)
                .filter(a->a.kolorRamy == "bukszpan")
                .filter(a->a.kolorTarczy == kolorT)
                .filter(a->a.cena <90)
            .map(a -> a.nazwa.toUpperCase())
            .forEach(System.out::println);
    }
}
