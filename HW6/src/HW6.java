/*Реализуйте структуру телефонной книги с помощью HashMap.
Программа также должна учитывать, что во входной структуре будут повторяющиеся имена с разными телефонами, их необходимо считать, как одного человека с разными телефонами.
Вывод должен быть отсортирован по убыванию числа телефонов.
 */

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;


public class HW6 {
    public static void main(String[] args) {
        String name1 = "Ivanov";
        String name2 = "Petrov";
        String name3 = "Sidorov";
        int phone1 = 123456;
        int phone2 = 654321;

        PB Sidorov = new PB(name3, phone2);
        Sidorov.addPh(phone1);
        Sidorov.addPh(phone1);
        PB Ivanov = new PB(name1, phone1);
        Ivanov.addPh(phone2);
        PB Petrov = new PB(name2, phone2);

        HashMap<String, ArrayList<Integer>> PhoneBook = new HashMap<>();
        PhoneBook.put(Ivanov.getName(), Ivanov.getPhones());
        PhoneBook.put(Petrov.getName(), Petrov.getPhones());
        PhoneBook.put(Sidorov.getName(), Sidorov.getPhones());
        System.out.println(PhoneBook);

        ArrayList<PB> PhoneBookSorted = new ArrayList<>();
        PhoneBookSorted.add(Ivanov);
        PhoneBookSorted.add(Petrov);
        PhoneBookSorted.add(Sidorov);
        Collections.sort(PhoneBookSorted);
        System.out.println(PhoneBookSorted.toString());

    }
}

class PB implements Comparable<PB> {
    private String name;
    private ArrayList<Integer> phones = new ArrayList<>();

    PB(String n, int ph) {
        this.name = n;
        this.phones.add(ph);
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<Integer> getPhones() {
        return this.phones;
    }

    public void addPh(int ph) {
        this.phones.add(ph);
    }

    @Override
    public String toString() {
        return this.name + this.phones;
    }

    @Override
    public int compareTo(PB o) {
        return o.phones.size() - this.phones.size();
    }
}
