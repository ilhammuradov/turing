package az.edu.turing.module01.lesson28;

public class MyLinkedList<E> {

    private int size;
    private Node<E> head;

    public MyLinkedList(Node<E> head) {
        this.head = head;
        this.size++;
    }

    public void addTail(Node<E> tail) {
        if (head == null) {
            head = tail;
        } else {
            Node<E> curr = head;
            while (curr.getNext() != null) {
                curr = curr.getNext();
            }
            curr.setNext(tail);
        }
        size++;
    }

    public void addHead(Node<E> newHead) {
        if (head == null) {
            head = newHead;
        } else {
            newHead.setNext(head);
            head = newHead;
        }
        size++;
    }

    public int getSize() {
        return size;
    }

    public Node<E> getIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index  out of bounds ");
        } else {
            Node<E> current = head;
            for (int i = 0; i < index; i++) {
                current = current.getNext();
            }
            return current;
        }
    }

    public void update(int index, Node<E> data) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index  out of bounds ");
        } else {
            Node<E> current = head;
            for (int i = 0; i < index; i++) {
                current = current.getNext();
            }
            current.setData(data.getData());
        }
    }

    public void delete(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds ");
        }
        if (index == 0) {
            head = head.getNext();
        } else {
            Node<E> previous = head;
            for (int i = 0; i < index - 1; i++) {
                previous = previous.getNext();
            }
            Node<E> current = previous.getNext();
            previous.setNext(current.getNext());
        }
        size--;
    }

    public void deleteObject(E data) {
        if (head.getData().equals(data)) {
            head = head.getNext();
            size--;
            return;
        }

        Node<E> current = head;
        Node<E> previous = null;

        while (current != null && !current.getData().equals(data)) {
            previous = current;
            current = current.getNext();
        }

        if (current == null) {
            return;
        }

        previous.setNext(current.getNext());
        size--;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node<E> curr = head;
        while (curr != null) {
            sb.append(curr);
            curr = curr.getNext();
        }
        sb.append("null");
        return sb.toString();
    }
}
