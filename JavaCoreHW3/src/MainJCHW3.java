import java.time.LocalDate;

public class MainJCHW3 {
    public static void main(String[] args) {
        Employees ivanov = new Employees("Ivan", "Ivanov", LocalDate.of(1987, 06, 23), "programmer", 30000);


        Employees petrov = new Employees("Petr", "Petrov", LocalDate.of(1991, 07, 13), "ingeneer", 35000);


        Employees sidorov = new Manager("Sidor", "Sidorov", LocalDate.of(1987, 06, 23), "director", 50000);
Employees [] employees = {ivanov, petrov, sidorov};
for (Employees e : employees) {
    System.out.println(e);
}
Employees.increaseSalary(employees,10);
        for (Employees e : employees) {
            System.out.println(e);
        }
    }
}