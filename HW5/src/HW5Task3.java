/*Необходимо разработать программу для сортировки массива целых чисел с использованием сортировки кучей (Heap Sort). Программа должна работать следующим образом:
Принимать на вход массив целых чисел для сортировки. Если массив не предоставлен, программа использует массив по умолчанию.
Сначала выводить исходный массив на экран.
Затем применять сортировку кучей (Heap Sort) для сортировки элементов массива в порядке возрастания.
Выводить отсортированный массив на экран.
Ваше решение должно содержать два основных метода: buildTree, который строит сортирующее дерево на основе массива, и heapSort, который выполняет собственно сортировку кучей.
Программа должна быть способной сортировать массив, даже если он состоит из отрицательных чисел и имеет дубликаты.

Связь между индексами массива и элементами дерева
Полное бинарное дерево обладает интересным свойством, которое мы можем использовать для поиска дочерних элементов и родителей любого узла.
Если индекс любого элемента в массиве равен i, элемент в индексе 2i + 1 станет левым потомком, а элемент в индексе 2i + 2 станет правым потомком. Кроме того, родительский элемент любого элемента с индексом i задается нижней границей (i-1) / 2.
 */


import java.util.Arrays;

class HeapSort {
    public static void buildTree(int[] arr, int n, int i) {
        // Введите свое решение ниже
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;

        if (l < n && arr[l] > arr[largest])
            largest = l;

        if (r < n && arr[r] > arr[largest])
            largest = r;

        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            buildTree(arr, n, largest);
        }
    }

    public static void heapSort(int[] sortArray, int sortLength) {
// Введите свое решение ниже


        // Build max heap
        for (int i = sortLength / 2 - 1; i >= 0; i--) {
            buildTree(sortArray, sortLength, i);
        }


        // Heap sort
        for (int i = sortLength - 1; i >= 0; i--) {
            int temp = sortArray[0];
            sortArray[0] = sortArray[i];
            sortArray[i] = temp;

            // Heapify root element
            buildTree(sortArray, i, 0);
        }
    }
}

// Не удаляйте и не меняйте метод Main!
public class HW5Task3 {
    public static void main(String[] args) {
        int[] initArray;

        if (args.length == 0) {
            initArray = new int[]{17, 32, 1, 4, 25, 17, 0, 3, 10, 7, 64, 1};
        } else {
            initArray = Arrays.stream(args[0].split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        System.out.println("Initial array:");
        System.out.println(Arrays.toString(initArray));
        HeapSort.heapSort(initArray, initArray.length);
        System.out.println("Sorted array:");
        System.out.println(Arrays.toString(initArray));
    }
}
