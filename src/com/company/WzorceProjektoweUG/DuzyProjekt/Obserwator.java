package com.company.WzorceProjektoweUG.DuzyProjekt;

public abstract class Obserwator {
    protected Robot robot;

    public abstract void update();

    public void setSubject(Robot robot){
        System.out.println("Podlaczano "+robot.toString());
        this.robot = robot;
        robot.podlacz(this);

    }


}



