class Main {
  public static void main(String args[]) {
    var ll2 = new ADSLinkedList<Integer>();
    ll2.addFirst(1);
    System.out.println("Linked List");
    System.out.println("---------------");
    System.out.println("Size: " + ll2.size());
    System.out.println("First: " + ll2.getFirst());
    System.out.println("Last: " + ll2.getLast());
  }
}
