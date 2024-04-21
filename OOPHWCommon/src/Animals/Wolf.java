package Animals;

import java.time.LocalDate;
import java.util.List;

public class Wolf extends Animal implements Walkable, Swimmable{
    public Wolf(String name, LocalDate birthDay, List<String> vaccinations, String illness, String owner) {
        super(name, birthDay, vaccinations, illness, owner);
    }

    @Override
    public double swim() {
        System.out.printf("%s %s swimms \n",getClass().getSimpleName() ,name);
        return 25.0;
            }

    @Override
    public double walk() {
        System.out.printf("%s %s walks \n",getClass().getSimpleName() ,name);
        return 25.0;
    }

    @Override
    public String toString() {
        return "Wolf{" +
                "name='" + name + '\'' +
                ", birthDay=" + birthDay +
                ", vaccinations=" + vaccinations +
                ", illness='" + illness + '\'' +
                ", owner='" + owner + '\'' +
                '}';
    }
}
