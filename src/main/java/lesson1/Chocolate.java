package lesson1;

public class Chocolate extends Product {
    private String typeOfChocolate; //вид шоколада
    private int cocoaContent; //прооцент содержания какао

    public String getTypeOfChocolate(String cocoaContent) {
        return typeOfChocolate;
    }

    public void setTypeOfChocolate(String typeOfChocolate) {
        this.typeOfChocolate = typeOfChocolate;
    }

    public int getCocoaContent() {
        return cocoaContent;
    }

    public void setCocoaContent(int cocoaContent) {
        this.cocoaContent = cocoaContent;
    }

    public Chocolate(String brand, String name, double price, String typeOfChocolate, int cocoaContent) {
        super(brand, name, price);
        this.typeOfChocolate = typeOfChocolate;
        this.cocoaContent = cocoaContent;
    }
    public String displayInfo() {
        return String.format("[Бутылка]%s - %s - %f - [тип: %s; содержание какао: %d%%]", brand, name, price, typeOfChocolate, cocoaContent);
    }

}
