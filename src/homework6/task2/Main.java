package homework6.task2;

public class Main {
    public static void main(String[] args) {
        Box<Apple> appleBox1 = new Box<>();
        Box<Orange> orangeBox1 = new Box<>();
        Box<Apple> appleBox2 = new Box<>();
        Box<Orange> orangeBox2 = new Box<>();
        for (int i = 0; i < 4; i++) {
            appleBox1.addToBox(new Apple());
        }
        for (int i = 0; i < 4; i++) {
            appleBox2.addToBox(new Apple());
        }
        for (int i = 0; i < 7; i++) {
            orangeBox1.addToBox(new Orange());
        }

        System.out.println("Вес коробки с яблоками №1: " + appleBox1.getWeight());
        System.out.println("Вес коробки с яблоками №2: " + appleBox2.getWeight());
        System.out.println("Вес коробки с апельсинами №1: " + orangeBox1.getWeight());
        System.out.println("Вес коробки с апельсинами №2: " + orangeBox2.getWeight());
        orangeBox1.putInAnotherBox(orangeBox2);
        System.out.println("Вес коробки с апельсинами №1 после переноса: " + orangeBox1.getWeight());
        System.out.println("Вес коробки с апельсинами №2 после переноса: " + orangeBox2.getWeight());
        System.out.println("Равны ли коробка с яблоками №1 и №2? Ответ: " + appleBox1.compare(appleBox2));
        System.out.println("Равны ли коробка с апельсинами №1 и №2? Ответ: " + orangeBox1.compare(orangeBox2));
        System.out.println("Равны ли коробка с яблоками №1 и коробка с апельсинами №2? Ответ: " + appleBox1.compare(orangeBox2));
    }
}
