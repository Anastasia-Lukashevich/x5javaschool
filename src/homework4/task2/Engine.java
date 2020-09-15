package homework4.task2;

public class Engine {
    private final String fabricator;
    private final int capacity;

    public Engine(String fabricator, int capacity) {
        this.fabricator = fabricator;
        this.capacity = capacity;
    }

    public String getFabricator() {
        return fabricator;
    }

    public int getCapacity() {
        return capacity;
    }
}
