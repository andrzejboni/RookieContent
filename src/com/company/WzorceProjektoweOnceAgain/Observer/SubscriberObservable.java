package com.company.WzorceProjektoweOnceAgain.Observer;

public class SubscriberObservable implements Observable {
    private String name;

    public SubscriberObservable(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void readNewspaper(String name) {
        System.out.println(name+ " przeczytał gazetę z prenumeraty o nazwie CKM");
    }
}
