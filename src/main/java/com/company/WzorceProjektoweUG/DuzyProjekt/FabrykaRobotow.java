package com.company.WzorceProjektoweUG.DuzyProjekt;

public class FabrykaRobotow {

    private static FabrykaRobotow instance;

    private FabrykaRobotow() {}

    public static FabrykaRobotow getInstance(){ // Singleton

            if (instance==null){
                synchronized (FabrykaRobotow.class){
                    if (instance == null){
                        instance = new FabrykaRobotow();
                    }
                }
                instance = new FabrykaRobotow();
            }
            return instance;
    }


    public Robot createRobot(String nazwa, String typ){
        switch (typ) {
            case "Koparka":
                return new KoparkaRobot(nazwa, typ, "GM-10W", "Koła", 4, "Li-Ion", 5000);
               // break;
            case "Wiertnica":
               // break;
                return new WiertnicaRobot(nazwa, typ, "W-15W", "Gąsiennice", 2, "Li-Pol", 3000);
            case "Ladowarka":
               // break;
                return new LadowarkaRobot(nazwa, typ, "GM-5W", "Koła", 4, "Li-Ion", 8000);

                default:
                    return new PodstawowyRobot(nazwa,typ);
        }
    }

}
