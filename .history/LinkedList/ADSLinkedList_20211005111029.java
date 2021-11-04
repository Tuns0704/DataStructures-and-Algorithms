public class ADSLinkedList<E> implements LinkedList<E> {
  private Node<E> head;
  private int size;

  public ADSLinkedList() {}
  public void addFist(E element){

  }
  public void addLast(E element){
    Node<E> newNode = new Node<>(element);
    if(this.head == null){
      this.head = newNode;
    }else{
      Node<E> current = this.head;
      while(current.next != null){
        current = current.next;
      }
      current.next = newNode;
    }
    this.size++;
  }
  private void ensureNonEmpty(){
    if(this.size<1){
      throw new IllegalStateException("LinkedList Empty!!");
    }
  }
  public E removeFist(){
    ensureNoneEmpty();
    Node<E> temp = head;
    if(this.size == 1){
      this.head = null;
      this.size--;
    }else{
      this.head = temp.next;
    }
  }

}
