package Task03;

public class Base {
    public static void main(String[] args) {
        Candy candy1 = new Candy (0.10, 120.00, "Лимон");
        Candy candy2 = new Candy (0.15, 250.00, "Орех");
        Jellybean jelly1 = new Jellybean(0.2, 170.00, "Красный");
        Jellybean jelly2 = new Jellybean(0.1, 170.00, "Желтый");
        Chocolate choco1 = new Chocolate(0.1, 110.00, "Темный");

        Sweets [] present =  {candy1, candy2, jelly1, jelly2, choco1};

        double totalWeight = 0; //Общий вес подарка
        double totalPrice = 0; // Общая стоимость подарка

        System.out.println("Подарок включает:");

        for (Sweets sweet : present) {
            System.out.println(sweet.toString());
            totalWeight += sweet.getWeight();
            totalPrice += sweet.getPrice();
        }

        System.out.printf("Общий вес подарка %5.2f\n", totalWeight);
        System.out.printf("Общая стоимость подарка %5.2f\n", totalPrice);

    }

}
