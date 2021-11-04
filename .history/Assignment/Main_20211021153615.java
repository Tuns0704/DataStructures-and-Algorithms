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
      Student S1 = new Student(id, name, email, sex, age);
      listS.add(S1);
    }
  }

  void Output() {
    System.out.println("#-----------------------Student List-----------------------#");
    System.out.println("%-10s|%-22s|%-30s|%-7s|%-12s\n", "ID", "Name", "Email", "Sex", "Age");
    for (int i = 0; i < listS.size(); i++) {
      Student S1 = listS.get(i);
      System.out.println("%-10s|%-20s|%-30s|%-7s|%d\n", S1.ID, S1.Name, S1.Email, S1.Sex, S1.Age);
    }
  }

  void findStudent() {
    int check = 0;
  }
  public static void main(String[] args) {
    System.out.println("Hello");
  }
}
