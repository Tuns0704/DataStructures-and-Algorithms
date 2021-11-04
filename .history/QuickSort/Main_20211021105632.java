class Main {
    public static void insertionSort(int a[]) {

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