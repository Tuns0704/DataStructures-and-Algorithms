class Main {
  public static void main(String args[]) {
    var dll1 = new ADSDoublyLinkedList<Integer>();
    dll1.addFirst(10);
    dll1.addFirst(20);
    dll1.addLast(30);
    dll1.addAfter(10, 40);
    dll1.remove(30);
    System.out.println("Doubly Linked List");
    System.out.println("Size:" + dl.size());
    System.out.println("Last: " + dl.getLast());
  }
}
