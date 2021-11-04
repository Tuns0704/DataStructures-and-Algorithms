class Main {
    public static void bubbleSort(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
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
        int[] a = { 5, 6, 1, 2, 4, 3, 7, 9, 8 };
        System.out.println("-------------------------------");
        System.out.println("Arrays: " + a);
        System.out.print("Bubble Sort: ");
        bubbleSort(a);
        for(int b:a){
            System.out.print(b + " ");
        }
        System.out.println("");
        System.out.println("-------------------------------");
    }
}