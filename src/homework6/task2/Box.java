package homework6.task2;

import java.util.ArrayList;
import java.util.List;

public class Box<E extends Fruit> {
    private final List<E> fruits = new ArrayList<>();

    public float getWeight() {
        float sum = 0.0f;
        for (E fruit : fruits) {
            sum += fruit.getWeight();
        }
        return sum;
    }

    public void addToBox(E fruit) {
        fruits.add(fruit);
    }

    public boolean compare(Box<?> box) {
        return getWeight() == box.getWeight();
    }

    public void putInAnotherBox(Box<E> box) {
        box.fruits.addAll(fruits);
        fruits.clear();
    }
}
