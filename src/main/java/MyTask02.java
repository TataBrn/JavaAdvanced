import java.io.IOException;
import java.util.Scanner;

public class MyTask02 {
    public static void main(String[] args) throws IOException {
        Scanner scan  = new Scanner(System.in);

        System.out.println("Введите число: \n1 - чтобы вызвать калькулятор, \n2 - чтобы поработать с массивом слов ");
        byte whatNeedDo = scan.nextByte(); // Что будем делать: 1 - вызывать калькулятор, 2 - массив строк

        if (whatNeedDo == 1) { //Вызываем калькулятор
            System.out.println("Итак, калькулятор");
            myTask01.startCalculate();
        } else if (whatNeedDo == 2){ //Работаем с массивом
            System.out.println("Итак, работаем с массивом");
            MyTask02Array.startArray();
        } else { //Ничего не будем делать
            System.err.println("Нет такого варианта выбора");
        }

    }
}
