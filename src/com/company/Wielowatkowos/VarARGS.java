package com.company.Wielowatkowos;

public class VarARGS {

    public static double suma(int argument1, int... argumenty) {
        double suma = argument1;
        for (int i = 0; i < argumenty.length; i++) {
            suma += argumenty[i];
        }
        return (suma / (argumenty.length + 1));
    }

    public static void main(String[] args) {

        System.out.println((suma(3, 3, 3, 3, 3, 3, 3, 3)));
    }
}



