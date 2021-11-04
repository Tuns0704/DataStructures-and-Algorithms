import java.util.Iterator;

public class ADSStack<E> implements Stack<E> {

  public void push(E element) {
    Node<E> newNode = new Node<>(element);
    newNode.previous = top;
    top = newNode;
    this.size++;
  }

  public E pop(){
    ensureNonEmpty();
    E element = this.top.element;
    Node<E> temp = this.top.previous;
    this.top.previous = null;
    this.top = temp;
    this.size--;
    return element;
  }

  public E peek(){
    ensureNonEmpty();
    return this.top.element;
  }

  public Iterator<E> interator(){
    return new Interator<E>() {
      private Node<E> current = top;
      public boolean hasNext() {
        return current != null;
      }
      public E next() {
        E element = current.element;
        this.current = this.current.previous;
        return element;
      }
    };
  }
}
