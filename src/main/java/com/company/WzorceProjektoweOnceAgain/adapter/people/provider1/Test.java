package com.company.WzorceProjektoweOnceAgain.adapter.people.provider1;

public class Test {
    public static void main(String[] args) {
        FileDataProvider fileDataProvider = new FileDataProvider();
        fileDataProvider.initAndLoad();

        System.out.println(fileDataProvider.getPeopleList());
    }
}
