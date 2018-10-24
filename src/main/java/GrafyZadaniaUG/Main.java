package GrafyZadaniaUG;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;



//zadania sprzed tygodnia sa na za tydzień.
// te z dzis są na 7 listopada. Ogolnie rzecz ujmujac sporo tych zadan, ale to raczej dobrze.

public class Main {

    public static void main(String[] args) throws IOException { // wyjątek ze względu na odczyt zapis plików

        Utils utils = new Utils();

//        try {
//            utils.writeToFile();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (UnsupportedEncodingException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


        utils.readFromFile();

        System.out.println("\n" + Utils.getLiczbaWierszyMacierzy());

        Graf graf = new Graf();
//        utils.dodajWierzcholekRoBOCZANAZWA();
        utils.wyswietlTablice();

        utils.readFromFile();

        utils.removeAllFromFile();

//        utils.writeToFile("123adw");
        //  utils.addRowToFile("0 0 0 0 0"); // brak pionowych p


//        System.out.println(Graf.macierzGrafu[1][2]);

    }
}