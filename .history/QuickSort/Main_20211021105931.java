class Main {
    public static void quickSort(int a[]) {

    }

    public static void main(String[] args) {
        int[] a = { 5, 6, 1, 2, 4, 3, 7, 9, 8 };
        System.out.println("--------------------------------------------------");
        System.out.print("Quick Sort: ");
        insertionSort(a);
        for(int b:a){
            System.out.print(b + " ");
        }
        System.out.println("");
        System.out.println("--------------------------------------------------");
    }
}