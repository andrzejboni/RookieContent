package com.company.WzorceProjektoweUG.DuzyProjekt;

public class ObserwatorCzyJedzie extends Obserwator{


    @Override
    public void update() {
        if (robot.getPredkosc() != 0){
            System.out.println("Robot jedzie!");
        }



    }
}
