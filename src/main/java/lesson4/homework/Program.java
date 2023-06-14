package lesson4.homework;

public class Program {

    /**
     Домашняя работа, задача:
     ========================

     a. Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
     b. Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта,
     поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
     c. Для хранения фруктов внутри коробки можно использовать ArrayList;
     d. Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество:
     вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);
     e. Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той, которую
     подадут в compare() в качестве параметра. true – если их массы равны, false в противоположном случае.
     Можно сравнивать коробки с яблоками и апельсинами;
     f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую.
     Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами.
     Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в первой;
     g. Не забываем про метод добавления фрукта в коробку.
     */
    public static void main(String[] args) {

        Box<Apple> boxOfApples1 = new Box<>();// создана первая коробка для яблок

        boxOfApples1.addFruit(new Apple());
        boxOfApples1.addFruit(new Apple());
        boxOfApples1.addFruit(new Apple());//добавлены три яблока в коробку boxOfApples1

        Box<Apple> boxOfApples2 = new Box<>();// создана вторая коробка для яблок

        boxOfApples2.addFruit(new Apple());//добавлено одно яблоко в коробку boxOfApples2

        System.out.println("Вес коробки boxOfApples1: " + boxOfApples1.getWeight());
        System.out.println("Вес коробки boxOfApples2: " + boxOfApples2.getWeight());

        System.out.println("Ящики boxOfApples1 и boxOfApples2 одинакового веса? " + boxOfApples1.compare(boxOfApples2));

        Box<Orange> boxOfOranges = new Box<>();// создана коробка boxOfOranges

        boxOfOranges.addFruit(new Orange());
        boxOfOranges.addFruit(new Orange());//добавлены два апельсина в коробку boxOfOranges

        System.out.println("Вес коробки boxOfOranges: " + boxOfOranges.getWeight());

        System.out.println("Ящики boxOfApples1 и boxOfOranges одинакового веса? " + boxOfApples1.compare(boxOfOranges));

        boxOfApples1.transfer(boxOfApples2);//перемещены все яблоки из коробки boxOfApples1 в коробку boxOfApples2


        System.out.println("Weight of boxOfApples1 after transfer: " + boxOfApples1.getWeight());
        System.out.println("Weight of boxOfApples2 after transfer: " + boxOfApples2.getWeight());


    }

}
