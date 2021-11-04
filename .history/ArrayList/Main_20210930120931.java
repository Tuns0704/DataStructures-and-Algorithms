class Main {
  public static void main(String[] args) {
    System.out.println("Welcome to ADS course!");
    System.out.println("......................");
    var l1 = new ADSList<Integer>();
    l1.add(0,2);
    l1.add(1,4);
    l1.add(2,8);
    l1.add(3,16);
    l1.add(2,32);
    l1.remove(0);
    System.out.println("ArraysList");
    System.out.println("Size:"+l1.size());
    System.out.println("Index of 32: "+l1.indexOf(32));
    System.out.println("Contains 16: "+l1.contains(16));
    System.out.println("......................");
  }
}
