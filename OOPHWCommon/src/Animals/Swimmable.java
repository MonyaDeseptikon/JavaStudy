package Animals;

public interface Swimmable {
    default double swim() {
        return 0;
    }
}
