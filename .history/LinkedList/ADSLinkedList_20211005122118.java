public class ADSLinkedList<E> implements LinkedList<E> {
  private Node<E> head;
  private int size;

  public void LinkedList() {}

  public void addFirst(E element) {
    Node<E> newNode = new Node<>(element);
    if (this.head != null) {
      newNode.next = this.head;
    }
    this.head = newNode;
    this.size++;
  }

  public void addLast(E element) {
    Node<E> newNode = new Node<>(element);
    if (this.head == null) {
      this.head = newNode;
    } else {
      Node<E> current = this.head;
      while (current.next != null) {
      current = current.next;
      }
      current.next = newNode;
    }
    this.size++;
  }

  @Override
  public E removeFirst() {
    ensureNonEmpty();
    Node<E> temp = head;
    if(this.size==1){
      this.head= null;
      this.size--;
    }else{
      this.head = temp.next;
      this.size--;
    }
    return (E) temp;
  }

  private void ensureNonEmpty(){
    if(this.size<1){
      throw new IllegalStateException("LinkedList Empty!!");
    }
  }

  @Override
  public E removeLast() {
    ensureNonEmpty();
    if(this.size==1){
      this.head= null;
      this.size--;
      return (E) this.head;
    }else{
      Node<E> secondLast = this.head;
      while(secondLast.next.next != null){
        secondLast = secondLast.next;
      }
      secondLast.next = null;
      this.size--;
      return (E) secondLast ;
    }
  }

  @Override
  public E getFirst() {
    return (E) this.head.element;
  }

  @Override
  public E getLast() {
    Node<E> temp = this.head;
    while(temp.next != null) {
      temp = temp.next;
    }
    return (E) temp.element;
  }
  @Override
  public int size() {
    return this.size;
  }
    @Override
  public boolean isEmpty() {
    if(this.size<1){
      return true;
    }else{
      return false;
    }
  }
}
