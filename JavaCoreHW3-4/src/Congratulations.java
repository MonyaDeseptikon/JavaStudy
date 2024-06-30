import java.time.LocalDate;

public class Congratulations {
    private LocalDate current = LocalDate.now();
    private Employees[] employees;


    public Congratulations(Employees[] employees) {
        this.employees = employees;
    }

    public void run() {
        if (current.getMonth() == Holiday.NY.getHoliday().getMonth() && current.getDayOfMonth() == Holiday.NY.getHoliday().getDayOfMonth()) {
            congratulations("Happy New Year!");
        } else if (current.getMonth() == Holiday.March.getHoliday().getMonth() && current.getDayOfMonth() == Holiday.March.getHoliday().getDayOfMonth()) {
            congratulations("Congratulations on International Women's Day!", Gender.FEMALE);
        } else if (current.getMonth() == Holiday.February.getHoliday().getMonth() && current.getDayOfMonth() == Holiday.February.getHoliday().getDayOfMonth()) {
            congratulations("Congratulations on Defender of the Fatherland Day!", Gender.MALE);
        }
    }

    private void congratulations(String textOfHoliday, Gender gender) {
        for (Employees e : employees) {
            if (e.getGender().equals(gender)) {
                System.out.printf("%s %s", e, textOfHoliday);
                System.out.println();
            }
        }
    }

    private void congratulations(String textOfHoliday) {
        for (Employees e : employees) {
            System.out.printf("%s %s", e, textOfHoliday);
            System.out.println();
        }
    }
}



