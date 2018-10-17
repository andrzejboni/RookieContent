package com.company.WzorceProjektoweOnceAgain.Observer;

public class Main {
    public static void main(String[] args) {
        SubscriberObservable tomek = new SubscriberObservable("Tomek");
        SubscriberObservable janek = new SubscriberObservable("Janek");
        SubscriberObservable zych = new SubscriberObservable("Zych");
        SubscriberObservable heniek = new SubscriberObservable("Heniek");
        Observable rych = new SubscriberVIPObservable("Ignac","HufflePuff");
        Observable ronald = new SubscriberVIPObservable("Romuald","von RavenClaw");
        Observable pomelo = new SubscriberVIPObservable("Grzyb","Ewidentny");

        CKMObserver ckmRedaction = new CKMObserver();
        ckmRedaction.subscribe(tomek);
        ckmRedaction.subscribe(ronald);
        ckmRedaction.subscribe(janek);
        ckmRedaction.subscribe(rych);
        ckmRedaction.subscribe(zych);
        ckmRedaction.subscribe(heniek);
        ckmRedaction.subscribe(pomelo);

        ckmRedaction.sentToAll();
    }
}
