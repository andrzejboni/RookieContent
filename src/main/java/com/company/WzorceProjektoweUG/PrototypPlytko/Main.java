package com.company.WzorceProjektoweUG.PrototypPlytko;

public class Main { // Kopiowanie płytkie

    public static void main(String[] args) throws CloneNotSupportedException {
        Asortyment asortyment = new Asortyment();
        asortyment.setNazwa("Koszyki słodkości na każdą okazję");
        asortyment.dodajZawartosc();
        System.out.println("Koszyk słodkości na każdą okazję, bez zmian:");
        System.out.println(asortyment);

        Asortyment cloned = (Asortyment)asortyment.clone();
        System.out.println("\nNazwa sklonowanych koszyków:");
        System.out.println(cloned.getNazwa());
        cloned.setNazwa("Cloned Koszyki Słodkości na każdą okazję");

        System.out.println("\nUsuwam Koszyk Słodkości na urodziny (nr 3)");
        asortyment.getZawartoscKoszyka().remove(2);

        System.out.println("\nKoszyki słodkości na każdą okazję");
        System.out.println(asortyment);
        System.out.println("\nKoszyki słodkości na każdą okazję (sklonowane):");
        System.out.println(cloned);
    }
}
