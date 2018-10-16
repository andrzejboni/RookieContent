package com.company.WzorceProjektoweOnceAgain.Composite;

public class Main {
    public static void main(String[] args) {

        SchedulerComposite mondayScheduler = new SchedulerComposite(" Monday scheduler");
        SchedulerComposite friedEggs = new SchedulerComposite(" FriedEggs");
        SchedulerComposite madeCoffe = new SchedulerComposite(" Coffe");
        FinalJobLeaf readNewspaper = new FinalJobLeaf();

        SchedulerComposite breakfast = new SchedulerComposite(" Breakfast");
        breakfast.addJob(friedEggs);
        breakfast.addJob(madeCoffe);
//        breakfast.addJob(readNewspaper);

        SchedulerComposite lunch = new SchedulerComposite(" Lunch");
        SchedulerComposite friedSteak = new SchedulerComposite(" friedSteak");
        FinalJobLeaf drinkCoffe = new FinalJobLeaf();
        lunch.addJob(friedSteak);
        lunch.addJob(drinkCoffe);


        mondayScheduler.addJob(breakfast);
        mondayScheduler.addJob(lunch);
        mondayScheduler.listAllComponents();
    }
}
