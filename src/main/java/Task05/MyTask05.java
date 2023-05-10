package Task05;

/**
 * Есть входной файл с набором слов, написанных через пробел
 * Необходимо:
 * - Прочитать слова из файла.
 * - Отсортировать в алфавитном порядке.
 * - Посчитать сколько раз каждое слово встречается в файле
 * - Вывести статистику на консоль
 * - Найти слово с максимальным количеством повторений
 * - Вывести на консоль это слово и сколько раз оно встречается в файле
 */

import java.io.*;
import java.util.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MyTask05 {
    public static void main(String[] args) throws IOException {
        String fileName;
        System.out.println("Введите файл для чтения");
        Scanner in = new Scanner(System.in);
        fileName = in.nextLine();
        File file = new File(fileName);
        if (!file.exists()) {
            System.out.println("Нет такого файла");

        }
        else {
            Path path = Paths.get(fileName);
            Scanner scanner = new Scanner(path);
            String str = "";
            //считываем файл в str
            while (scanner.hasNextLine()) {
                str = str + scanner.nextLine();
            }
            scanner.close();

            //сохраняем слова в wordsFromFile
            List<String> wordsFromFile = new ArrayList<>(Arrays.asList(str.split(" ")));
            System.out.println("\n----------- \n\nСлова файла\n");
            for (String st : wordsFromFile) {
                System.out.println(st);
            }


            //сортируем слова
            Collections.sort(wordsFromFile);
            System.out.println("\n----------- \n\nОтсортированные слова файла\n");
            for (String st : wordsFromFile) {
                System.out.println(st);
            }


            //формируем множество слов
            Set<String> setOfWordsFromFile = new HashSet(wordsFromFile);

            //Формируем словарь, в котором ключи - это слова, значение - кол-во слов
            Map<String, Integer> countOfWords = new HashMap<String, Integer>();
            for (String st : wordsFromFile) {
                if (countOfWords.containsKey(st)) {
                    int a = countOfWords.get(st);
                    countOfWords.put(st, a + 1);
                } else {
                    countOfWords.put(st, 1);
                }
            }
            //Выводим на консоль слова и кол-во повторений
            System.out.println("\n----------- \n\nСлова  и их кол-во в файле\n");
            for (Map.Entry<String, Integer> word : countOfWords.entrySet()) {

                System.out.printf("%s - %d\n", word.getKey(), word.getValue());
            }

            //ищем максимальное кол-во повторений
            int max = -1;
            for (Map.Entry<String, Integer> word : countOfWords.entrySet()) {
                if (word.getValue() > max) max = word.getValue();
            }

            //выводи слова с максимальным кол-ом повторений
            System.out.println("\n----------- \n\nСлова  с максимальным кол-ом повторений\n");
            for (Map.Entry<String, Integer> word : countOfWords.entrySet()) {
                if (word.getValue() == max) System.out.printf("%s - %d\n", word.getKey(), word.getValue());
            }
        }
        in.close();
    }
}
