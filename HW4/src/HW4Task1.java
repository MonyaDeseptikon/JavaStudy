/*Дан LinkedList с несколькими элементами разного типа. В методе revert класса LLTasks реализуйте разворот этого списка без использования встроенного функционала.
 */
import java.util.LinkedList;

class LLTasks {
    public static LinkedList<Object> revert(LinkedList<Object> ll) {
        // Напишите свое решение ниже
        Object temp;
        int lls = ll.size()-1;
        for (int i = 0; i <= lls/2; i++) {
            temp = ll.get(i);
            ll.set(i,ll.get(lls-i));
            ll.set((lls-i), temp);
        }

    return ll;
    }

    }

    // Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
    public class HW4Task1 {
        public static void main(String[] args) {
            LinkedList<Object> ll = new LinkedList<>();

            if (args.length == 0 || args.length != 4) {
                // При отправке кода на Выполнение, вы можете варьировать эти параметры
                ll.add(1);
                ll.add("One");
                ll.add(2);
                ll.add("Two");
                ll.add(3);
                ll.add("Three");
                ll.add(4);
                } else {
                ll.add(Integer.parseInt(args[0]));
                ll.add(args[1]);
                ll.add(Integer.parseInt(args[2]));
                ll.add(args[3]);
            }

            LLTasks answer = new LLTasks();
            System.out.println(ll);
            LinkedList<Object> reversedList = answer.revert(ll);
            System.out.println(reversedList);
        }
    }