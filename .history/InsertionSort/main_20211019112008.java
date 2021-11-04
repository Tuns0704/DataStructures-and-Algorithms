class Main {
    public static void insertionSort(int a[]) {
        for (int i = 1; i < numbers.length; i++) {
            for (int j = i + 1; j <= numbers.length - 1; j++) {
                if (numbers[i] > numbers[j]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] a = { 12, 9, 16, 21,6, 34, 42, 55, 18, 9 };
        System.out.println("-------------------------------");
        System.out.print("Insertion Sort: ");
        insertionSort(a);
        for(int b:a){
            System.out.print(b + " ");
        }
        System.out.println("");
        System.out.println("-------------------------------");
    }
}