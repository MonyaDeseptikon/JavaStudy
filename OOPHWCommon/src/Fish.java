import java.time.LocalDate;
import java.util.List;

public class Fish extends Animal{
    public Fish(String name, LocalDate birthDay, List<String> vaccinations, String illness, String owner) {
        super(name, birthDay, vaccinations, illness, owner);
    }

    @Override
    protected void swim() {
        System.out.println("Fish swimming");
    }
}
