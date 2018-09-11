//package com.company.java;
//
//public enum  Browar {
//
//    PIWO_ULGA(1.4d, 4.5d, 15, 30, 50),
//    PIWO_ZIMNY_SIKACZ(1.8d, 5.5, 40, 30, 40),
//    PIWO_INTERNATONIAL_LAGER(2.2d, 5.5d, 50, 60, 60),
//    PIWO_AMERICAN_APA(3.5d, 5.5d, 70, 70, 30),
//    PIWO_NIEMIECKI_KRAFT(6d, 6d, 70, 65, 50),
//    BRAK_PIWA(0, 0, 0, 0, 0);
//
//    private double cena;
//    private double zawartoscAlkoholu;
//    private int goryczka;
//    private int aromat;
//    private int słodycz;
//
//
//    Browar(double cena, double zawartoscAlkoholu, int goryczka, int aromat, int słodycz) {
//        this.cena = cena;
//        this.zawartoscAlkoholu = zawartoscAlkoholu;
//        this.goryczka = goryczka;
//        this.aromat = aromat;
//        this.słodycz = słodycz;
//    }
//
//
//    public static Browar jakiBrowar(double cena, int kasaKlienta, double zawartoscAlkoholu, int goryczka, int aromat, int słodycz) {
//        if (kasaKlienta < 1.40d) {
//            System.out.println("Nie masz wystarczajacych srodków!");
//            return BRAK_PIWA;
//        }
//
//    }
//}
////        if (zawartoscAlkoholu) {
////            if (kwota > 3.000d) {
////                if (czasJazdy > 60) {
////                    return ULGOWY_CAŁODNIOWY;
////                } else {
////                    return ULGOWY_GODZINNY;
////                }
////            } else {
////                return ULGOWY_GODZINNY;
////            }
////        } else {
////            if (kwota > 4.00d) {
////                if (czasJazdy > 60) {
////                    return NORMALNY_CALODNIOWY;
////                } else {
////                    return NORMALNY_GODZINNY;
////                }
////            }
////            else {return NORMALNY_GODZINNY;}
////
////        }
//// }
//
