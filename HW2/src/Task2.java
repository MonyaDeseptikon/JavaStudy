/*Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.
Напишите свой код в методе sort класса BubbleSort. Метод sort принимает на вход один параметр:
int[] arr - числовой массив
После каждого прохода по массиву ваш код должен делать запись в лог-файл 'log.txt' в формате год-месяц-день час:минуты {массив на данной итерации}. Для логирования использовать логгер logger класса BubbleSort.
*/

import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Date;
import java.text.DateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.text.SimpleDateFormat;

class BubbleSort {
    //  private static File log ;
    File log = new File("log.txt");
    private static FileWriter fileWriter;

    {
        try {
            fileWriter = new FileWriter(log);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static String output = new SimpleDateFormat("yyyy-MM-dd HH:mm").format(new Date());

    public static void sort(int[] mas) {
        int temp;

        for (int i = 0; i < mas.length; i++) {
            Boolean swapped=false;
            for (int j = 0; j < (mas.length - i - 1); j++) {
                if (mas[j] > mas[j + 1]) {
                    temp = mas[j];
                    mas[j] = mas[j + 1];
                    mas[j + 1] = temp;
                    swapped = true;
                }
            }

            try {
                fileWriter.write(output + " " + Arrays.toString(mas) + "\n");
                fileWriter.flush();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            if (!swapped) break;
        }
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Task2 {
    public static void main(String[] args) {
        int[] arr = {};
        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            //arr = new int[]{9, 4, 8, 3, 1};
            arr = new int[]{9, 3, 4, 8, 2, 5, 7, 1, 6, 10};
        } else {
            arr = Arrays.stream(args[0].split(", "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

        }
        BubbleSort ans = new BubbleSort();
        ans.sort(arr);
        try (BufferedReader br = new BufferedReader(new FileReader("log.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
