package homework4;

public class Engine {
    String fabricator;
    int capacity;

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
