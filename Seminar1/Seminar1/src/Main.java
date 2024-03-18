import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(test());
    }

    public static LocalDateTime test() {
        DateTimeFormatter f = DateTimeFormatter.ofPattern("");
        return LocalDateTime.now();
    }
}