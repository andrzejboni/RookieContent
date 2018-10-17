package com.company.WzorceProjektoweOnceAgain.Observer;

import java.util.ArrayList;
import java.util.List;

public class CKMObserver {

    private final String name = "CKM";


    List<Observable> subscribers;

    public CKMObserver() {
        this.subscribers = new ArrayList<Observable>();
    }

    public void subscribe(Observable subscriber) {
        this.subscribers.add(subscriber);
    }

    public void sentToAll() {
        for (Observable subscriber : this.subscribers) {

            subscriber.readNewspaper(name);
        }
    }
}
