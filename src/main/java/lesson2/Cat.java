package lesson2;

public class Cat {
    private String name;
    private int appetite;

    private boolean satiety;
    public Cat(String name, int appetite, boolean satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public boolean isSatiety() {
        return satiety;
    }

    public void setSatiety(boolean satiety) {
        this.satiety = satiety;
    }

    public void eat(int plate) {
        if (appetite <= plate){
            System.out.println("Кот " + name + " сыт!");
            satiety = true;
        } else {
            satiety = false;
            System.out.println("Кот " + name + " голоден!");
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
