package Task06;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UseCalculator {

    public static void main(String[] args) throws IllegalArgumentException, InputMismatchException {
        String operations = "+-*/";
        Scanner scan;
        scan = new Scanner(System.in);
        double num1, num2;
        char operation;
        boolean isIntOne, isIntTwo;

        try {
            System.out.println("Введите первое число");
            isIntOne = scan.hasNextInt();
            num1 = scan.nextDouble();
            System.out.println("Введите второе число");
            isIntTwo = scan.hasNextInt();
            num2 = scan.nextDouble();
            System.out.println("Введите операцию над числами");
            operation = scan.next().charAt(0);

            Calculator myCalculator = new Calculator(num1, num2, operation);
            try {
                if (isIntOne && isIntTwo)
                    System.out.printf("%d %s %d = %d", (int)myCalculator.getNumOne(), myCalculator.getOperation(), (int)myCalculator.getNumTwo(), (int)myCalculator.doOperation());
                else
                    System.out.printf("%.2f %s %.2f = %.2f", myCalculator.getNumOne(), myCalculator.getOperation(), myCalculator.getNumTwo(), myCalculator.doOperation());
            }catch (IllegalArgumentException e){
                System.err.println(e.getMessage());
            }
        }catch (InputMismatchException e1){
            System.err.println("Введённое значение не является числом.\nЗапустите программу ещё раз и введите правильное числовое значение ");
        }finally {
            scan.close();
        }



    }
}
