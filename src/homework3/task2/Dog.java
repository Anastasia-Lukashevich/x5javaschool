package homework3.task2;

public class Dog extends Animal {
    private final String name;

    public Dog(String name, String food, String location) {
        super(food, location);
        this.name = name;
    }

    @Override
    public void makeNoise() {
        System.out.println(name + "говорит ГАВ!");
    }

    @Override
    public void eat() {
        System.out.println(name + " ест " + food);
    }
}
