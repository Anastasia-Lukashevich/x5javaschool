package homework3.task2;

public class Veterinarian {
    private final int experience;
    private final String name;

    public Veterinarian(String name, int experience) {
        this.name = name;
        this.experience = experience;
    }

    public void treatAnimal(Animal animal) {
        System.out.println("Животное ест " + animal.getFood() + " и живет в " + animal.getLocation());
    }
}
