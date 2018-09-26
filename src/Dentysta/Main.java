package Dentysta;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
//
//        1. Aplikacja do rejestracji klientów na wizyty u dentysty/ortodonty, oraz do prowadzenia
// dokumentacji pacjentów.
//
//-stwórz klasę Patient, która będzie przechowywała dane osobowe pacjenta.
//-stwórz klasę Visit, która będzie przechowywała szczegóły dotyczące danej wizyty, takie jak:
// pacjent, data,
//imię i nazwisko lekarza, do którego rezerwowana jest wizyta, cena wizyty i dodatkowe szczegóły
// (jeśli chcesz),

//-stwórz klasę RegistrationDesk, która będzie miała metodę register(Visit visit), zwracającą
// numer identyfikacyjny nowej wizyty

//-pacjenci i wizyty powinny być zapisywane do lokalnej bazy danych składającej się z  plików
// tekstowych. Stwórz do tego
//        oddzielną klasę. Powinna ona mieć metody zwracające wizyty i pacjentów. Zastanów się
// nad różnymi argumentami tych metod.
//
        // Dwie mapy -> jedna do wizyt jedna do rejstracji pacjentow

        RegistrationDesk registrationDesk = new RegistrationDesk();

//        registrationDesk.



        Pacjent p1 = new Pacjent("Jonasz", "Sroka", 111L);
        Pacjent p2 = new Pacjent("Jonasz", "Sroka", 222L);
        Pacjent p3 = new Pacjent("Jonasz", "Sroka", 333L);
        Pacjent p4 = new Pacjent("Jonasz", "Sroka", 444L);

        Visit w1 = new Visit(p1, "12.12.12", TypLekarza.Dentysta, 120);
        Visit w2 = new Visit(p2, "13.12.12", TypLekarza.Ortodata, 350);
        Visit w3 = new Visit(p3, "14.12.12", TypLekarza.Dentysta, 150);
        Visit w4 = new Visit(p4, "15.12.12", TypLekarza.Ortodata, 300);

        registrationDesk.mapaWizyt.put(registrationDesk.register(w1),w1);
        registrationDesk.mapaWizyt.put(registrationDesk.register(w2),w2);
        registrationDesk.mapaWizyt.put(registrationDesk.register(w3),w3);
        registrationDesk.mapaWizyt.put(registrationDesk.register(w4),w4);

        Zapisywanie zapisywanie = new Zapisywanie();

        try {
            zapisywanie.zapisz(registrationDesk);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
