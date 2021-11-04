import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Tree<E> {
  private E key;
  private Tree<E> parent;
  private List<Tree<E>> children;
  public Tree(E key, Tree<E>... children) {
    this.key = key;
    this.children = new ArrayList<>();
    for (Tree<E> child : children) {
      this.children.add(child);
      child.parent = this;
    }
  }
  public Tree(ArrayList children) {
    this.children = children;
  }
  public Tree(E key, ArrayList children, Tree<E> parent) {
    this.key = key;
    this.children = children;
    this.parent = parent;
  }
  public List<E> orderDfs() {
    List<E> order = new ArrayList<>();
    this.dfs(this, order);
    return order;
  }
  private void dfs(Tree<E> tree, List<E> order) {
    for (Tree<E> child : tree.children) {
      this.dfs(child, order);
    }
    order.add(tree.key);
  }
  public List<E> orderBfs() {
    List<E> result = new ArrayList<>();
    Deque<Tree<E>> queue = new ArrayDeque<>();
    queue.offer(this);
    while (queue.size() > 0) {
      Tree<E> current = queue.poll();
      result.add(current.key);
      for (Tree<E> child : current.children)
      queue.offer(child);
    }
    return result;
  }
}