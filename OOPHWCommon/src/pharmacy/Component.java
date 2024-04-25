package pharmacy;

public class Component implements Comparable <Component>{
    private String  name;
    private String wight;
    private int power;


    public Component(String name, String wight, int power) {
        this.name = name;
        this.wight = wight;
        this.power = power;
    }

    @Override
    public String toString() {
        return "Component{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Component o) {
        return Integer.compare(o.power, this.power);
    }
}
