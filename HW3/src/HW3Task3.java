/*Реализуйте метод, который принимает на вход целочисленный массив arr:
- Создаёт список ArrayList, заполненный числами из исходого массива arr.
- Сортирует список по возрастанию и выводит на экран.
- Находит минимальное значение в списке и выводит на экран - Minimum is {число} - Находит максимальное значение в списке и выводит на экран - Maximum is {число}
- Находит среднее арифметическое значений списка и выводит на экран - Average is =  {число}
Напишите свой код в методе analyzeNumbers класса Answer. Метод analyzeNumbers принимает на вход один параметр:
Integer[] arr - массив целых чисел.
*/

import java.util.*;

class AnswerTask3 {
    public static void analyzeNumbers(Integer[] arr) {
        // Введите свое решение ниже
        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(arr));
        al.sort(Integer::compareTo);
        System.out.println(al);
        System.out.println("Minimum is " + al.stream().min(Integer::compareTo).orElse(null));
        System.out.println("Maximum is " + al.stream().max(Integer::compareTo).orElse(null));
        System.out.println("Average is = " + al.stream().mapToDouble(value -> value).average().orElse(0));
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class HW3Task3 {
    public static void main(String[] args) {
        Integer[] arr = {};

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            arr = new Integer[]{4, 2, 7, 5, 1, 3, 8, 6, 9};
        } else {
            arr = Arrays.stream(args[0].split(", "))
                    .map(Integer::parseInt)
                    .toArray(Integer[]::new);
        }

        AnswerTask3 ans = new AnswerTask3();
        ans.analyzeNumbers(arr);
    }
}