package Dentysta;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class RegistrationDesk<n> {
    int klucz;


    Random rand = new Random();
    int n = rand.nextInt(999) + 1;


    Map<Integer, Visit> mapa = new HashMap<>();


    public int register(Visit visit) {
        mapa.put((n + 1), visit);

//        LocalDateTime.ofEpochSecond();

        return 1;
    }
}
