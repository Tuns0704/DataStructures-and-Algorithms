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
    }else{}
  }

}
