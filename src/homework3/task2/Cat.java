package homework3.task2;

public class Cat extends Animal {
    private final String name;

    public Cat(String name, String food, String location) {
        super(food, location);
        this.name = name;
    }

    @Override
    public void makeNoise() {
        System.out.println(name + "говорит МЯУ!");
    }

    @Override
    public void eat() {
        System.out.println(name + " ест " + food);
    }
}
