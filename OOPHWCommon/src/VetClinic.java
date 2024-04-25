import Animals.*;
import Personal.Doctor;
import Personal.Nurse;

import java.util.*;

public class VetClinic {
    private List<Animal> pacients = new ArrayList<>();
    private List<Walkable> walkables = new ArrayList<>();
    private List<Flyable> flyables = new ArrayList<>();
    private List<Swimmable> swimmables = new ArrayList<>();
    private List<Doctor> doctors = new ArrayList<>();
    private List<Nurse> nurses = new ArrayList<>();
int index = 0;

    public void addPacients(Animal... a) {
        Collections.addAll(pacients, a);
    }
    public void addDoctors(Doctor... d) {
        Collections.addAll(doctors, d);
    }
    public void operPac (Doctor d, Animal a){
      d.getNurse().inject();
        System.out.println(a.getName());
        d.oper();
        System.out.println(a.getName());
        d.getNurse().entry();
    }

    public List<Walkable> walkables() {
        for (Animal a : pacients) {
            if (a instanceof Walkable) {
                walkables.add((Walkable) a);
            }
        }
        return walkables;
    }
    public List<Flyable> flyables() {
        for (Animal a : pacients) {
            if (a instanceof Flyable) {
                flyables.add((Flyable) a);
            }
        }
        return flyables;
    }
    public List<Swimmable> swimmables() {
        for (Animal a : pacients) {
            if (a instanceof Swimmable) {
                swimmables.add((Swimmable) a);
            }
        }
        return swimmables;
    }

}
