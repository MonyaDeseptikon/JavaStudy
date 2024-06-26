package Animals;

import java.time.LocalDate;
import java.util.List;

public class Cat extends Animal implements Walkable{
    private int legsCount;
    public Cat(String name, LocalDate birthDay, List<String> vaccinations, String illness, String owner, int legsCountCon) {
        super(name, birthDay, vaccinations, illness, owner);
        this.legsCount=legsCountCon;
    }

    @Override
    public double walk() {
        System.out.printf("%s %s walks \n",getClass().getSimpleName() ,name);
        return 30.0;
    }

    @Override
    public String toString() {
        return "Animals.Cat{" +
                             "owner='" + owner + '\'' +
                ", illness='" + illness + '\'' +
                ", vaccinations=" + vaccinations +
                ", birthDay=" + birthDay +
                ", name='" + name + '\'' +
                ", legsCount=" + legsCount +
                '}';
    }

    public int getLegsCount() {
        return legsCount;
    }
}
