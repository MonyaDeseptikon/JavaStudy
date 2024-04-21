package Animals;

import java.time.LocalDate;
import java.util.List;

public class Fish extends Animal implements Swimmable{
    public Fish(String name, LocalDate birthDay, List<String> vaccinations, String illness, String owner) {
        super(name, birthDay, vaccinations, illness, owner);
    }

    @Override
    public double swim() {
        System.out.printf("%s %s swimms \n",getClass().getSimpleName() ,name);
        return 20.0;
    }

    @Override
    public String toString() {
        return "Fish{" +
                "name='" + name + '\'' +
                ", birthDay=" + birthDay +
                ", vaccinations=" + vaccinations +
                ", illness='" + illness + '\'' +
                ", owner='" + owner + '\'' +
                '}';
    }
}
