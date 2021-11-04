public class ADSQueue<E> implements Queue<E> {
  public E poll(){
    ensureNonEmpty();
    E element = this.head.element;
    if(this.size == 1){
      this.head = null;
    }
  }
  public E peek() {
    ensureNonEmpty();
    return this.top.elements;
  }
}
