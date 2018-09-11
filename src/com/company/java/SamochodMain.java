package com.company.java;

public class SamochodMain {

    public static void main(String[] args) {

        Kabriolet k1 = new Kabriolet(190, false, "Zielony", "Porshe", 1977, false, 1234);
        Kabriolet k2 = new Kabriolet(10, true, "Zielony", "Mazda", 2017, true, 1234);

        Samochod m1 = new Samochod(110, true, "Zielony", "Fiat", 2010, 1234);
        Samochod m2 = new Samochod(110, true, "Zielony", "Fiat", 2010, 1234);

        System.out.println(m1.equals(m2));
        System.out.println(k1.equals(k2));




        System.out.println(k1.toString());


//        System.out.println(m.czySwiatlaWlaczone());
//
//        m.schowajDach();
//        m.czyDachSchowany();
//        m.przyspiesz();
//


//        System.out.println(x.toString());
//        System.out.println(Integer.toString(12));

//          PRZYKŁAD METODY TO STRING
//        Integer x = 5;
//        System.out.println(m.toString());
//        System.out.println(m1.toString());
//


//        m1.przyspiesz();
//        m1.przyspiesz();
//        m1.przyspiesz();
//
//        m.przyspiesz();
//        m.przyspiesz();
//        m.przyspiesz();
//        m.przyspiesz();
//        m.przyspiesz();
//        m.przyspiesz();
    }


}
