package com.company.WzorceProjektoweOnceAgain.Singleton;

public final class Singleton {


//    private static Singleton instance;
    private String login;
    private String password;
    private static Singleton instance = new Singleton("123adwwd","wad2");  // domyslny konstruktor
//    private Singleton instance = new Singleton("21ewd","ahdlw"); // nadpisany konstruktor

    private Singleton() {
        this("adwkjl","aiwhd");
    }


    private Singleton(String login, String password){
        this.login = login;
        this.password = password;
    }

    public String getLogin(){
        return login;
    }

    public String getPassword(){
        return password;
    }


    public static Singleton getInstance() {
        return instance;
    }


}
