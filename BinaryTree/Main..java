package BinaryTree;

class Main{
  public static void main(String args[]){
    Tree<String> t1 = new Tree<>("Geoge",
                      new Tree("Elizabeth",
                        new Tree("Charles",
                          new Tree("William"),
                            new Tree<>("George")),
                          new Tree<>("Harry")),
                        new Tree<>("Andrew"),
                        new Tree<>("Anne"),
                        new Tree<>("Adward"),
                      new Tree<>("Marger"));
    List<String> l2 = t1.orderDfs();

    System.out.println("DFS: " + l2.size());
    for(String l : l2){
      System.out.print(l + " ");
    }
    System.out.println();
  }
}
