package lesson6;

import lesson6.srp2.*;

public class Program {

    /**
     * TODO: Задача 1. Домашняя работа. Оптимизировать работу класса Order в рамках принципа SRP.
     * @param args
     */

        public static void main(String[] args) {
            OrderCreator creator = new OrderCreator();
            Order order = creator.createOrder();

            SaveToJson serializer = new SaveToJson(order);
            serializer.saveToJson(order);

            OutputToConsole output = new OutputToConsole();
            output.writeOrder(order);
        }

}
