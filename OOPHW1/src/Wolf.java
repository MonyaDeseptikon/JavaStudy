import java.time.LocalDate;
import java.util.List;

public class Wolf extends Animal{
    public Wolf(String name, LocalDate birthDay, List<String> vaccinations, String illness, String owner) {
        super(name, birthDay, vaccinations, illness, owner);
    }

    @Override
    protected void swim() {
        System.out.println("Wolf swimming");
    }

    @Override
    protected void walk() {
        System.out.println("Wolf walks");
    }
}
