package com.company.java;

import java.time.LocalDateTime;

public class MojaDataWydarzenie {

    String nazwaWydarzenia;
    MojaData dataWydarzenia;

    public int ileZostaloLat() {

        LocalDateTime ldt = LocalDateTime.now();

        System.out.println(ldt);

        return 1;
    }

    public int ileZostaloMiesiecy() {
        return 2;
    }

    public int ileZostaloDni() {
        return 3;
    }


}
