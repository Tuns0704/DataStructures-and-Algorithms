public interface LinkedList<E> {
  void addFirst(E element);
  void addLast(E element);
  void addAfter(E element);
  E removeFirst();
  E removeLast();
  E getFirst();
  E getLast();
  int size();
  boolean isEmpty();
}
