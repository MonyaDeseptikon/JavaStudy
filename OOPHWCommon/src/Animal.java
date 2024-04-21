import java.time.LocalDate;
import java.util.List;

public class Animal {
    protected String name;
    protected LocalDate birthDay;
    protected List<String> vaccinations;
    protected String illness;
    protected String owner;

    public Animal(String name, LocalDate birthDay, List<String> vaccinations, String illness, String owner) {
        this.name = name;
        this.birthDay = birthDay;
        this.vaccinations = vaccinations;
        this.illness = illness;
        this.owner = owner;
    }

//    protected void walk() {    }
//
//    protected void fly() {    }
//
//    protected void swim() {    }

    private void wakeup() {
        System.out.println("Animal is wake up");
    }

    private void wakeup(int time) {
        System.out.println("Animal is wake up in " + time);
    }

    private void eat() {
        System.out.println("Animal is ate");
    }

    private void play() {
        System.out.println("Animal played");
    }

    private void sleep() {
        System.out.println("Animal sleeping");
    }

    public void lifeCycle() {
        wakeup();
        eat();
        play();
        sleep();
    }


    public String getName() {
        return name;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public List<String> getVaccinations() {
        return vaccinations;
    }

    public String getIllness() {
        return illness;
    }

    public String getOwner() {
        return owner;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", birthDay=" + birthDay +
                ", vaccinations=" + vaccinations +
                ", illness='" + illness + '\'' +
                ", owner='" + owner + '\'' +
                '}';
    }
}
