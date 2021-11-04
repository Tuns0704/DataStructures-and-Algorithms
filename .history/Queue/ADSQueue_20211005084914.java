public class ADSQueue<E> implements Queue<E> {
  private Node<E> head;
  private int size;
  private static class Node<E> {
    private E element;
    private Node<E> next;
    public Node(E value){
      this.element = value;
    }
  }
  public void Queue() {}
    public void offer(E element) {
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
    public E poll() {
      ensureNonEmpty();
      E element = this.head.element;
      if(this.size ==1){
        this.head = null;
      }else{
        Node<E> next = this.head.next;
        his.head = null;
        his.head = next;
      }
      this.size--;
      return element;
      }
    private void ensureNonEmpty(){
        if(this.size<1){
          throw new IllegalStateException("Queue Empty!!");
        }
      }
      @Override
      public E peek() {
        ensureNonEmpty();
        return this.head.element;
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