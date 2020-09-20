package homework6.task1;

import java.util.Arrays;

public class CustomArrayList<E> implements CustomCollection<E> {
    private final int capacity = 10;
    private int size = 0;
    private E[] elements;

    public CustomArrayList() {
        elements = (E[]) new Object[capacity];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void add(E item) {
        if (size == elements.length - 1) {
            resize(capacity * 2);
        }
        elements[size++] = item;
    }

    @Override
    public void remove(int index) {
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        elements[size - 1] = null;
        size--;
    }

    @Override
    public void remove(E item) {
        int index = -1;
        for (int i = 0; i < size - 1; i++) {
            if (item.equals(elements[i])) {
                index = i;
                break;
            }
        }
        if (index >= 0) {
            remove(index);
        } else {
            System.out.println("Нет элементов для удаления.");
        }
    }

    @Override
    public E get(int index) {
        return elements[index];
    }

    @Override
    public void clear() {
        for (int i = 0; i < size; i++) {
            elements[i] = null;
        }
        size = 0;
    }

    private void resize(int newCapacity) {
        E[] newElements = (E[]) new Object[newCapacity];
        System.arraycopy(elements, 0, newElements, 0, size);
        elements = newElements;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomArrayList<?> arrayList = (CustomArrayList<?>) o;
        return Arrays.equals(elements, arrayList.elements);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(elements);
    }

    @Override
    public String toString() {
        return Arrays.toString(elements);
    }
}
