package Animals;

public interface Walkable {
    default double walk() {
        return 0;
    }
}
