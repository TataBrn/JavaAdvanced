package Task06;
/**
 Класс Калькулятор с исключениями
 @author Татьяна Миллер
  */
public class Calculator {
    private double numOne; //The first number
    private double numTwo; //The second number
    private char operation; //What we must do wish numbers

    public Calculator(double numOne, double numTwo, char operation) {
        this.numOne = numOne;
        this.numTwo = numTwo;
        this.operation = operation;
    }

    /**
     * Метод выполняет арифметическую операцию operation с числами numOne и numTwo
     * @return Результат выполнения операции
     */
    public double doOperation() throws IllegalArgumentException{
        double result;
        switch (operation) {
            case '+':
                result = numOne + numTwo;
                break;
            case '-':
                result = numOne - numTwo;
                break;
            case '*':
                result = numOne * numTwo;
                break;
            case '/':
                if (numTwo == 0) {
                    throw new IllegalArgumentException("Нельзя делить на ноль");
                }
                result = numOne / numTwo;
                break;
            default:
                throw new IllegalArgumentException("Неизвестная операция");
        }
        return  result;
    }

    public double getNumOne() {
        return numOne;
    }

    public void setNumOne(double numOne) {
        this.numOne = numOne;
    }

    public double getNumTwo() {
        return numTwo;
    }

    public void setNumTwo(double numTwo) {
        this.numTwo = numTwo;
    }

    public char getOperation() {
        return operation;
    }

    public void setOperation(char operation) {
        this.operation = operation;
    }

}
