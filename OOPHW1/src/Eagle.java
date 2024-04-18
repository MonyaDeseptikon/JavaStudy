import java.time.LocalDate;
import java.util.List;

public class Eagle extends Animal{
    public Eagle(String name, LocalDate birthDay, List<String> vaccinations, String illness, String owner) {
        super(name, birthDay, vaccinations, illness, owner);
    }

    @Override
    protected void fly() {
        System.out.println("Eagle flying");
    }
}
