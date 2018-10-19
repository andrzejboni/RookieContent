package com.company.WzorceProjektoweOnceAgain.Strategy;

import java.util.Arrays;
import java.util.StringJoiner;

public class FormaterInverter implements FormatterFont {
    @Override
    public String format(String textToFormat) {
        final byte firstASCIILetterSignSmall = 65;
        final byte lastASCIILetterSignSmall = 90;
        final byte displacementSmallAndBigLetterASCII = 32;
        final byte firstAsciiletterSignBig = 97;
        final byte lastASCIILetterSignBig = 122;


        byte[] tablica = textToFormat.getBytes();

        for (int i = 0; i < tablica.length; i++) {
            if (tablica[i] >= firstASCIILetterSignSmall && tablica[i] <= lastASCIILetterSignSmall) {
                tablica[i] = (byte) (tablica[i] + displacementSmallAndBigLetterASCII);
            } else if (tablica[i] >= firstAsciiletterSignBig && tablica[i] <= lastASCIILetterSignBig) {
                tablica[i] = (byte) (tablica[i] - displacementSmallAndBigLetterASCII);
            }
        }


        char[] paszczan = new char[10];

        for (int i = 0; i < paszczan.length; i++) {
            paszczan[i] = 'a';
        }

        return new String(tablica);
    }
}
