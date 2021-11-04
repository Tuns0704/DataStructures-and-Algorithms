class main {
  public static void selectionSort(int[] arr) {
    for (int index = 0; index < arr.length; index++) {
      int min = index;
      for (int curr = index + 1; curr < arr.length; curr++) {
        if (arr[curr] < arr[min]) {
          min = curr;
        }
      }
      swap(arr, index, min);
    }
  }

  private static void swap(int[] arr, int index, int min) {
    int temp = arr[index];
    arr[index] = arr[min];
    arr[min] = temp;
  }

  public static void Main(String[] args) {
    int[] ={5,6,1,2,4,3,7,9,8};
    System.out.println("Selection Sort: ");
    selectionSort(a);

    for
  }
}