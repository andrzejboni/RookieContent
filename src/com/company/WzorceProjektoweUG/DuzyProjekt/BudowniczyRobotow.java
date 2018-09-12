package com.company.WzorceProjektoweUG.DuzyProjekt;

public class BudowniczyRobotow {

    private Robot robot;

    public BudowniczyRobotow(String nazwa) {
        this.robot = new KoparkaRobot(nazwa,"Koparka");
    }
    public BudowniczyRobotow setNazwa(String nazwa){
        this.robot.setNazwa(nazwa);
        return this;
    }
    public BudowniczyRobotow setSilnik(String silnik){
        this.robot.setSilnik(silnik);
        return this;
    }
    public BudowniczyRobotow setIlosc(int napedIlosc){
        this.robot.setNapedIlosc(napedIlosc);
        return this;
    }
    public BudowniczyRobotow setBateria(String bateria){
        this.robot.setBateria(bateria);
        return this;
    }
    public BudowniczyRobotow setPojemnoscBaterii(int pojemnoscBaterii){
        this.robot.setPojemnoscBaterii(pojemnoscBaterii);
        return this;
    }
    public BudowniczyRobotow setNaped(String naped){
        this.robot.setNaped(naped);
        return this;
    }


    public Robot returnRobot(){
        return robot;
    }

}
