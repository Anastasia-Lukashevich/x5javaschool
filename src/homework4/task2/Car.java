package homework4.task2;

public abstract class Car {
    protected final String brand;
    protected final String carClass;
    protected final int weight;
    protected final Engine carEngine;

    public Car(String brand, String carClass, int weight, Engine carEngine) {
        this.brand = brand;
        this.carClass = carClass;
        this.weight = weight;
        this.carEngine = carEngine;
    }

    public abstract void start();

    public abstract void stop();

    public abstract void printInfo();

    public void turnRight() {
        System.out.println("Поворот направо.");
    }

    public void turnLeft() {
        System.out.println("Поворот налево.");
    }

}
