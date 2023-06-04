package lesson2;

import lesson1.Product;

import java.util.ArrayList;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {

        Cat cat1 = new Cat("Барсик", 50, false);
        Cat cat2 = new Cat("Тимоша", 60, false);
        Cat cat3 = new Cat("Жорик", 30, false);

        List<Cat> cats = new ArrayList<>();
        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);

        Plate plate = new Plate(10);
        plate.info();

        for (Cat cat: cats) {
            cat.eat(plate.getFood());
            if (cat.isSatiety()) {
                plate.setFood(plate.getFood() - cat.getAppetite());
            }
            plate.info();
        }

        plate.addFood(50);

        plate.info();

    }
}
