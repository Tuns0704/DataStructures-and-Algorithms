public interface Queue<E> {
  void offer(E element);
  E poll();
  E peek();
  int size();
  boolean isEmpty();
}
