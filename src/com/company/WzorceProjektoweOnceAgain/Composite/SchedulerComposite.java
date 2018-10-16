package com.company.WzorceProjektoweOnceAgain.Composite;

import java.awt.*;
import java.util.LinkedList;
import java.util.List;

public class SchedulerComposite extends JobComponent {

    List<JobComponent> sheduledJobComponents;


    public SchedulerComposite(String name) {
        super(name);
        sheduledJobComponents = new LinkedList();
    }

    public void addJob(JobComponent component) {
        sheduledJobComponents.add(component);
    }

    public void removeJob(JobComponent component) {
        sheduledJobComponents.remove(component);
    }

    public void listAllComponents() {
        for (JobComponent component :
                this.sheduledJobComponents) {

            component.completeJob();
            if (component instanceof SchedulerComposite) {
                SchedulerComposite subTask = (SchedulerComposite) component;
                subTask.listAllComponents();
            }
        }
    }

    @Override
    public void completeJob() {
        System.out.println("You finished the job" + this.name);
    }

    @Override
    public void addJob(FinalJobLeaf drinkCoffe) {

    }
}
