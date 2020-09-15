package homework4.task1;

public class Circle implements Shape {
    private static final double PI = 3.14;
    private final int radius;

    public Circle(int radius) {
        this.radius = radius;

    }

    @Override
    public double square() {
        return PI * Math.pow(radius, 2);
    }
}
