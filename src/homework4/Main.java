package homework4;

import homework4.task1.Circle;
import homework4.task1.Rectangle;
import homework4.task1.Shape;
import homework4.task1.Triangle;
import homework4.task2.Car;
import homework4.task2.Engine;
import homework4.task2.Lorry;
import homework4.task2.SportCar;

public class Main {
    public static void main(String[] args) {
        //Задание 1
        Shape[] shape = new Shape[3];
        shape[0] = new Triangle(5, 9, 7);
        shape[1] = new Circle(8);
        shape[2] = new Rectangle(18, 7);
        for (Shape sh : shape) {
            System.out.println("Площадь фигуры: " + sh.square());
        }
        //Задание 2
        Car[] cars = new Car[2];
        cars[0] = new SportCar("Audi", "Спортивный автомобиль", 1000, new Engine("Audi AG", 350), 300);
        cars[1] = new Lorry("MAN", "Грузовой автомобиль", 5500, new Engine("MAN Engines", 800), 8000);
        for (Car car : cars) {
            car.printInfo();
            car.start();
            car.stop();
        }
    }
}
