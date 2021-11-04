class Main {
    private static void quickSort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    private static void quickSort(int arr[], int low, int high) {
        if (low < high) {
            int po
        }
    }
    public static void main(String[] args) {
        int[] a = { 5, 6, 1, 2, 4, 3, 7, 9, 8 };
        System.out.println("--------------------------------------------------");
        System.out.print("Quick Sort: ");
        quickSort(a);
        for(int b:a){
            System.out.print(b + " ");
        }
        System.out.println("");
        System.out.println("--------------------------------------------------");
    }
}