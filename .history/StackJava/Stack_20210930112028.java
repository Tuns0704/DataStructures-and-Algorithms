public interface Stack<E> {
  void push(E element);
  E pop();
  E peel();
  int size();
  boolean isEmpty();
}
