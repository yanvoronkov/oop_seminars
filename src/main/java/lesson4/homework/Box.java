package lesson4.homework;

import java.util.ArrayList;

class Box<T extends Fruit> {
    private ArrayList<T> fruits;

    public Box() {
        fruits = new ArrayList<>();
    }

    public void addFruit(T fruit) {
        fruits.add(fruit);
    }

    public float getWeight() {
        float weight = 0.0f;
        for (T fruit : fruits) {
            weight += fruit.getWeight();
        }
        return weight;
    }

    public boolean compare(Box<?> box) {
        return getWeight() == box.getWeight();
    }

    public void transfer(Box<T> box) {
        if (this == box) {
            return;
        }

        if (!fruits.isEmpty()) {
            box.fruits.addAll(fruits);
            fruits.clear();
            System.out.println("Фрукты перемещены!");
        }

    }

}
