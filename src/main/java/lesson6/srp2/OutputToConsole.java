package lesson6.srp2;

public class OutputToConsole {
    public void writeOrder(Order order) {
        System.out.println("Client name: " + order.getClientName());
        System.out.println("Product: " + order.getProduct());
        System.out.println("Quantity: " + order.getQnt());
        System.out.println("Price: " + order.getPrice());
    }
}
