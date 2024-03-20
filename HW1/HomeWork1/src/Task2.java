///*Напишите функцию printPrimeNums, которая выведет на экран все простые числа в промежутке от 1 до 1000, каждое на новой строке.*/
//class Answer {
//    public void printPrimeNums() {
//        // Напишите свое решение ниже
//        for (int i = 2; i < 1000; i++) {
//            int j = 2;
//            while (j < i && i % j != 0) {
//                j++;
//            }
//            if (j == i) {
//                System.out.println(i);
//            }
//        }
//    }
//
//    // Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
//    static class Task2 {
//        public static void main(String[] args) {
//
//            Answer ans = new Answer();
//            ans.printPrimeNums();
//        }
//    }
//}