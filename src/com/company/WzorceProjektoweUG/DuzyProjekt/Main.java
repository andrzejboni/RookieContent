package com.company.WzorceProjektoweUG.DuzyProjekt;

public class Main {

    public static void main(String[] args) {
    FabrykaRobotow fabryka = FabrykaRobotow.getInstance();

    Robot r1 =  new SzybkiRobot(fabryka.createRobot("k1","Koparka"));



    System.out.println(r1.Wypisz());

    BudowniczyRobotow builder = new BudowniczyRobotow("k2");

    Robot r2 = new SzybkiRobot(builder.setNazwa("kw").setBateria("Li-Ion").
            setPojemnoscBaterii(5000).setSilnik("GM-10W").setIlosc(4).setNaped("Koła").returnRobot());


        System.out.println(r2.Wypisz());

        Obserwator r = new ObserwatorCzyJedzie();
      //  Obserwator rr = new ObserwatorCzyJedzie();
        r.setSubject(r2);
      //  rr.setSubject(r1);

        ZmianaNaped z1 = new ProxyZmienNaped("kola");
    z1.zmienNaped(r2);
    System.out.println(r2.Wypisz());

    r2.jedzPrzod();
    r2.jedzLewo();
    r2.zatrzymaj();
    r2.jedzPrawo();

    //r1.jedzPrzod();




    }
}









