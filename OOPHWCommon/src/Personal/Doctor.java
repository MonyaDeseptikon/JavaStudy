package Personal;

public class Doctor {
    private String name;
    private String gender;
    private Nurse nurse;

    public Doctor(String name, Nurse nurse, String gender) {
        this.name = name;
        this.gender = gender;
        this.nurse = nurse;
    }

    public void exam() {
        System.out.printf("Доктор %s проводит осмотр пациента\n", name);
    }

    public void oper() {
        System.out.printf("Доктор %s проводит операцию над пациентом\n", name);
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public Nurse getNurse() {
        return nurse;
    }
}
