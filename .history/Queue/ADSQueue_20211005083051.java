import java.util.Queue;
public class ADSQueue<E> implements Queue<E> {
  private Node<E> head;
  private int size = 0;

  public ADSQueue() {

  }

  public void offer(E element) {
    Node<E> newNode = new Node<>(element);
    if(this.head == null){
      this.head = newNode;
    }else{
      Node<E> current = this.head;
      while(current.next() != null){
        current = current.next;
      }
      current.next = newNode;
    }
    this.size++;
  }
  private void ensureNonEmpty() {
    if(this.head==null){
      throw new IndexOutOfBoundsException(String.format("Empty Stack!"));
    }
  }

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
    this.size--;
    return element;
  }

  public E peek() {
    ensureNonEmpty();
    return this.head.elements;
  }

  public int size() {
    return size;
  }

  public boolean isEmpty() {
    if (size > 0) return false;
    else return true;
  }
}
