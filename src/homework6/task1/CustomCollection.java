package homework6.task1;

public interface CustomCollection<E> {
    int size();

    void add(E item);

    void remove(int index);

    void remove(E item);

    E get(int index);

    void clear();
}
