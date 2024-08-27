import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class HW1 {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        OptionalDouble average = numbers.stream()
                .filter(n -> n % 2 == 0)
                .mapToInt(Integer::intValue)
                .average();
        System.out.println("Среднее значение всех четных чисел в списке: " + average);
    }

}