package homework3.task2;

public class Animal {
    protected String food;
    private String location;

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    public String getFood() {
        return food;
    }

    public String getLocation() {
        return location;
    }

    public void makeNoise() {
        System.out.println("Животное издает звук");
    }

    public void eat() {
        System.out.println("Животное ест.");
    }

    public void sleep() {
        System.out.println("Животное спит!");
    }
}
