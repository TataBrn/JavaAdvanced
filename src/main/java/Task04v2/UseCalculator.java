package Task04v2;

import java.util.Scanner;

public class UseCalculator {

    public static void main(String[] args) {
        String operations = "+-*/";
        Scanner scan;
        scan = new Scanner(System.in);
        double num1, num2;
        char operation;

        System.out.println("Введите первое число");
        num1 = scan.nextDouble();
        System.out.println("Введите второе число");
        num2 = scan.nextDouble();
        System.out.println("Введите операцию над числами");
        operation = scan.next().charAt(0);

        if( (operations.indexOf(operation) == -1 ) || (operation =='/' && num2==0)) {
            System.out.println("Нет такой операции или деление на ноль");

        }
        else {
            Calculator myCalculator = new Calculator(num1, num2, operation);

            System.out.printf("%8.2f %s %8.2f = %8.2f", myCalculator.getNumOne(), myCalculator.getOperation(), myCalculator.getNumTwo(), myCalculator.doOperation());

        }


        scan.close();


    }
}
