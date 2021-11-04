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

  @Override
  public E removeLast() {
    try {
      var current = this.head;
      while (current.next.next != null){
        current = current.next;
      }
      E value = current.next.element;
      current.next = null;
    }
  }

  @Override
  public E getFirst() {
    if (this.head == null) {
      return null;
    }
    return head.element;
  }

  @Override
  public E getLast() {
    Node<E> current = this.head;
    while (current.next != null) {
      current = current.next;
    }
    return current.element;
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
