/*Внутри класса Answer напишите метод countNTriangle, который принимает число n и возвращает его n-ое треугольное число.
Если число n < 1 (ненатуральное) метод должен вернуть -1.*/

class AnswerTask1 {
    public int countNTriangle(int n){
       // Введите свое решение ниже
        if (n<1) {
            return -1;
        }
        else {
            return (n*(n+1))/2;
        }

    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Task1 {
    public static void main(String[] args) {
        int n = 0;

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            n = 5;
        }
        else{
            n = Integer.parseInt(args[0]);
        }

        // Вывод результата на экран
        AnswerTask1 ans = new AnswerTask1();
        int itresume_res = ans.countNTriangle(n);
        System.out.println(itresume_res);
    }
}