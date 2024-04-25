package pharmacy;

import java.util.*;

public class Pharmacy implements Iterator<Component>, Comparable<Pharmacy> {
    private int index;
    private List<Component> components;

    public Pharmacy() {
        this.index = 0;
        this.components = new ArrayList<>();

    }

    public void addComponent(Component... components) {
        if (components == null) {
            System.out.println("Вы ничего не добавили");
        } else Collections.addAll(this.components, components);
    }

    @Override
    public String toString() {
        return "{" +
                components +
                '}';
    }

    @Override
    public boolean hasNext() {
        return index < components.size();
    }

    @Override
    public Component next() {

        return components.get(index++);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pharmacy pharmacy = (Pharmacy) o;
        return Objects.equals(components, pharmacy.components);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(components);
    }

    @Override
    public int compareTo(Pharmacy o) {
        return Integer.compare(this.components.size(),o.components.size());

    }
}
