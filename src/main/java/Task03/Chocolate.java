package Task03;
/**
 * Класс Шоколад
 * Имеет уникальный параметр Вид (темный, молочный, белый)
 */
public class Chocolate extends Sweets {
    private String type;//Вид шоколада

    public Chocolate () {}

    public Chocolate(double weight, double price, String type) {
        super(weight, price);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Шоколад {" +
                "Вид: " + type + ", "+
                super.toString() + "}";
    }
}
