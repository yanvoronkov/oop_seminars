package lesson6.srp2;

public class OrderCreator {
    public Order createOrder() {
        InputFromConsole input = new InputFromConsole();
        String clientName = input.readString("Client name: ");
        String product = input.readString("Product: ");
        int qnt = input.readInt("Quantity: ");
        int price = input.readInt("Price: ");

        return new Order(clientName, product, qnt, price);
    }
}
