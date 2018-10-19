package Comparator;

import SalaKonferencyjna.SalaKonferencyjna;

import java.util.Comparator;

public class SalaKonfComparator implements Comparator<SalaKonferencyjna> {
    @Override
    public int compare(SalaKonferencyjna o1, SalaKonferencyjna o2) {

        if (o1.getPojemnoscSali() > o2.getPojemnoscSali()) {return -1;}
        if (o1.getPojemnoscSali() < o2.getPojemnoscSali()) {return 1;}
        return 0;

    }
}
