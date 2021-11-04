import javax.lang.model.element.Element;

public class ADSDoublyLinkedList<E> implements DoublyLinkedList<E>  {

  private int size;
  private Node<E> head;
  private Node<E> tail;
  public ADSDoublyLinkedList(){}

  @Override
  public void addFirst(E element) {
    Node<E> newNode = new Node<E>(element);
    newNode.prev=null;
    if (this.head == null) {
      this.head = newNode;
      this.tail = newNode;
    } else {
      this.head.prev = newNode;
      newNode.next = this.head;
      this.head = newNode;
      this.size++;
    }
  }

  @Override
  public void addLast(E element) {
    Node<E> newNode = new Node<E>(element);
    newNode.next=null;
    if (this.head == null) {
      this.head = newNode;
      this.tail = newNode;
    } else {
      newNode.prev = this.tail;
      this.tail.next = newNode;
      this.tail = newNode;
      if (this.head.next == null) {
        this.head.next = newNode;
      }
    }
    this.size++;
  }

  @Override
  public E removeFirst() {
    try{
      Node<E> temp = head;
      if(this.size==1){
        this.head = null;
        this.tail = null;
        this.size--;
      }else{
        this.head = temp.next;
        this.head.prev = null;
        this.size--;
      }
      return (E) temp;
    }catch(Exception e){
      System.out.println("Exception"+e);
      return null;
    }
  }

  @Override
  public E removeLast() {
    try{
      if(this.size==1){
        this.head = null;
        this.tail = null;
        this.size--;
        return (E) this.head;
      }else{
        Node<E> temp = this.tail;
        this.tail = this.tail.prev;
        this.tail.next=null;
        return (E) temp ;
      }
    }catch(Exception e){
      System.out.println("Exception"+e);
        return null;
    }
  }

  @Override
  public E getFirst() {
    if(this.isEmpty()==true){
      return null;
    }else{
      return (E) this.head.element;
    }
  }

  @Override
  public E getLast() {
    if(this.isEmpty()==true){
      return null;
    }else{
      return (E) this.tail.element;
    }
  }

  @Override
  public int size() {
    return this.size;
  }

  @Override
  public boolean isEmpty() {
    if (head == null) return true;
    else return false;
  }
  private Node<E> checkElement(E element){
    Node<E> temp = new Node<E>(element);
    Node<E> findNode = null;
    Node<E> current = this.head;
    boolean find =false;
    while(current.next != null){
      current=current.next;
      if(current.element == element){
        find = true;
        findNode = current;
        break;
      }
    }
    if(find == true){
      return (ADSDoublyLinkedList) findNode;
    }else{
      return (ADSDoublyLinkedList) null;
    }
  }

  @Override
  public void addAfter(E prev_Node, E new_data) {
    var previousNode = checkElement(prev_Node);
    if(previousNode!=null){
      Node<E> newNode = new Node<E>(new_data);
     //Node<E> prevNode = new Node<E>(prev_Node);
      newNode.next = previousNode.next; //2
      previousNode.next.prev= newNode; //3
      previousNode.next = newNode;    //1
      newNode.prev = previousNode;   //2
      size++;
    }else{
      System.out.println("Exception null");
    }
  }

  @Override
  public E remove(E element) {
    if(checkElement(element)!=null){
      var removeNode = checkElement(element);
      if(removeNode.element==this.head.element){
        return removeFirst();
      }else if(removeNode.element==this.tail.element){
        return removeLast();
      }else{
        removeNode.next.prev = removeNode.prev;
        removeNode.prev.next = removeNode.next;
        size--;
        return (E) removeNode;
      }
    }else{
      System.out.println("Exception null");
      return null;
    }
  }
}
