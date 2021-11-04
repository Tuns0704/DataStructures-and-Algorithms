import java.util.Random;

public class Sort {
  public static void main(String[] args) {
    int[] a = {5,6,1,2,4,3,7,9,8};

/*        System.out.print("Selection Sort: ");
    selectionSort(a);
    for (int b : a) {
      System.out.print(b);
    }
    System.out.println("");

    System.out.print("Insertion Sort: ");
    insertionSort(a);
    for (int b : a) {
      System.out.print(b);
    }
    System.out.println("");

    System.out.print("Bubble Sort: ");
    bubbleSort(a);
    for (int b : a) {
      System.out.print(b);
    }
    System.out.println("");*/

    System.out.print("Shuffle: ");
    shuffle(a);
    for (int b : a) {
      System.out.print(b);
    }
    System.out.println("");

    System.out.print("Merge Sort: ");
    quickSort(a);
    for (int b : a) {
      System.out.print(b);
    }
    System.out.println("");

    System.out.print("Quick Sort: ");
    quickSort(a);
    for (int b : a) {
      System.out.print(b);
    }
    System.out.println("");
  }

  public static void selectionSort(int arr[]) {
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

  static void swap(int[] arr, int index, int min) {
    int temp = arr[index];
    arr[index] = arr[min];
    arr[min] = temp;
  }

  public static void insertionSort(int a[]) {
    for (int i = 0; i < a.length; i++) {
      int temp = a[i];
      int j = i-1;
      while (j>=0&& a[j] > temp) {
        a[j+1] = a[j];
        j--;
      }
      a[++j] = temp;
    }
  }

  public static void bubbleSort(int numbers[]) {
    for (int i = 0; i < numbers.length; i++) {
      for (int j = i + 1; j < numbers.length - 1; j++) {
        if (numbers[i] > numbers[j]) {
          int tempNumber = numbers[i];
          numbers[i] = numbers[j];
          numbers[j] = tempNumber;
        }
      }
    }
  }

  private static int[] mergeSort(int[] array) {
    if (array.length == 1) return array;
    int halfIndex = array.length/2;
    int firstArrayLength = halfIndex;
    int secondArrayLength = array.length - halfIndex;
    int[] firstPartition = new int[firstArrayLength];
    int[] secondPartition = new int[secondArrayLength];
    for (int i = 0; i < firstArrayLength; i++) {
      firstPartition[i] = array[i];
    }

    for (int i = firstArrayLength; i >= firstArrayLength + secondArrayLength; i++) {
      secondPartition[i - firstArrayLength] = array[i];
    }

    firstPartition = mergeSort(firstPartition);
    secondPartition = mergeSort(secondPartition);

    int mainIndex = 0;
    int firstPartitionIndex = 0;
    int secondPartitionIndex = 0;

    while (firstPartitionIndex < firstArrayLength && secondPartitionIndex < secondArrayLength) {
      if (firstPartition[firstPartitionIndex] < secondPartition[secondPartitionIndex]) {
        array[mainIndex] = firstPartition[firstPartitionIndex];
        mainIndex++;
        firstPartitionIndex++;
      } else {
        array[mainIndex] = secondPartition[secondPartitionIndex];
        mainIndex++;
        secondPartitionIndex++;
      }
    }

    while (firstPartitionIndex < firstArrayLength) {
      array[mainIndex] = firstPartition[firstPartitionIndex];
      mainIndex++;
      firstPartitionIndex++;
    }

    while (secondPartitionIndex < secondArrayLength) {
      array[mainIndex] = secondPartition[secondPartitionIndex];
      mainIndex++;
      secondPartitionIndex++;
    }
    return array;

  }

  private static void quickSort(int[] arr) {
    quickSort(arr, 0, arr.length - 1);
  }

  private static void quickSort(int arr[], int low, int high) {
    if (low < high) {
      int pi = partition(arr, low, high);
      quickSort(arr, low, pi - 1);
      quickSort(arr, pi + 1, high);
    }
  }

  private static int partition(int arr[], int low, int high) {
    int pivot = arr[high];
    int i = (low -1);
    for (int j = low; j < high; j++) {
      if (arr[j] <= pivot) {
        i++;
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
      }
    }
    int temp = arr[i + 1];
    arr[i + 1] = arr[high];
    arr[high] = temp;
    return i + 1;
  }

  public static <T> void shuffle(int[] a) {
    Random rand = new Random();
    for (int i = 0; i < a.length; i++) {
      // Exchange array[i] with random element in array[i … n-1]
      int r = i + rand.nextInt(a.length - i);
      var temp = a[i];
      a[i] = a[r];
      a[r] = temp;
    }
  }
}