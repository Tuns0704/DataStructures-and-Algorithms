public class ADSStack<E> implements Stack<E> {

  @Override
  public void push(E element) {
    Node<E> newNode = new Node<>(element);
    newNode.previous = top;
    top = newNode;
    this.size++;
  }

  @Override
  public E pop(){
    ensureNonEmpty();
    E element = this.top.element;
    Node<E> temp = this.top.previous;
    this.top.previous = null;
    this.top = temp;
    this.size--;
    return element;
  }

  @Override
  public E peek(){
    ensureNonEmpty();
    return this.top.element;
  }

  @Nonnull
  @Override
  public Interator<E> interator(){
    return new Interator<E>() {
      private Node<E> current = top;

      @Override
      public boolean hasNext() {
        return current != null;
      }
      @Override
      public E next() {}
    }
  }
}
