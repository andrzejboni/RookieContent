package Dentysta;

import java.util.*;

public class RegistrationDesk<n> {
    int klucz;


    Random rand = new Random();
    int n = rand.nextInt(999) + 1;


    public synchronized static String generateUniqueId() {
        UUID uuid = UUID.randomUUID();

        return uuid.toString().replaceAll("-", "").toUpperCase();
    }

    Map<String, Pacjent> mapaPacjentow = new HashMap<String, Pacjent>();
//
//    public void wypiszWszystkichPacjentow(){
//        for (int i = 0; i < mapaPacjentow.size(); i++) {
//            System.out.println(mapaPacjentow);
//        }
//    }


    @Override
    public String toString() {
        return "RegistrationDesk{" +
                "mapaPacjentow=" + mapaPacjentow +
                '}';
    }

    public boolean dodajPacjentaDoMapy(Pacjent pacjent) {

        if (mapaPacjentow.containsKey(mapaPacjentow.get(pacjent))) {
            return false;
        }
        String nrId = generateUniqueId();
        mapaPacjentow.put(nrId, pacjent);

        return true;

    }

    Map<String, Visit> mapaWizyt = new HashMap<String, Visit>();

    public String register(Visit visit) {

        String nrId = generateUniqueId();

        mapaWizyt.put(nrId, visit);

        return nrId;
    }


}
