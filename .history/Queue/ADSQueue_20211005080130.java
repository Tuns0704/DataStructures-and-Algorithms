public class ADSQueue<E> implements Queue<E> {
  public E poll(){
    ensureNonEmpty();
    E element = this.head.element;
  }
  public E peek() {
    ensureNonEmpty();
    return this.top.elements;
  }
}
