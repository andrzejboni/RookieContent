package com.company.Wyjatki;

import com.sun.xml.internal.ws.api.model.CheckedException;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class Wyjatekk {
    Scanner scanner = new Scanner(System.in);

//
//    public void rzucWyjatkiem() throws SQLException { // WYJĄTEK EXCEPTION czyli SPRAWDZALNY wyjątek, wyjebało, to trzeba to obsłużyć
//        throw new SQLException();
//    }


    public void throwIllegalStateException() throws IllegalStateException{  // WYJĄTEK UNCHECKED EXCEPTION czyli niesprawdzalny wyjątek, wyjebało, to chuj jedziedmy dalej
        throw new IllegalStateException();
    }

    public void przekazanoMiWyjatek () {
        System.out.println("Dostałem wyjątek, postaram się go obsłużyć");
        int liczba = scanner.nextInt();
        System.out.println("Oto liczba którą wpisałeś " +liczba);
    }

}
