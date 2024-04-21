import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Animal barsik = new Cat("Barsik", LocalDate.of(2014, 5, 6), new ArrayList<>(), "Chumka", "Boss", 4);
        System.out.println(barsik);
        Animal eagle = new Eagle("Kesha", LocalDate.of(2014, 5, 6), new ArrayList<>(), "Chumka", "Boss");
        Animal donald =new Duck("Donald", LocalDate.of(2014, 5, 6), new ArrayList<>(), "Chumka", "Boss");
        List<Animal> animals = new ArrayList<>();
        animals.add(barsik);
        animals.add(eagle);
        animals.add(donald);
        System.out.println(animals);
        eagle.lifeCycle();
        eagle.fly();
        barsik.fly();
        donald.fly();
        donald.swim();
        donald.walk();
        barsik.walk();

            }
}

