class Main {
  int N;
  int x, y;
  ArrayList<Student> listS = new ArrayList<Student>();
  Scanner sr = new Scanner(System.in);
  ArrayList<String> nameS = new ArrayList<String>();

  void Input() {
    String id = "", name = "", email = "", sex = "";
    int age = 0;
    for (int i = 0; i < N; i++) {
      System.out.printf("\nEnter Student %d\n", i + 1);
      System.out.print("Enter ID: ");
      id = sc.nextLine();
      System.out.print("Enter Name: ");
      name = sc.nextLine();
      System.out.print("Enter Email: ");
      email = sc.nextLine();
      System.out.print("Enter Sex: ");
      sex = sc.nextLine();
      System.out.print("Enter Age: ");
      age = sc.nextInt();
      sc.nextLine();
    }
  }
  public static void main(String[] args) {
    System.out.println("Hello");
  }
}
