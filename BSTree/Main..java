import java.util.List;
class Main{
  public static void main(String args[]) {
    BSTree<Interger> bst = new BSTree<Interger>(50);
    bst.insert(20);
    bst.insert(40);
    bst.insert(60);
    bst.insert(80);
    bst.insert(0);
    bst.insert(100);
    System.out.println("Contains 100? " + bst.contains(100));
    System.out.println("Contains 30? " + bst.contains(30));
  }
}
