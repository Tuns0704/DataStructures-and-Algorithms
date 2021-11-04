import java.util.Queue;
public class ADSQueue<E> implements Queue<E> {

  private int size = 0;

  public E poll(){
    ensureNonEmpty();
    E element = this.head.element;
    if(this.size == 1){
      this.head = null;
    }else{
      Nodes<E> next = this.head.next;
      this.head.next = null;
      this.head = next;
    }
  }

  public E peek() {
    ensureNonEmpty();
    return this.top.elements;
  }

  public int size() {
    return size;
  }

  public boolean isEmpty() {
    if (size > 0) return false;
    else return true;
  }
}
