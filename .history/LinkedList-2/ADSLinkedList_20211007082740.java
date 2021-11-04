public class ADSLinkedList<E> implements LinkedList<E> {

    private Node<E> head;
    private int size;

    public void LinkedList() {}

    @Override
    public void addFirst(E element) {
        Node<E> newNode = new Node<>(element);
        this.head = newNode;
        this.size++;
    }

    @Override
    public void addLast(E element) {
        Node<E> newNode = new Node<>(element);
        Node<E> current = this.head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
        this.size++;
    }

    @Override
    public E removeFirst() {
        E value = this.head.element;
        this.head = this.head.next;
        this.size--;
        return value;
    }

    @Override
    public E removeLast() {
        var current = this.head;
        while (current.next.next != null) {
            current = current.next;
        }
        E value = current.next.element;
        current.next = null;
        this.size--;
        return value;
    }

    @Override
    public E getFirst() {
        return head.element;
    }

    @Override
    public E getLast() {
        Node<E> current = this.head;
        while (current.next != null) {
            current = current.next;
        }
        return current.element;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        if (head == null) return false;
        else return true;
    }

}