import java.time.LocalDate;
import java.util.List;

public class Cat extends Animal{
    private int legsCount;
    public Cat(String name, LocalDate birthDay, List<String> vaccinations, String illness, String owner, int legsCountCon) {
        super(name, birthDay, vaccinations, illness, owner);
        this.legsCount=legsCountCon;
    }

    @Override
    protected void walk() {
        System.out.println("Cat walks");
    }

    @Override
    public String toString() {
        return "Cat{" +
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
