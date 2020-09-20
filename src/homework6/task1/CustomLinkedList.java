package homework6.task1;

public class CustomLinkedList<E> implements CustomCollection<E> {
    private int size = 0;
    private Node<E> firstNode = new Node<>();

    @Override
    public int size() {
        return size;
    }

    @Override
    public void add(E item) {
        Node<E> currentNode = firstNode;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = new Node<>(item);
        size++;
    }

    @Override
    public void remove(int index) {
        if (index < 0 && index >= size) {
            throw new IndexOutOfBoundsException();
        }
        Node<E> currentNode = firstNode;
        int count = 0;
        while (count < index) {
            currentNode = currentNode.next;
            count++;
        }
        currentNode.next = currentNode.next.next;
        size--;
    }

    @Override
    public void remove(E item) {
        Node<E> currentNode = firstNode;
        while (currentNode.next != null) {
            Node<E> nodeToCheck = currentNode.next;
            if (nodeToCheck.item.equals(item)) {
                currentNode.next = nodeToCheck.next;
                size--;
                return;
            }
            currentNode = nodeToCheck;
        }
    }

    @Override
    public E get(int index) {
        if (index < 0 && index >= size) {
            throw new IndexOutOfBoundsException();
        }
        Node<E> currentNode = firstNode;
        int count = 0;
        while (count <= index) {
            currentNode = currentNode.next;
            count++;
        }
        return currentNode.item;
    }

    @Override
    public void clear() {
        firstNode.next = null;
        size = 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomLinkedList<?> that = (CustomLinkedList<?>) o;
        return firstNode.item.equals(that.firstNode.item);
    }

    @Override
    public String toString() {
        Node<E> currentNode = firstNode;
        String result = "[";
        int count = 0;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
            if (count != 0) {
                result += ", ";
            }
            result += currentNode.item;
            count++;
        }
        result += "]";
        return result;
    }

    private static class Node<E> {
        E item;
        Node<E> next;

        public Node() {
        }

        public Node(E item) {
            this.item = item;
        }
    }
}
