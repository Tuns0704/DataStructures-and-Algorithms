public class ADSQueue<E> implements Queue<E> {
  public E peek() {
    ensureNonEmpty();
    return this.top
  }
}
