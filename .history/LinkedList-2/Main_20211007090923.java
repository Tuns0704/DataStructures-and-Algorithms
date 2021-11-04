class Main {
  public static void main(String[] args) {
    var ll2 = new ADSLinkedList<Integer>();
    System.out.println("Linked List");
    System.out.println("First: "+ ll2.getFirst());
    ll2.removeLast();
    ll2.addFirst(100);
    ll2.addFirst(500);
    ll2.addLast(ll2.removeFirst());
    System.out.println("---------------");
    System.out.println("First: " + ll2.getFirst());
    System.out.println("Last: " + ll2.getLast());
    System.out.println("Size:" + ll2.getSize())
    System.out.println("Is Empty? : " + ll2.isEmpty());
  }
}
