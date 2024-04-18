import java.time.LocalDate;
import java.util.List;

public class Fly extends Animal{
    public Fly(String name, LocalDate birthDay, List<String> vaccinations, String illness, String owner) {
        super(name, birthDay, vaccinations, illness, owner);
    }

    @Override
    protected void fly() {
        super.fly();
    }
}
