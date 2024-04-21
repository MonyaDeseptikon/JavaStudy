package Animals;

import java.time.LocalDate;
import java.util.List;

public class Eagle extends Animal implements Flyable{
    public Eagle(String name, LocalDate birthDay, List<String> vaccinations, String illness, String owner) {
        super(name, birthDay, vaccinations, illness, owner);
    }

    @Override
    public double fly() {
        System.out.printf("%s %s flying \n",getClass().getSimpleName() ,name);
        return 60.0;
    }

    @Override
    public String toString() {
        return "Eagle{" +
                "name='" + name + '\'' +
                ", birthDay=" + birthDay +
                ", vaccinations=" + vaccinations +
                ", illness='" + illness + '\'' +
                ", owner='" + owner + '\'' +
                '}';
    }
}
