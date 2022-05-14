import java.util.Scanner;

/**
 * Класс для работы с массивами
 */
public class MyTask02Array {
    public static void main(String[] args) {
        startArray();
    }

    /**
     * Ввод массива слов с консоли
     * и вызов функции поиска самого длинного слова
     * @author Миллер Татьяна
     * @see #maxWord(String[])
     */
    public static void startArray() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите количество слов в массиве");
        int wordsCount = scan.nextInt();//Количество слов в массиве

        //Если кол-во слов в массиве - положительное число, выполняем программу дальше
        if (wordsCount > 0) {
            String[] myArray = new String[wordsCount];

            //Вводим слова массива
            for (int i = 0; i < wordsCount; i++) {
                System.out.println("Введите " + (i + 1) + "-ое слово массива:");
                myArray[i] = scan.next();
            }

            //Выводим массив
            System.out.println("Полученный массив слов:");
            for (String word : myArray) {
                System.out.println(word);
            }

            //Выводим самое длинное слово
            System.out.println("Самое длинное слово в массиве: " + maxWord(myArray));
        }
        else {
            System.err.print("Некорректное кол-во слов в массиве. \nКол-во слов должно быть больше нуля");
        }
    }

    /**
     * Поцедура поиска самого длинного слова в массиве
     * Если слов с максимальной длинной несколько, возвращает первое
     * @param Arr исходный массив
     * @author Татьяна Миллер
     */
    public static String maxWord(String[] Arr) {
        int max = 0; //индекс самого длинного слова
        for (int i = 1; i < Arr.length; i++) {
            if (Arr[i].length() > Arr[max].length()) {
                max = i;
            }
        }
        return Arr[max];
    }
}

