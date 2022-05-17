package Task03;

/**
 * Класс Конфеты
 * Имеет уникальный параметр Вкус (клубника, лимон, орех и т.д.)
 */

public class Candy extends Sweets {
    private String flavor;//Вкус

    public Candy () {}

    public Candy(double weight, double price, String flavor) {
        super(weight, price);
        this.flavor = flavor;
    }

     public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    @Override
    public String toString() {
        return "Конфеты {" +
                "Вкус: " + flavor + ", " +
                super.toString() + "}";
    }
}
