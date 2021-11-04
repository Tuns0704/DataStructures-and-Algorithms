public class BinarySearch {
  public static int getIndex(int[] arr, int key) {
    int start = 0;
    int end = arr.length - 1;
    while (start <= end) {
      int mid = start + (end - start)/2;
      if(key < arr[mid])
    }
    return -1;
  }
}
