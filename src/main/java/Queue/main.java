package Queue;

import PortalStudenta.Student;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class main {
    public static void main(String[] args) {
        //queue - Kolejka - najczesciej FIFO - first in, first out
        //jak kolejka w poczekalni

        //najpopularniejsza implementacja kolejki FIFO to LinkedLista
        Queue<String> queue = new LinkedList<String>();
        //dodajemy elementy metoda add()
        queue.add("1");
        queue.add("2");
        queue.add("3");
        //poczatek kolejki to HEAD (glowa)
        //  HEAD->1,2,3 <-TAIL
        //koniec kolejki to TAIL (ogon)
        System.out.println(queue);
        //remove zwraca pierwszy element, jednoczesnie usuwajac go z kolejki (HEAD)
        queue.remove();
        queue.remove();
        System.out.println(queue);
        queue.remove();
//        jesli nie ma juz zadnego elementu, remove rzuci Exception
//        queue.remove();  //<-rzuci exception
//
        //zamiast remove(), mozemy uzywac

        queue.poll(); // także usuwa elementy z kolejki

        //poll zwraca nulla, zamiast rzucac exception
        System.out.println(queue.poll());

        //mamy tez peek(), ktory "podglada glowe" - czyli zwraca, ale nie usuwa z kolejki
//
//        queue.add("1");
//        queue.add("2");
//        queue.add("3");
//        queue.add("4");
//
//
//        System.out.println(queue);
//        System.out.println(queue.peek());
//        System.out.println(queue);


        Queue<Student> kolejka= new LinkedList<Student>();
        Student s1 = new Student("Rych","Zych",123, Arrays.asList(1.2,2.2,3.0,1.2));

        kolejka.add(s1);
        kolejka.add(s1);
        kolejka.add(s1);



        System.out.println(kolejka.peek());
        kolejka.peek();



    }
}
