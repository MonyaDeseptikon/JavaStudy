import java.util.List;

public class Main {
    public static void main(String[] args) {
        EmployeeDirectory directory = new EmployeeDirectory();

        // Добавление новых сотрудников
        directory.addEmployee(new Employee(1, "8(985)863-96-74", "Иванов Николай Петрович", 5));
        directory.addEmployee(new Employee(2, "8(635)878-85-48", "Сидорова Виктория Ивановна", 3));
        directory.addEmployee(new Employee(3, "8(485)125-32-21", "Калмыкова Юлия Сергеевна", 3));
        directory.addEmployee(new Employee(4, "8(519)362-46-31", "Дедков Иван Юрьевич", 7));
        directory.addEmployee(new Employee(5, "8(785)496-49-11", "Симухин Владимир Митрофанович", 3));

        // Поиск сотрудников по стажу
        List<Employee> employeesWithExperience3 = directory.findEmployeesByExperience(3);
        System.out.println("Сотрудники со стажем 3 года: " + employeesWithExperience3);

        // Поиск номера телефона по имени
        String phoneNumberIvanov = directory.findPhoneNumberByName("Иванов Николай Петрович");
        System.out.println("Номер телефона для: 'Иванов Н.П.': " + phoneNumberIvanov);

        // Поиск сотрудника по табельному номеру
        Employee employeeById2 = directory.findEmployeeByEmployeeId(2);
        System.out.println("Информация о сотруднике с табельным номером 2: " + employeeById2);
    }

    }
