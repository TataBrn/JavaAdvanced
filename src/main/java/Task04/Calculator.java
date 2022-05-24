package Task04;

import java.util.HashSet;
import java.util.Scanner;

public class Calculator {

    private Scanner scan;

    public static void main(String[] args) {
        double num1; //Первое число
        double num2; //Второе число
        char operation; //Операция над числами
        double result; //Результат выполнения операции
        Calculator calculator = new Calculator();
        calculator.scan = new Scanner(System.in);
        //Запрашиваем у пользователя числа
        num1 = calculator.requestNumber ("Введите первое число");
        num2 = calculator.requestNumber ("Введите второе число");
        //Запрашиваем у пользователя операцию
        operation = calculator.requestOperation();

        calculator.scan.close();
        //Если операцию выполнить можно (нет делени на ноль), выполняем, иначе пишем сообщение об этом
        if (calculator.checkOperations (num1, num2, operation)) {
            result = calculator.getResultOperation(num1, num2, operation);
            calculator.printResult (num1, num2, operation, result);
        }
        else {
            System.out.println("Невозможно выполнить операцию");
        }


    }

    /**
     * Запрос числа
      * @param text - Приглашение для ввода
     * @return - Введенное число
     */
    private double requestNumber (String text) {
        double number;
        System.out.println(text);
        number = scan.nextDouble();
//        scan.close();
        return number;
    }


    /**
     * Запрос операции у пользователя
     */
    private char requestOperation () {
        HashSet <Character> validOperations = new HashSet  ();//Символы допустимых операций

        validOperations.add('+');
        validOperations.add('-');
        validOperations.add('*');
        validOperations.add('/');


//       Scanner scan = new Scanner(System.in);

        System.out.println("Введите действие:");
        System.out.println("+ - чтобы найти сумму чисел");
        System.out.println("- чтобы найти разность чисел");
        System.out.println("* - чтобы найти произведение чисел");
        System.out.println("/ - чтобы найти частное чисел");

        boolean isOperationValid = false;// Флаг валидности введенного символа операции
        int x = -1;
        char operation = (char) x;// Символ операции
        //Запрашиваем символ, пока пользователь не введет корректный символ операции
        while (!isOperationValid) {
            operation = scan.next ().charAt (0);
            if (validOperations.contains(operation)) {
                isOperationValid = true;
            }
            else {
                System.out.println("Нет такой операции. Введите символ операции ещё раз");
            }
        }
//        scan.close();
        return operation;
    }

    /**
     * Проверяет возможность выполнения операций.
     * В данном случае проверяет возможность деления на второе введенное число
     */
    private boolean checkOperations (double num1, double num2, char operation) {
        if (operation == '/' & num2 == 0) {
            return false;
        }
        else {
            return true;
        }
    }

    /**
     * Возвращает результат выполнения операций
     * @param num1 Первое число
     * @param num2 Второе число
     * @param operation Операция
     * @return Возвращает результат выполнения операции над числами num1 и num2
     */
    private double getResultOperation (double num1, double num2, char operation) {
        NumbersOperations myOperations = new NumbersOperations();
        double result = 0; //Результат выполнения операции
        switch (operation) {
            case '+':
                result = myOperations.getSum (num1, num2);
                break;
            case '-':
                result = myOperations.getDifference (num1, num2);
                break;
            case '*':
                result = myOperations.getProduct (num1, num2);
                break;
            case '/':
                result = myOperations.getQuotient (num1, num2);
                break;
        }
        return result;
    }

    private void printResult (double num1, double num2, char operation, double result) {
        System.out.printf("%9.4f %c %9.4f = %9.4f", num1, operation, num2, result);
    }

}
