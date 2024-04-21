public class Nurse {
    private String name;
    private String gender= "женский";


    public Nurse(String name, String gender) {
        this.name = name;
        this.gender = gender;
            }
    public Nurse(String name) {
        this.name = name;
//        this.gender = gender;
    }
    public void inject(){
        System.out.printf("Медсестра %s ставит укол пациенту\n", name);
    }
    public void entry(){
        System.out.printf("Медсестра %s вносит запись в медицинскую книжку пациента\n", name);
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }
}
