package homework3;

public class Veterinarian {
    int experience;
    String name;

    Veterinarian(String name, int experience) {
        this.name = name;
        this.experience = experience;
    }

    public void treatAnimal(Animal animal) {
        System.out.println("Животное ест " + animal.getFood() + " и живет в " + animal.getLocation());
    }
}
