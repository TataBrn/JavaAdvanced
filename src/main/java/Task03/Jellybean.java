package Task03;
/**
 * Класс Жевательные конфеты
 * Имеет уникальный параметр Цвет (красный, желтый и т.д.)
 */
public class Jellybean extends Sweets{
    private String color;// Цвет

    public Jellybean () {}

    public Jellybean(double weight, double price, String color) {
        super(weight, price);
        this.color = color;
    }

    public String getFlavor() {
        return color;
    }

    public void setFlavor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Жевательные конфеты {" +
                "Цвет: " + color + ", "+
                 super.toString() + "}";
    }

}
