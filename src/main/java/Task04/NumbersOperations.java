package Task04;

/**
 * Выполнение арифметических операций с целыми и вещественными числами
 *
 * @author Татьяна Миллер
 */
public class NumbersOperations {

    //Сумма двух дробных чисел
    public double getSum(double num1, double num2) {
        return num1 + num2;
    }

    //Разность двух дробных чисел
    public double getDifference(double num1, double num2) {
        return num1 - num2;
    }

    //Произведение двух дробных чисел
    public double getProduct(double num1, double num2) {
        return num1 * num2;
    }

    //Частное двух чисел
    public double getQuotient(double num1, double num2) throws IllegalArgumentException {
        double result;
        if (num2 == 0) {
            throw new java.lang.IllegalArgumentException("Нельзя делить на ноль");
        }
        result = num1 / num2;
        return result;
    }

}
