import java.time.LocalTime;
import java.util.Scanner;
        public class Program2 {
            public static void main(String[] args) {
               Scanner sc = new Scanner(System.in);
               String input = sc.next();
               System.out.println("Привет"+input);
               hard();
               sc.close();
            }
            public static void hard() {
                LocalTime now = LocalTime.now();

                System.out.println("Введите имя: ");
                Scanner scanner = new Scanner(System.in); //, "cp866");
                String name = scanner.nextLine();

                String mask = "%s, %s!%n";
                String morning = "Доброе утро";
                String day = "Добрый день";
                String evening = "Добрый вечер";
                String night = "Доброй ночи";

                if (now.isAfter(LocalTime.of(5, 0)) && now.isBefore(LocalTime.of(12, 0))) {
                    System.out.printf(mask, morning, name);
                } else if (now.isAfter(LocalTime.of(12, 0)) && now.isBefore(LocalTime.of(18, 0))) {
                    System.out.printf(mask, day, name);
                } else if (now.isAfter(LocalTime.of(18, 0)) && now.isBefore(LocalTime.of(23, 0))) {
                    System.out.printf(mask, evening, name);
                } else {
                    System.out.printf(mask, night, name);
                }
                scanner.close();
            }
}