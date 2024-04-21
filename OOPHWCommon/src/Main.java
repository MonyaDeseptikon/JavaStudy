import Animals.Animal;
import Animals.Cat;
import Animals.Duck;
import Animals.Eagle;

import javax.print.Doc;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //ДЗ№1
        Animal barsik = new Cat("Barsik", LocalDate.of(2014, 5, 6), new ArrayList<>(), "Chumka", "Boss", 4);
        Animal eagle = new Eagle("Kesha", LocalDate.of(2014, 5, 6), new ArrayList<>(), "Chumka", "Boss");
        Animal donald = new Duck("Donald", LocalDate.of(2014, 5, 6), new ArrayList<>(), "Chumka", "Boss");
       /* List<Animal> animals = new ArrayList<>();
        animals.add(barsik);
        animals.add(eagle);
        animals.add(donald);
        System.out.println(animals);
        eagle.lifeCycle();
        ((Eagle) eagle).fly();
//        barsik.fly();
        ((Duck) donald).fly();
        ((Duck) donald).swim();
//        donald.walk();
        */
        //ДЗ№2
        VetClinic clinic = new VetClinic();
        Nurse mara = new Nurse("Mara");
        Doctor jango = new Doctor("Jango", mara, "male");
        Doctor nessy = new Doctor("Nessy", mara, "female");
        clinic.addPacients(barsik, eagle, donald);
        System.out.println(clinic.walkables());
        System.out.println(clinic.flyables());
        System.out.println(clinic.swimmables());
        System.out.println(mara.getName());
        System.out.println(((Cat) barsik).walk());

        clinic.addDoctors(jango, nessy);
        clinic.operPac(jango, barsik);

    }
}

