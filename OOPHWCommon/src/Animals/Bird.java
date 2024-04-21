package Animals;

import java.time.LocalDate;
import java.util.List;

public class Bird extends Animal implements Flyable{
    public Bird(String name, LocalDate birthDay, List<String> vaccinations, String illness, String owner) {
        super(name, birthDay, vaccinations, illness, owner);
    }

    @Override
    public double fly() {
        System.out.printf("%s %s flying \n",getClass().getSimpleName() ,name);
        return 40.0;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "name='" + name + '\'' +
                ", birthDay=" + birthDay +
                ", vaccinations=" + vaccinations +
                ", illness='" + illness + '\'' +
                ", owner='" + owner + '\'' +
                '}';
    }
}
