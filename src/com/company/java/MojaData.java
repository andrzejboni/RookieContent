package com.company.java;

public class MojaData {
    public int dzien;
    public int miesiac;
    public int rok;

    String[] tab = new String[12];

//    MojaData data = new MojaData(12,12,2020);
//
//    MojaData(int dzien,int miesiac,int rok) {
//        this.dzien = dzien;
//        this.miesiac=miesiac;
//        this.rok =rok;
//    }



    public void wyswietlDate1(int dzien, int miesiac, int rok) { // 1.1.2011
        System.out.println(dzien +"."+miesiac+"."+rok);
    }

    public void wyswietlDate2(int dzien, int miesiac, int rok) { // 01.01.2011
        if (dzien <10) {
            System.out.print("0" + dzien + ".");
        }
        else {
            System.out.print(dzien+".");
        }
        if (miesiac<10) {
            System.out.print("0" + miesiac + ".");
        }
        else {
            System.out.print(miesiac+".");
        }
        System.out.print(rok);

    }

    public void wyswietlDate3(int dzien, int miesiac, int rok) { // 1 lis 2011
        tab[0] = "sty";
        tab[1] = "lut";
        tab[2] = "mar";
        tab[3] = "kwi";
        tab[4] = "maj";
        tab[5] = "cze";
        tab[6] = "lip";
        tab[7] = "sie";
        tab[8] = "wrz";
        tab[9] = "paź";
        tab[10] = "lis";
        tab[11] = "gru";
        System.out.println();
        System.out.print(dzien+" ");
        for (int i = 0; i<=11; i++){
            if (i +1== miesiac ){
                System.out.print(tab[i]+ " ");
            }
        }
        System.out.print(rok);


    }


}
