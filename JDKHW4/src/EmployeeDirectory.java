import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

public class EmployeeDirectory {
    private List<Employee> employees;

    public EmployeeDirectory() {
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public List<Employee> findEmployeesByExperience(int targetExperience) {
                return employees.stream().filter(employee -> employee.getExperience()==targetExperience).toList();

    }

    public String findPhoneNumberByName(String targetName) {
        return employees.stream().filter(employee -> Objects.equals(employee.getName(), targetName)).toList().isEmpty() ?  "Сотрудник не найден":employees.stream().filter(employee -> Objects.equals(employee.getName(), targetName)).toList().toString();
    }

    public Employee findEmployeeByEmployeeId(int targetEmployeeId) {
        for (Employee employee : employees) {
            if (employee.getEmployeeId() == targetEmployeeId) {
                return employee;
            }
        }
        return null;
    }
}
