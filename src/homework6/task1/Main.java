package homework6.task1;

public class Main {
    public static void main(String[] args) {
        CustomCollection<Integer> list1 = new CustomArrayList<>();
        CustomCollection<Integer> list2 = new CustomLinkedList<>();

        printResult(list1);
        printResult(list2);
    }

    private static void printResult(CustomCollection<Integer> collection) {
        collection.add(1);
        collection.add(4);
        collection.add(3);
        collection.add(4);
        collection.add(5);
        collection.add(8);
        System.out.println("Первоначальная коллекция: " + collection.toString());
        System.out.println("Размер коллекции: " + collection.size());
        System.out.println("Элемент коллекции с index=4: " + collection.get(4));
        collection.remove(2);
        System.out.println("Удален элемент с index=2: " + collection.toString());
        System.out.println("Размер коллекции: " + collection.size());
        collection.remove((Integer) 4);
        System.out.println("Удалена первая 4ка в коллекции: " + collection.toString());
        System.out.println("Размер коллекции: " + collection.size());
        collection.clear();
        System.out.println("коллекция очищена: " + collection.toString());
        System.out.println("Размер коллекции: " + collection.size());
    }
}
