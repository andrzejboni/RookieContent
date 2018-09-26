package com.company.Kolekcje;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class KolekcjeMain {
    public static <parts> void main(String[] args) {

        List<String> lista = new ArrayList<>();
        lista.add("Krowa");
        lista.add("Kon");
        lista.add("Koza");
        lista.add("Swinia");
        lista.add("Indyk");
        lista.add("Kura");
        lista.add("Owca");
        lista.add("Pies");
        lista.add("Kot");
        lista.add("Nosorożec");
        lista.add("Ryjówka");
        lista.add("Bocian");
        lista.add("Ropucha");
        lista.add("Hipopotam");
        lista.add("Lew");
        lista.add("Żyrafa");
        lista.add("Słoń");
        lista.add("Surykatka");
        lista.add("Tygrys");


        for(int i =0; i< 200; i++){
            lista.add(i+"String nr"+i);
        }

        String pomoczniczy;


        // lista.removeIf();


        //2 zadanie
        String Str = new String("Cielisty ptak wpadł do jaskini");
        System.out.print("Return Value :");
        System.out.println(Str.matches("(.*)N(.*)"));


//        System.out.println(lista.indexOf('n'));
//        lista.remove(lista.indexOf('N'));

        for (int i = 0; i < lista.size(); i++) {  // USUWA  LITERE N ZE ZBIORU
            //if (lista.get(i).equals('N')) {

            String element = lista.get(i);
            if (element.contains(Character.toString('N'))) {
                lista.remove(element);
            }
        }
        System.out.println(lista);

//        Collections.sort(lista); // sortuje wszystko w cholere  PUNKT 3
        long startTime = System.nanoTime();
        Collections.sort(lista);
        long estimatedTime = System.nanoTime() - startTime;
        System.out.println("Czas sortowania listy wynosi: " + estimatedTime);


//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

        Set<String> set = new HashSet<>();

        set.add("Krowa");
        set.add("Kon");
        set.add("Koza");
        set.add("Swinia");
        set.add("Indyk");
        set.add("Kura");
        set.add("Owca");
        set.add("Pies");
        set.add("Kot");
        set.add("Nosorożec");
        set.add("Ryjówka");
        set.add("Bocian");
        set.add("Ropucha");
        set.add("Hipopotam");
        set.add("Lew");
        set.add("Żyrafa");
        set.add("Słoń");
        set.add("Surykatka");
        set.add("Tygrys");


        for(int i =0; i< 200; i++){
            set.add(i+"string nr"+i);
        }

        System.out.println(set.add("Paw"));
        System.out.println(set.add("Paw")); // Nie dodaje sie




        List myList = new ArrayList(set);

        long startTimeSET = System.nanoTime();
        Collections.sort(myList);
        long estimatedTimeSET = System.nanoTime() - startTimeSET;
        System.out.println("Czas sortowania SETa wynosi: " + estimatedTimeSET);

///////////// Mapy


        Map<Integer, Osoba> map = new HashMap<>();
        Osoba o1 = new Osoba("Jozek", "Biedny", 111);
        Osoba o2 = new Osoba("Maurycy", "Biały", 222);
        Osoba o3 = new Osoba("Eustachy", "Gorzki", 333);
        Osoba o4 = new Osoba("Wincenty", "Nieobecny", 444);
        Osoba o5 = new Osoba("Mirosław", "Straszny", 555);
        Osoba o6 = new Osoba("Bogus", "Szorstki", 666);


        map.put(o1.pesel, o1);
        map.put(o2.pesel, o2);
        map.put(o3.pesel, o3);
        map.put(o4.pesel, o4);
        map.put(o5.pesel, o5);
        map.put(o6.pesel, o6);

        System.out.println("Map size" + map.size());
        System.out.println("Osoba w mapie zapisana pod numerem pesel 555 to : " + map.get(555).toString());
        System.out.println("Osoba w mapie zapisana pod numerem pesel 555 to : " + map.get(333).toString());


// Zadanie 10

        String tekst = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et" +
                " dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. " +
                "Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat " +
                "cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum, mollit";



        Map<String, Integer> mapLoremIpsum = new HashMap<>();  // String to słowo z łańcucha, a Integer w tej mapie to ilosc wystąpień



        String[] slowa = tekst.split(" ");
        Map<String, Integer> licznikSlow = new HashMap<>(); // Nie moj kod poniżej. Do przeanalizaowania.

        for (String slowo : slowa) {
            Integer licznik = licznikSlow.get(slowo);
            if(licznik == null) {
                licznik = 0;
            }
            licznik++;
            licznikSlow.put(slowo, licznik);
        }
        Set<String> keySet = licznikSlow.keySet();
        for(String klucz : keySet) {
            System.out.println(klucz + " wystapilo " +licznikSlow.get(klucz) + " razy");

        }
        for (Entry<String, Integer> entry : licznikSlow.entrySet()) {
            System.out.println(entry.getKey() + " wystapilo " +entry.getValue() + " razy");
        }



        // put wykonywany kilkul=ktornie nadpisuje wartosci
// do przechodzenia przez mapę wykorzystujemy metodę entryset.
        //


  //      Iterator<String> iterator = mapLoremIpsum.iterator; iterator.hasNext();){
  //  String string = iterator.next();

        }


//        for (int i = 0; i < parts.length; i++) { // ZapisOdczyt do nowej drugiej tablicy, unikalnych słow
//
//            for (int j = 0; j < parts.length; j++) {
//                if (parts[i] == parts[j]) ;
//                {
//                    partsUnikalne[i] = parts[i];
//                    System.out.println("Unikalne słowo "+i + partsUnikalne[i]);
//                }
//            }
//        }



//
//        String part1 = parts[0]; // 004
//        String part2 = parts[1]; // 034556


    }




