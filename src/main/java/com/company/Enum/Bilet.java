package com.company.Enum;

public enum Bilet {
    ULGOWY_CAŁODNIOWY(3.00d, 480),
    ULGOWY_GODZINNY(1.10d, 60),
    NORMALNY_GODZINNY(1.80d, 60),
    NORMALNY_CALODNIOWY(4.0d, 480),
    BRAK_BILETU(0d, 0);

    private double cena;
    private int czasJazdy;

    Bilet(double cena, int czasJazdy) {
        this.cena = cena;
        this.czasJazdy = czasJazdy;
    }

    public double pobierzCene() {
        return this.cena;
    }

    public int pobierzCzasJazdy() {
        return this.czasJazdy;
    }


    public void wyswietlDaneObilecie() {
        System.out.println("Bilet ważny " + pobierzCzasJazdy() + " minut, kosztował " + pobierzCene());
    }

    public static Bilet jakiBilet(int czasJazdy, double kwota, boolean czyUlgowy) {
        if (kwota < 1.10d) {
            System.out.println("Nie masz wystarczajacych srodków!");
            return BRAK_BILETU;
        }

        if (czyUlgowy) {
            if (kwota > 3.000d) {
                if (czasJazdy > 60) {
                    return ULGOWY_CAŁODNIOWY;
                } else {
                    return ULGOWY_GODZINNY;
                }
            } else {
                return ULGOWY_GODZINNY;
            }
        } else {
            if (kwota > 4.00d) {
                if (czasJazdy > 60) {
                    return NORMALNY_CALODNIOWY;
                } else {
                    return NORMALNY_GODZINNY;
                }
            }
            else {return NORMALNY_GODZINNY;}

        }

    }


}
