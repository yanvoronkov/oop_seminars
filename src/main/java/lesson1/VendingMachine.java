package lesson1;

import java.util.List;

public class VendingMachine {

    private List<Product> products;


    public VendingMachine(List<Product> products) {
        this.products = products;
    }

    public Chocolate getChocolate(String cocoaContent){
        for (Product product : products){
            if (product instanceof Chocolate){
                if (((Chocolate)product).getTypeOfChocolate(cocoaContent).equals(cocoaContent)){
                    return (Chocolate)product;
                }
            }
        }
        return null;
    }

    public BottleOfWater getBottleOfWater(double volume){
        for (Product product : products){
            if (product instanceof BottleOfWater){
                if (((BottleOfWater)product).getVolume()  == volume){
                    return (BottleOfWater)product;
                }
            }
        }
        return null;
    }


}
