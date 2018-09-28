package Queue.LIFO;

import java.util.Stack;

public class LIFOMain{
    //        Zadanie 1:
//        Stwórz enuma DishType (rodzaj naczynia), który ma kilka wymyślonych przez ciebie wartości.
//        Stwórz klasę Dish, która jako pole przechowuje DishType.
//        Stwórz klasę Sink, która ma metodę throwDish(Dish dish) oraz metodę clean(), która zwraca Optional<Dish>.

    public static void main(String[] args) {
// Circular FIFO queue

        Dish d1 = new Dish(DishType.Fork);
        Dish d2 = new Dish(DishType.Plate);
        Dish d3 = new Dish(DishType.Spoon);
        Dish d4 = new Dish(DishType.Glass);

        Sink sink = new Sink();  // Można to uznać za zlew do którego wrzucamy brudne naczynia czy cos podobnego

        sink.throwDish(d1);
        sink.throwDish(d2);
        sink.throwDish(d3);
        sink.throwDish(d4);

        System.out.println(sink.clean());
        System.out.println(sink.clean());

//        System.out.println(sink.clean());
//        System.out.println(sink.clean());

    }
}
