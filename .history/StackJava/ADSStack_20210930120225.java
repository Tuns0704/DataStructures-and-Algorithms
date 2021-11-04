import java.util.Iterator;
public class AbstractStack<E> implements Stack<E>{
    private Node<E> top;
    private int size;
    public void push(E element) {
        Node<E> newNode = new Node<>(element);
        newNode.previous = top;
        top = newNode;
        this.size++;
    }
    public E pop() {
        ensureNonEmpty();
        E element = this.top.element;
        Node<E> temp = this.top.previous;
        this.top.previous = null;
        this.top = temp;
        this.size--;
        return element;
        }
    private void ensureNonEmpty() {
        if(this.top==null){
            throw new IndexOutOfBoundsException(String.format("Empty Stack!"));
        }
    }
    public E peek() {
        ensureNonEmpty();
        return this.top.element;
    }
    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        if(this.top==null){
            return true;
        }
        return false;
    }
}

