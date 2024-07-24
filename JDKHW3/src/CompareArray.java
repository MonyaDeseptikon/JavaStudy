public class CompareArray {
    public static <T> boolean compareArrays(T[] array1, T[] array2) {
        if (array1.length != array2.length) {
            return false;
        }

        for (int i = 0; i < array1.length; i++) {
            if (!array1[i].getClass().equals(array2[i].getClass())) {
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        Integer[] intArray1 = {1, 2, 3, 4, 5};
        Integer[] intArray2 = {1, 2, 3, 4, 5};
        boolean result1 = compareArrays(intArray1, intArray2);
        System.out.println("Результат для целочисленных массивов: " + result1);

        String[] stringArray1 = {"Hello", "World"};
        String[] stringArray2 = {"Hello", "World"};
        boolean result2 = compareArrays(stringArray1, stringArray2);
        System.out.println("Результат для строковых массивов: " + result2);

        Double[] doubleArray1 = {1.5, 2.4, 3.7, 4.9, 5.5};
        Double[] doubleArray2 = {1.5, 2.4, 3.7};
        boolean result3 = compareArrays(doubleArray1, doubleArray2);
        System.out.println("Результат если массивы разной длинны: " + result3);

        Float[] floatArray1 = {1.5f, 2.4f, 3.7f, 4.9f, 5.5f};
        Integer[] integerArray2 = {1, 2, 3, 4, 3};
        boolean result4 = compareArrays(floatArray1, integerArray2);
        System.out.println("Результат если массивы не одинаковые: " + result4);

        compareArrays(stringArray1, intArray1);

    }
}
