public class ADSStack<E> implements Stack<E> {

  @override
  public void push(E element) {
    Node<E> newNode = new Node<>(element);
    newNode.previous = top;
    top = newNode;
    this.size++;
  }

  @override
  public E pop(){
    ensureNonEmpty();
    E element = this.top.element;
    Node<E> temp = this.top.previous;
    this.top.previous = null;
    this.top = temp;
    this.size--;
    return element;
  }

  @override
  public E peek(){
    ensureNonEmpty();
    return this.top.element;
  }

  @nonnull
  public Interator<E> interator(){
    return new Interator<E>() {
      private Node<E> current = top;
    }
  }
}
