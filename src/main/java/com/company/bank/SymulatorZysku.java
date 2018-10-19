package com.company.bank;

public class SymulatorZysku {

    double kapitalPoczatkowy;
    //    double kapitalKoncowy;
    double czasLokaty;

    public static double obliczZysk(OfertaPodstawowa oferta, double kapitalPoczatkowy, double czasLokaty) {

        if (oferta.czyOfertaSpecjalna == false) {
            return kapitalPoczatkowy * (Math.pow((1 + (oferta.oprocentowanie / oferta.kapitalizacja)), (czasLokaty * oferta.kapitalizacja)));
        } else {
            if (oferta.oprocentowanie < 10) {
                return kapitalPoczatkowy * (Math.pow((1 + (oferta.oprocentowanie / oferta.kapitalizacja)), (czasLokaty * oferta.kapitalizacja)));
            }
            return kapitalPoczatkowy * (Math.pow((1 + (oferta.oprocentowanie / oferta.kapitalizacja)), (czasLokaty * oferta.kapitalizacja))); // TUTAJ COS TRZEBA ZROBIC.

        }
    }


//   @Override
//    public void toString(OfertaPodstawowa oferta) {
//        System.out.println( "SymulatorZysku: " +
//                "kapitalPoczatkowy=" + kapitalPoczatkowy +
////                " kapitalKoncowy=" + kapitalKoncowy +
//                " liczbaMiesiecy=" + czasLokaty +
//                "Oprocentowanie= " + oferta.oprocentowanie +
//                "Kapitalizacja= " + oferta.kapitalizacja
//        );
//    }
}
