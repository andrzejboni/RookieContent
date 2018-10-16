package com.company.WzorceProjektoweOnceAgain.Composite;

public abstract class JobComponent {
    public String name;

    protected JobComponent(String name) {
        this.name = name;
    }

    public abstract void completeJob();

    public abstract void addJob(FinalJobLeaf drinkCoffe);
}
