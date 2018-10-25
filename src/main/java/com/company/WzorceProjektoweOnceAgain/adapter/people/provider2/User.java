package com.company.WzorceProjektoweOnceAgain.adapter.people.provider2;

import java.time.LocalDate;

public class User {
    private int identifier;
    private String nameAndSurname;
    private String socialIdentifier;
    private LocalDate birthDate;

    public User(int identifier, String nameAndSurname, String socialIdentifier, LocalDate birthDate) {
        this.identifier = identifier;
        this.nameAndSurname = nameAndSurname;
        this.socialIdentifier = socialIdentifier;
        this.birthDate = birthDate;
    }

    public int getIdentifier() {
        return identifier;
    }

    public void setIdentifier(int identifier) {
        this.identifier = identifier;
    }

    public String getNameAndSurname() {
        return nameAndSurname;
    }

    public void setNameAndSurname(String nameAndSurname) {
        this.nameAndSurname = nameAndSurname;
    }

    public String getSocialIdentifier() {
        return socialIdentifier;
    }

    public void setSocialIdentifier(String socialIdentifier) {
        this.socialIdentifier = socialIdentifier;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "User{" +
                "identifier=" + identifier +
                ", nameAndSurname='" + nameAndSurname + '\'' +
                ", socialIdentifier='" + socialIdentifier + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }
}
