import java.io.PrintStream;

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
    System.out.printf("%-10s|%-22s|%-30s|%-7s|%-12s\n", "ID", "Name", "Email", "Sex", "Age");
    for (int i = 0; i < listS.size(); i++) {
      Student S1 = listS.get(i);
      System.out.println("%-10s|%-20s|%-30s|%-7s|%d", S1.ID, S1.Name, S1.Email, S1.Sex, S1.Age);
    }
  }

  void findStudentThanAge20() {
    int check = 0;
    System.out.println("List Student has age>20");
    System.out.println("#-----------------------Student List-----------------------#");
    System.out.printf("%-10s|%-22s|%-30s|%-7s|%-12s\n", "ID", "Name", "Email", "Sex", "Age");
    for (int i = 0; i < listS.size(); i++) {
      Student S1 = listS.get(i);
      if (S1.Age > 20) {
        check = 1;
        System.out.printf("%-10s|%-22s|%-30s|%-7s|%-12s\n", "ID", "Name", "Email", "Sex", "Age");
      }
    }
    if (check == 0) {
      System.out.println("All Student have age <=20");
    }
  }

  void deleteStudent() {
    System.out.print("Enter Name to delete: ");
    String nameDelete = sc.nextLine();
    int check = 0;
    for (int i = 0; i < listS.size(); i++) {
      Student S1 = listS.get(i);
      if (S1.Name.equals(nameDelete)) {
        check = 1;
        listS.remove(listS.indexOf(S1.Name));
        System.out.printf("\nDelete Successful");
      }
    }
    if (check == 0) {
      System.out.printf("Not Found this Student");
    }
  }

  void insertStudent() {
    System.out.print("Enter position y: ");
    int y = sc.nextLine();
    sc.nextLine();
    String id = "", name = "", email = "", sex = "";
    System.out.println("Enter Information of Student: ");
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
    listS.add(y, S1);
    Output();
  }

  void findStudent() {
    System.out.printf("Enter Name or ID to find Student: ");
    String s = sc.nextLine();
    int check = 0;
    for (int i = 0; i < listS.size(); i++) {
      Student S1 = listS.get(i);
      if (S1.Name.equals(s) || S1.ID.equals(s)) {
        check = 1;
        System.out.printf("%-10s|%-22s|%-30s|%-7s|%-12s\n", "ID", "Name", "Email", "Sex", "Age");
        System.out.println("%-10s|%-20s|%-30s|%-7s|%d", S1.ID, S1.Name, S1.Email, S1.Sex, S1.Age);
      }
    }
    if (check == 0) {
      System.out.printf("Not Found this Student");
    }
  }

  public static void main(String[] args) {
    Assignment A = new Assignment();
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number N= ");
    A.N = sc.nextInt();
    A.Input();
    A.Output();

    A.findStudentThanAge20();
    A.findStudent();
    A.deleteStudent();
    A.insertStudent();
  }
}
