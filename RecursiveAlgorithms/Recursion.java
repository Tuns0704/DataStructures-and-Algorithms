public class Recursion{
  public static void main(String args[]){
    System.out.println("Recursion");
    int[] array1 = {1,2,3,4};
    int[] array2 = {-1,0,1};
    System.out.println("Sum of array1 = "+sum(array1,0));
    System.out.println("Sum of array2 = "+sum(array2,0));
    System.out.println("Factorial of 10 = "+factorial(10));
    printFigure(5);
    int[] vector = {0,0,0,0,0,0,0,0};
    generateVector(0, vector);
    System.out.println("Fibonacci "+getFibonacci(8));
  }

  static int sum(int[] array, int index) {
    if (index == array.length - 1) {
      return array[index];
    }
    return array[index] + sum(array, index + 1);
  }

  static long factorial(int num) {
    if (num == 0) {
      return 1;
    }
    return num * factorial(num - 1);
  }

  static void printFigure(int n) {
    if (n > 1) {
      printLineofChars('*',n);
      printFigure(n-1);
      printLineofChars('#',n);
    }
  }

  static void printLineofChars(char c, int n) {
    for (int i = n; i > 0; i--) {
      System.out.print(c);
    }
    System.out.println();
  }

  static void generateVector(int index, int[] vector) {
    if (index >= vector.length) {
      printVector(vector);
    } else {
      for (int i = 0; i <= 1; i++) {
        vector[index] = i;
        generateVector(index + 1, vector);
      }
    }
  }

  static void printVector(int[] vector) {
    for (int i = 0; i < vector.length; i++) {
      System.out.print(vector[i]);
    }
    System.out.println();
  }

  static int getFibonacci(int n) {
    if (n==0) return 1;
    if (n==1) return 1;
    return getFibonacci(n-1) + getFibonacci(n-2);
  }
}