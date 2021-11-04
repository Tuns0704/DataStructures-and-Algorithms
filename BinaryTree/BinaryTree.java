package BinaryTree;

public class BinaryTree<E> {
  private E key;
  private BinaryTree<E> left;
  private BinaryTree<E> right;

  public E getKey() {
    return key;
  }

  public BinaryTree<E> getLeft() {
    return left;
  }

  public BinaryTree<E> getRight() {
    return right;
  }

  public void setKey(E key) {
    this.key = key;
  }

  public BinaryTree(E key, BinaryTree<E> left, BinaryTree<E> right) {
    this.key = key;
    this.left = left;
    this.right = right;
  }

  private String createPadding(int indent) {
    String out = "";
    for (int i = 0; i < indent; i++) {
      out = out + ".";
    }
    return out;
  }
}