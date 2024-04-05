package az.edu.turing.module01.lesson24;

import java.util.Objects;

public class Box<E> {

    private final E data;

    public Box(E data) {
        this.data = data;
    }

    public E getData() {
        return data;
    }

    public boolean isEmpty() {
        return data == null;
    }

    @Override
    public String toString() {
        return String.format("{data=%s}", data);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Box<?> box = (Box<?>) o;
        return Objects.equals(data, box.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data);
    }
}
