public class main {
  public static void main(String[] args) {
    System.out.println("Welcome to ADS course!");
    System.out.println("......................");
    var l1 = new ADSList<Integer>();
    l1.add(0,1);
    l1.add(1,2);
    l1.remove(0);
    System.out.println(l1.size());
  }
}
