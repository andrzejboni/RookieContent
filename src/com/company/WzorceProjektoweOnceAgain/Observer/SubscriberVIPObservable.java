package com.company.WzorceProjektoweOnceAgain.Observer;

public class SubscriberVIPObservable implements Observable {
    private String firstName;
    private String lastName;

    public SubscriberVIPObservable(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void readNewspaper(String name) {
        System.out.println(
                this.firstName + " " + this.lastName + " czyta gazetę prenumerowaną " + name + " gazeta ta jest VIP w twardej oprawie");
    }

    public void playDVD() {
        System.out.println(this.firstName + " odtwarza film gra o tron");

    }


}
