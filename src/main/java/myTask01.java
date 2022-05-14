import java.io.IOException;
import java.util.Scanner;

public class myTask01 {
    public static void main(String[] args) throws IOException {
        startCalculate ();
    }
    /**
     * Выполнение операций (сложение, вычитание, умножение, деление) над двумя дробными числами
     * Вывод результата с точностью до 4 знаков
     * @author Miller Tatyana
     * @see #doOperation(float, float, char)
     */
    public static void startCalculate () throws IOException {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите первое число");
        float num1 = scan.nextFloat();//Первое число
        System.out.println("Введите второе число");
        float num2 = scan.nextFloat();//Второе число
        System.out.println("Введите действие:");
        System.out.println("+ - чтобы найти сумму чисел");
        System.out.println("- чтобы найти разность чисел");
        System.out.println("* - чтобы найти произведение чисел");
        System.out.println("/ - чтобы найти частное чисел");
        int x = System.in.read();
        char operation = (char) x; //Символ операции

        //Если ввели допустимый знак, то вызываем метод для выполнения операции
        if ((operation == '+') || (operation == '-') || (operation == '*') || (operation == '/')){
            // Если выбрали деление, проверяем, что второе число - не ноль
            if ((operation == '/') && (num2 == 0)){
                System.err.println("На ноль делить нельзя!");
            }
            else {
                float result = doOperation (num1, num2, operation);
                System.out.printf("%9.4f %c %9.4f = %9.4f", num1, operation, num2, result);
            }
        }
        else {
            System.err.println("Нет такой операции");
        }
        scan.close();

    }
    /**
     *
     * @author Miller Tatyana
     * @param num1 число 1
     * @param num2 число 2
     * @param op операция над числами
     * @return результат выполнения опеарации над числами num1 И num2
     */
    static float doOperation(float num1, float num2, char op) {
        float result = 0;
        switch (op) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
        }
        return result;
    }
}
