public interface LinkedList<E> {
  void addFirst(E element);
  void addLast(E element);
  void addAfter(E currentElement, E newElement);
  E removeFirst();
  E removeLast();
  E remove();
  E getFirst();
  E getLast();
  int size();
  boolean isEmpty();
}
