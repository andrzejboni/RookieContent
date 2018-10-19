package com.company.start;

public class Domek {
    public static void main(String[] args) {

        // Dach



        dach();
        pietro();
        pietro();
        pietro();
        pietro();
        pietro();
        pietro();
        pietro();
        pietro();
        pietro();
        pietro();
//        pietro2();
//        pietro2();
        trawka();

//_____________________
//   |   _    _   |
//   |  |_|  |_|  |
//   |   _    _   |
//   |  |_|  |_|  |
//   |            |
//^^^^^^^^^^^^^^^^^^^^^^^
//
//
//
    }

    public static void dach(){
        for (int i =0; i<18; i++){ System.out.print("_"); } // dach
        System.out.println();


    }

    public static void pietro2(){
        System.out.println(" |  _       _  |");
        System.out.println(" | |_|     |_| |");
        System.out.println(" |             |");

    }



    public static void pietro(){

        for (int j =0;  j < 2; j++){ System.out.print(" ");} // Sciany
        System.out.print("|");

        for (int j =0;  j < 2; j++){ System.out.print(" ");}  // okna
        System.out.print("_");
        for (int j =0;  j < 4; j++){ System.out.print(" ");}
        System.out.print("_");
        for (int j =0;  j < 3; j++){ System.out.print(" ");}
        System.out.print("|");
        System.out.println();


        for (int j =0;  j < 2; j++){ System.out.print(" ");}
        System.out.print("|");

        for (int j =0;  j < 1; j++){ System.out.print(" ");}
        System.out.print("|");

        System.out.print("_");
        System.out.print("|");


        for (int j =0;  j < 2; j++){ System.out.print(" ");}
        System.out.print("|");

        System.out.print("_");
        System.out.print("|");
        for (int j =0;  j < 2; j++){ System.out.print(" ");}
        System.out.print("|");
        System.out.println();



        for (int j =0;  j < 2; j++){ System.out.print(" ");} // Dwie sciany pod oknami
        System.out.print("|");
        for (int j =0;  j < 11; j++){ System.out.print(" ");}
        System.out.print("|");
        System.out.println();

    }

    public static void trawka(){

        for (int i =0; i<18; i++){ System.out.print("^"); } // dach
        System.out.println();
    }



}
