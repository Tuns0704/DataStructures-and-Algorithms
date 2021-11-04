public class ADSStack<E> implements Stack<E> {
  @override
  public void push(E element) {
    Node<E> newNode = new Node<>(element);
    newNode.previous = top;
    top = newNode;
  }
}
