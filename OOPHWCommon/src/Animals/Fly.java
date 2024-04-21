package Animals;

import java.time.LocalDate;
import java.util.List;

public class Fly extends Animal implements Flyable{
    public Fly(String name, LocalDate birthDay, List<String> vaccinations, String illness, String owner) {
        super(name, birthDay, vaccinations, illness, owner);
    }

    @Override
    public double fly() {
        System.out.printf("%s %s flying \n",getClass().getSimpleName() ,name);
        return 10.0;
    }

    @Override
    public String toString() {
        return "Fly{" +
                "name='" + name + '\'' +
                ", birthDay=" + birthDay +
                ", vaccinations=" + vaccinations +
                ", illness='" + illness + '\'' +
                ", owner='" + owner + '\'' +
                '}';
    }
}
