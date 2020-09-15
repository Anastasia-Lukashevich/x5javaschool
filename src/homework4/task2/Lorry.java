package homework4.task2;

public class Lorry extends Car {
    private final int liftingCapacity;

    public Lorry(String Brand, String carClass, int weight, Engine carEngine, int liftingCapacity) {
        super(Brand, carClass, weight, carEngine);
        this.liftingCapacity = liftingCapacity;
    }

    @Override
    public void start() {
        System.out.println("Грузовик поехал.");
    }

    @Override
    public void stop() {
        System.out.println("Грузовик остановился.");
    }

    @Override
    public void printInfo() {
        System.out.println(
                "Марка автомобиля: " + brand +
                        " Класс автомобиля: " + carClass +
                        " Вес:" + weight +
                        " Производитель мотора: " + carEngine.getFabricator() +
                        " Мощность мотора: " + carEngine.getCapacity() +
                        " Грузоподъемность кузова: " + getLiftingCapacity()
        );
    }

    public int getLiftingCapacity() {
        return liftingCapacity;
    }
}
