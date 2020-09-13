package homework4;

public class SportCar extends Car {
    private final int maxSpeed;

    public SportCar(String brand, String carClass, int weight, Engine carEngine, int maxSpeed) {
        super(brand, carClass, weight, carEngine);
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void start() {
        System.out.println("SportCar поехал.");
    }

    @Override
    public void stop() {
        System.out.println("SportCar остановился.");
    }

    @Override
    public void printInfo() {
        System.out.println(
                "Марка автомобиля: " + brand +
                        " Класс автомобиля: " + carClass +
                        " Вес:" + weight +
                        " Производитель мотора: " + carEngine.getFabricator() +
                        " Мощность мотора: " + carEngine.getCapacity() +
                        " Грузоподъемность кузова: " + getMaxSpeed()
        );
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }
}
