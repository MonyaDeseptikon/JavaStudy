import java.time.LocalDate;
import java.util.Comparator;

public class Employees {
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private String position;
    private double salary;
    private Gender gender;

    public Employees(String firstName, String lastName, LocalDate birthDate, String position, double salary, Gender gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.position = position;
        this.salary = salary;
        this.gender = gender;
    }

    public static Comparator<Employees> birthDateComparator() {
        return Comparator.comparing(employee -> employee.birthDate);
    }

    public static void increaseSalary(Employees[] employees, double percentage) {
        for (Employees employee : employees) {
            if (!(employee instanceof Manager)) {
                double currentSalary = employee.getSalary();
                double newSalary = currentSalary * (1 + percentage / 100);
                employee.setSalary(newSalary);
            }
        }
    }

    public double getSalary() {
        return salary;
    }

    public Gender getGender() {
        return gender;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate=" + birthDate +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                ", gender=" + gender +
                '}';
    }
}
