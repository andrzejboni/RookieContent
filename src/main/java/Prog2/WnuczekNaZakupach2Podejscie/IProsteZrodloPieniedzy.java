package Prog2.WnuczekNaZakupach2Podejscie;

public interface IProsteZrodloPieniedzy extends IZrodloPieniedzy {

    void ustawKwote(Integer kwota);
    void dodajKwote(Integer kwota);

    // kwtoa ktora chcemy pobrac  z proste zrodla
    // zwracana kwotamoze byc mniejsza lu owna zawartosci
    // przyklad , chce pobrac 200 pln ze zrodla ktore zawiera tylko 100 -  dostaje 100;


    void odejmijKwote(Integer kwota);

    FormaPieniedzy getFormaPieniedzy();
}
