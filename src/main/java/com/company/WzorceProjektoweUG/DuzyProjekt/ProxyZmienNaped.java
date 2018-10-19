package com.company.WzorceProjektoweUG.DuzyProjekt;

public class ProxyZmienNaped implements ZmianaNaped {

    ZmianaNaped zmiana = null;

    public ProxyZmienNaped(String naped) {
        switch (naped.toLowerCase()){
            case "kola":
                this.zmiana = new ZmienNaKola();
                break;
            case "gasiennice":
                this.zmiana = new ZmienNaGasiennice();
                break;
            default:
                break;

        }
    }

    @Override
    public void zmienNaped(Robot r1) {
        if (zmiana != null){
            zmiana.zmienNaped(r1);
        }
        else {
            System.out.println("Nie można zmienic napędu!");
        }
    }


}
