/*В обычный калькулятор без логирования добавьте возможность отменить последнюю операцию.
Отмена последней операции должна быть реализована следующим образом: если передан оператор '<' калькулятор должен вывести результат предпоследней операции.
 */

import java.util.ArrayDeque;
import java.util.Deque;

class Calculator2 {
    Deque<Double> prev = new ArrayDeque<>();
    public double calculate(char op, int a, int b) {
        // Напишите свое решение ниже


        if (op != '+' && op != '-' && op != '*' && op != '/' && op != '<') {
            System.out.println("Некорректный оператор: \'" + op + "\'");
            return 1;
        }
        switch (op) {
            case ('+'):
                prev.addFirst((double) (a + b));
                return prev.getFirst();
            case ('-'):
                prev.addFirst((double) (a - b));
                return prev.getFirst();
            case ('*'):
                prev.addFirst((double) (a * b));
                return prev.getFirst();
            case ('/'):
                prev.addFirst((double) (a / b));
                return prev.getFirst();
            case ('<'):
                prev.removeFirst();
                return prev.getFirst();
        }
        return 1;
    }

}


// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class HW4Task3 {
    public static void main(String[] args) {
        int a, b, c, d;
        char op, op2, undo;

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            a = 3;
            op = '+';
            b = 7;
            c = 4;
            op2 = '+';
            d = 7;
            undo = '<';
        } else {
            a = Integer.parseInt(args[0]);
            op = args[1].charAt(0);
            b = Integer.parseInt(args[2]);
            c = Integer.parseInt(args[3]);
            op2 = args[4].charAt(0);
            d = Integer.parseInt(args[5]);
            undo = args[6].charAt(0);
        }

        Calculator2 calculator = new Calculator2();
        double result = calculator.calculate(op, a, b);
        System.out.println(result);
        double result2 = calculator.calculate(op2, c, d);
        System.out.println(result2);
        double prevResult = calculator.calculate(undo, 0, 0);
        System.out.println(prevResult);
    }
}