import java.time.LocalDate;

public class MainJCHW34 {
    public static void main(String[] args) {
        Employees ivanov = new Employees("Ivan", "Ivanov", LocalDate.of(1987, 06, 23), "programmer", 30000, Gender.MALE);


        Employees petrov = new Employees("Petr", "Petrov", LocalDate.of(1991, 07, 13), "ingeneer", 35000, Gender.MALE);


        Employees sidorov = new Manager("Sidor", "Sidorov", LocalDate.of(1987, 06, 23), "director", 50000, Gender.MALE);
        Employees anna = new Employees("Anna", "Ivanova", LocalDate.of(1989, 06, 23), "secretary", 25000, Gender.FEMALE);
Employees [] employees = {ivanov, petrov, sidorov, anna};
//for (Employees e : employees) {
//    System.out.println(e);
//}
Employees.increaseSalary(employees,10);
        for (Employees e : employees) {
            System.out.println(e);
        }

Congratulations congratulations= new Congratulations(employees);
congratulations.run();


    }
}