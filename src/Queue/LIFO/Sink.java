package Queue.LIFO;

import java.util.Stack;

public class Sink {

    Stack<Dish> stack = new Stack<>();

    public void throwDish(Dish dish) {
        stack.push(dish);
    }
    public void clean(){
        stack.pop();

    }  // ZWRÓC OPSZOJONALA<Dish>
}
