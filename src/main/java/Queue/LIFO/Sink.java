package Queue.LIFO;

import java.util.Stack;

import java.util.Optional;

public class Sink {

    Stack<Dish> stack = new Stack<>();

    public void throwDish(Dish dish) {
        stack.push(dish);
    }
//    public void clean(){
//        stack.pop();
//
//    }  // ZWRÓC Optionala<Dish>


    public Optional<Dish> clean() { // To chyba miało być tak!?
//        stack.pop();
        return Optional.ofNullable(stack.pop());
    }


}
