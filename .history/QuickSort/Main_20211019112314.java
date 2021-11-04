class Main {
    public static void insertionSort(int a[]) {
        for (int i = 1; i < a.length; i++) {
            int temp = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > temp) {
                a[j + 1] = a[j];
                j--;
            }
            a[++j] = temp;
        }
    }

    public static void main(String[] args) {
        int[] a = { 12, 9, 16, 21,6, 34, 42, 55, 18, 9 };
        System.out.println("--------------------------------------------------");
        System.out.print("Insertion Sort: ");
        insertionSort(a);
        for(int b:a){
            System.out.print(b + " ");
        }
        System.out.println("");
        System.out.println("--------------------------------------------------");
    }
}