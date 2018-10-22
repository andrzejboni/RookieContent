package GrafyZadaniaUG;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class Main {

    public static void main(String[] args) throws IOException { // wyjątek ze względu na odczyt zapis plików
        Graf graf = new Graf();
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

        System.out.println("\n"+Utils.getLiczbaWierszyMacierzy());

      //  utils.addRowToFile("0 0 0 0 0"); // brak pionowych p


//        System.out.println(Graf.macierzGrafu[1][2]);

    }
}