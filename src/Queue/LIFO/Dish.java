package Queue.LIFO;

import java.util.Stack;

public class Dish {


    Enum dishType;

    Stack<DishType> stack = new Stack<>();

    Dish(DishType dishType) {
        this.dishType = dishType;
    }

}
