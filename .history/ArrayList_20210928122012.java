public interface ArrayList<E>{
  boolean add(E element);
  boolean add(int index, E element);
  E get(int index);
  E get(int index, E element);
  E remove(int index);
  int size();
  int indexOf(E element);
  boolean contains(E element);
  boolean isEmpty();
}
