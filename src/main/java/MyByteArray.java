import java.util.Random;

/**
 * - Массив размерностью 20
 * - Он заполняется случайными целыми числами от -10 до 10
 * - Нужно найти максимальный отрицательный и минимальный положительный элементы массива
 * - Поменять их местами.
 */
public class MyByteArray {
    static final byte ELEMENT_COUNT = 20; //кол-во элементов в массиве - константа
    static byte maxNegativeIndex;//Индекс максимального отрицательного элемента
    static byte minPositiveIndex; //Индекс минимального положительного элемента


    public static void main(String[] args) {
        byte[] myArray; //массив чисел
        myArray = new byte[ELEMENT_COUNT];
        myArray = setByteArray(); //Сформировали массив чисел
        System.out.println("\nПолучили массив:");
        printByteArray (myArray); //выводим массив на экран

        //Ищем максимальный отрицательный элемент
        maxNegativeIndex = getMaxNegativeIndex(myArray);
        if ( maxNegativeIndex == -1) {
            System.out.println("В массиве нет отрицательных чисел");
        } else {
            System.out.println("Максимальный отрицательный элемент в массиве: " + myArray[maxNegativeIndex]);
            System.out.println("Находится на " + maxNegativeIndex + "-м месте");
        }
        //Ищем минимальный положительный элемент
        minPositiveIndex = getMinPositiveIndex(myArray);
        if ( minPositiveIndex == -1) {
            System.out.println("В массиве нет положительных чисел");
        } else {
            System.out.println("Минимальный положительный элемент в массиве: " + myArray[minPositiveIndex]);
            System.out.println("Находится на " + minPositiveIndex + "-м месте");
        }

        //Меняем местами элементы, если это возможно
        if (minPositiveIndex == -1 || maxNegativeIndex == -1) {
            System.out.println("Невозможно поменять элементы местами");
        } else {
            System.out.println("Массив после того, как поменяли элементы местами:");
            printByteArray(changeElements(myArray, minPositiveIndex, maxNegativeIndex));
        }

    }

    /**
     * Заполнение массива случайными целыми числами в диапазоне от -10 до 10
     *
     * @return Массив целых чисел
     */
    private static byte[] setByteArray() {
        byte[] Arr; //массив чисел внутри метода
        Arr = new byte[ELEMENT_COUNT];
        Random rand = new Random();

        for (int i = 0; i < ELEMENT_COUNT; i++) {
            Arr[i] = (byte) (rand.nextInt(20) - 10);
        }
        return Arr;
    }

    /**
     * Вывод массива в консоль
     *
     * @param Arr - массив целых чисел
     */
    private static void printByteArray(byte[] Arr) {
        for (byte element : Arr) {
            System.out.printf("%4d", element);
        }
        System.out.println();
    }

    /**
     * Поиск индекса минимального положительного элемента
     * @param Arr исходный массив
     * @return Индекс минимального положительного элемента
     */
    private static byte getMinPositiveIndex(byte[] Arr) {
        byte minIndex = -1;
        byte minElement = 11;
        for (byte i = 0; i < Arr.length; i++) {
            if (Arr[i] > 0 && Arr[i] < minElement) {
                minElement = Arr[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
    /**
     * Поиск индекса максимального отрицательного элемента
     * @param Arr исходный массив
     * @return Индекс максимального отрицательного элемента
     */
    private static byte getMaxNegativeIndex(byte[] Arr) {
        byte maxIndex = -1;
        byte maxElement = -11;
        for (byte i = 0; i < Arr.length; i++) {
            if (Arr[i] < 0 && Arr[i] > maxElement) {
                maxElement = Arr[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    /**
     * Меняет местами два элемент амассива
     * @param Arr - исходный массив
     * @param index1 - индекс первого элемента
     * @param index2 - индекс второго элемента
     * @return - измененный массив
     */
    private static byte [] changeElements (byte [] Arr, byte index1, byte index2) {
        byte buffer;
        buffer = Arr [index1];
        Arr [index1] = Arr [index2];
        Arr [index2] = buffer;

        return Arr;
    }
}
