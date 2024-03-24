/*Внутри класса MergeSort напишите метод mergeSort, который принимает массив целых чисел, реализует алгоритм сортировки слиянием. Метод должен возвращать отсортированный массив.
*/

import java.util.Arrays;

class MergeSort {
    public static int[] mergeSort(int[] a) {
        // Напишите свое решение ниже
//        int[] buffer = new int[a.length];
//        int s = 2;
////        for (int i = 0; i < a.length; i = i + s) {
////            if (a[i] < a[i + s/2]) {
////                buffer[i] = a[i];
////                buffer[i + s/2] = a[i + s/2];
////            } else {
////                buffer[i] = a[i + s/2];
////                buffer[i + s/2] = a[i];
////            }
////        }
//        for (int i = 0; i < a.length; i = i + s) {
//            for (int j = i; j < i + s / 2; j++) {
//
//                if (a[j] < a[j + s / 2]) {
//                    buffer[j] = a[j];
//                    buffer[j + s / 2] = a[j + s / 2];
//                } else {
//                    buffer[j] = a[j + s / 2];
//                    buffer[j + s / 2] = a[j];
//                }
//            }
//        }
//        System.out.println(Arrays.toString(buffer));
//        a = buffer.clone();
//
////
//        s = s * 2;
//        for (int i = 0; i < a.length; i = i + s) {
//            for (int j = i; j < i + s/2 ; j++) {
//                if (a[j] < a[j + s / 2]) {
//                    buffer[j] = a[j];
//                    buffer[j + s / 2] = a[j + s / 2];
//                } else {
//                for (int k = j+s/2; k <j+s ; k++) {
//                    buffer[j] = a[j + s / 2];
//                    buffer[j + s / 2] = a[j];
//                }
//
////                if (a[j] < a[j + s / 2]) {
////                    buffer[j] = a[j];
////                    buffer[j + s / 2] = a[j + s / 2];
////                }  else {
////                    buffer[j] = a[j + s / 2];
////                    buffer[j + s / 2] = a[j];
////                }
//            }
//        }
//        System.out.println(Arrays.toString(buffer));

        return SortUnsorted( a, 0, a.length-1);

    }
    private static int[] SortUnsorted(int[] a, int lo, int hi) {

        if (hi <= lo)
            return a;
        int mid = lo + (hi - lo) / 2;
        SortUnsorted(a, lo, mid);
        SortUnsorted(a, mid + 1, hi);

        int[] buf = Arrays.copyOf(a, a.length);

        for (int k = lo; k <= hi; k++)
            buf[k] = a[k];

        int i = lo, j = mid + 1;
        for (int k = lo; k <= hi; k++) {

            if (i > mid) {
                a[k] = buf[j];
                j++;
            } else if (j > hi) {
                a[k] = buf[i];
                i++;
            } else if (buf[j] < buf[i]) {
                a[k] = buf[j];
                j++;
            } else {
                a[k] = buf[i];
                i++;
            }
        }
        return a;
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class PrinterHW3T1 {
    public static void main(String[] args) {
        int[] a;

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            a = new int[]{5, 2, 6, 1, 3, 4, 5, 2};
        } else {
            a = Arrays.stream(args[0].split(", ")).mapToInt(Integer::parseInt).toArray();
        }

        MergeSort answer = new MergeSort();
        String itresume_res = Arrays.toString(answer.mergeSort(a));
        System.out.println(itresume_res);
    }
}