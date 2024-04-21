package Animals;

import java.time.LocalDate;
import java.util.List;

public class Duck extends Animal implements Flyable, Swimmable{
    public Duck(String name, LocalDate birthDay, List<String> vaccinations, String illness, String owner) {
        super(name, birthDay, vaccinations, illness, owner);
    }

    @Override
    public double fly() {
        System.out.printf("%s %s flying \n",getClass().getSimpleName() ,name);
        return 30.0;
    }

    @Override
    public double swim() {
        System.out.printf("%s %s swimms \n",getClass().getSimpleName() ,name);
        return 5.0;
    }

    @Override
    public String toString() {
        return "Duck{" +
                "name='" + name + '\'' +
                ", birthDay=" + birthDay +
                ", vaccinations=" + vaccinations +
                ", illness='" + illness + '\'' +
                ", owner='" + owner + '\'' +
                '}';
    }
}
