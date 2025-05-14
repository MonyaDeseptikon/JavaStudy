import java.util.*;
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
//                return employees.stream().filter(employee -> employee.getExperience()==targetExperience).toList();
//        Я в полнейшем ахуе, - оказывается, итератор работает вот так и не иначе!!!
        List<Employee> returnFindExp = new ArrayList<>();
        ListIterator<Employee> findExp = employees.listIterator();
        while (findExp.hasNext()) {
            if (employees.get(findExp.nextIndex()).getExperience() == targetExperience)
                returnFindExp.add(employees.get(findExp.nextIndex()));
            findExp.next();
        }
//        for (Employee emp :employees){
//            if (emp.getExperience()==targetExperience) returnFindExp.add(emp);
//        }
//
        return returnFindExp;
    }

    public String findPhoneNumberByName(String targetName) {
        return employees.stream().filter(employee -> Objects.equals(employee.getName(), targetName)).toList().isEmpty() ? "Сотрудник не найден" : employees.stream().filter(employee -> Objects.equals(employee.getName(), targetName)).toList().toString();

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
