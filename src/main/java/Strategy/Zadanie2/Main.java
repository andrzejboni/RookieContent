package Strategy.Zadanie2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        List<Student> lista = new ArrayList<>();
        lista.add(new Student("Janusz", "Tracz", 123));
        lista.add(new Student("Jan", "Add", 444));
        lista.add(new Student("Zen", "Bubuel", 111));
        lista.add(new Student("GRzech", "Sznur", 222));
        lista.add(new Student("Rych", "Prych", 333));

        StratZapisu1 stratZapisu1 = new StratZapisu1();

        stratZapisu1.zapisz(lista);
        stratZapisu1.zapisz(lista);


    }
}
