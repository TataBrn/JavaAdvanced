package Task03;

/**
 * Сладости
 * Имеют своё название, вес, цену
 */
public abstract class Sweets {
    private double weight; //Вес
    private double price; //Цена

    public Sweets () {}

    public Sweets(double weight, double price) {
        this.weight = weight;
        this.price = price;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Вес: " + weight +
                ", Цена: " + price;
    }
}
