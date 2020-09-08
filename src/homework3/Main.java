package homework3;

public class Main {
    public static void main(String[] args) {
        //Задание 1
        System.out.println("Задание 1.");
        Phone phone1 = new Phone("89150504662", "Huawei P30", 500);
        Phone phone2 = new Phone("89051478966", "Huawei P40 lite", 395.50);
        Phone phone3 = new Phone("89107651250", "Samsung Galaxy A71", 485);
        Phone[] phones = new Phone[]{phone1, phone2, phone3};

        for (Phone phone : phones) {
            System.out.println("Телефон: " + phone.getNumber() + ", Модель: " + phone.getModel() + ", Вес: " + phone.getWeight() + "г.");
            phone.receiveCall("Мария");
            System.out.println(phone.getNumber());
            phone.receiveCall("Анастасия", phone.getNumber());
            phone.sendMessage(phone.getNumber());
        }
        //Задание2
        System.out.println("Задание 2.");
        Cat martin = new Cat("Мартин", "кошачий корм", "Москва");
        Cat push = new Cat("Пушок", "кошачий корм", "Москва");
        Dog laika = new Dog("Лайка", "собачий корм", "Санкт-Петербург");
        Horse gena = new Horse("Геннадий", "трава", "Ярославль", true);
        Horse bojack = new Horse("Бо Джек", "трава", "Москва", true);
        Veterinarian ivanII = new Veterinarian("Иванов Иван Иванович", 10);

        Animal[] animals = new Animal[]{martin, push, laika, gena, bojack};
        for (Animal animal : animals) {
            ivanII.treatAnimal(animal);
        }
        //Задание 3
        System.out.println("Задание 3.");
        Student maks = new Aspirant("Максим", "Федоров", "К05-221", 5.00, "Программирвоание на бумажке");
        Student sasha = new Aspirant("Александр", "Климов", "К07-222", 3.78, "Наука для чайников");
        Aspirant lena = new Aspirant("Елена", "Климова", "К07-222", 4.95, "Наука для чайников");
        Student lesha = new Student("Алексей", "Суворов", "К01-221", 5);
        Student kate = new Student("Екатерина", "Полякова", "КРТ-22301", 3);

        Student[] students = new Student[]{maks, sasha, lena, lesha, kate};
        for (Student student : students) {
            System.out.println(student.getLastName() + " " + student.getFirstName() + ": стипендия равна " + student.getScholarship(student.averageMark));
        }

    }
}
