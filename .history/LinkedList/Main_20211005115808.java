class Main {
  public static void main(String args[]) {
    var ll1 = new ADSLinkedList<Integer>();
    ll1.addFirst(1);
    ll1.addFirst(3);
    ll1.addFirst(5);
    ll1.addLast(7);
    ll1.addLast(9);
    ll1.removeFirst();
    ll1.removeLast();
    System.out.println("Linked List");
    ll1.addFirst(1);
    System.out.println("Size: " + ll1.size());
    System.out.println("First: " + ll1.getFirst());
    System.out.println("Last: " + ll1.getLast());
    System.out.println("");
  }
}
