import java.time.LocalDate;
import java.util.List;

public class Duck extends Animal{
    public Duck(String name, LocalDate birthDay, List<String> vaccinations, String illness, String owner) {
        super(name, birthDay, vaccinations, illness, owner);
    }

    @Override
    protected void fly() {
        System.out.println("Duck flying");
    }

    @Override
    protected void swim() {
        System.out.println("Duck swimming");
    }
}
