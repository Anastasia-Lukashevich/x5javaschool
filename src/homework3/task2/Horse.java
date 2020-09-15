package homework3.task2;

public class Horse extends Animal {
    private final String name;
    private final boolean shod;

    public Horse(String name, String food, String location, boolean shod) {
        super(food, location);
        this.name = name;
        this.shod = shod;
    }

    @Override
    public void makeNoise() {
        System.out.println(name + "говорит ИГОГО!");
    }

    @Override
    public void eat() {
        System.out.println(name + " ест " + food);
    }
}
