import java.util.function.IntToDoubleFunction;

/*В методе calculate класса Calculator реализовать калькулятор, который будет выполнять математические операции (+, -, *, /) над двумя целыми числами и возвращать результат вещественного типа.
В классе Printer необходимо реализовать проверку переданного оператора, при некорректном операторе программа должна вывести сообщение об ошибке "Некорректный оператор: 'оператор'".*/
class Calculator {
    public double calculate(char op, int a, int b) {
        // Введите свое решение ниже
     double aD = (double) a;
     double bD= (double) b;
    if (op!='+'&& op !='-' && op!='*' && op!='/') {
        System.out.println("Некорректный оператор: \'"+op+"\'");
        return -1;
        }
        switch (op) {
            case ('+') :
                return aD + bD;
            case ('-') :
                return aD - bD;
            case ('*'):
                return aD * bD;
            case ('/'):
                return aD / bD;
            default:
                return -1;
        }
    }

}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Task3{
    public static void main(String[] args) {
        int a = 0;
        char op = ' ';
        int b = 0;

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            a = 10;
            op = '/';
            b = 7;
        } else {
            a = Integer.parseInt(args[0]);
            op = args[1].charAt(0);
            b = Integer.parseInt(args[2]);
        }

        Calculator calculator = new Calculator();
        double result = calculator.calculate(op, a, b);
        System.out.println(result);
    }
}