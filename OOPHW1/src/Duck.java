import java.time.LocalDate;
import java.util.List;

public class Duck extends Animal{
    public Duck(String name, LocalDate birthDay, List<String> vaccinations, String illness, String owner) {
        super(name, birthDay, vaccinations, illness, owner);
    }

    @Override
    protected void fly() {
        System.out.printf("%s %s flying \n",getClass().getSimpleName() ,name);
    }

    @Override
    protected void swim() {
        System.out.printf("%s %s swimming \n",getClass().getSimpleName() ,name);
    }
}
