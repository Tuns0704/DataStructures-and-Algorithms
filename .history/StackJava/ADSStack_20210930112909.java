public class ADSStack<E> implements Stack<E> {
  @override
  public void push(E element) {
    Nodes.push(element);
  }
}
