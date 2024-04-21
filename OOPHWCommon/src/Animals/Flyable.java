package Animals;

public interface Flyable {
    default double fly() {
        return 0;
    }
}
