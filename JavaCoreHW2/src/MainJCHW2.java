public class MainJCHW2 {
    public static void main(String[] args) {
        int[] array = new int[]{2, 1, 2, 3, 0, 0, 4, 9};

        System.out.println(countEvens(array));
        System.out.println(differenceMinMax(array));

        System.out.println(isZeroByZero(array));
    }

    private static int countEvens(int[] array) {
        int count = 0;
        for (int number : array) {
            if (number % 2 == 0) count++;
        }
        return count;
    }

    private static int differenceMinMax(int[] array) {
        int min = array[0];
        int max = array[0];
        for (int number : array) {
            if (number < min) min = number;
            if (number > max) max = number;
        }
        return max - min;
    }

    private static boolean isZeroByZero(int[] array) {

        for (int i = 0; i < array.length-1; i++) {
            if (array[i] == 0 && array[i + 1] == 0) return true;
        }
        return false;
    }
}