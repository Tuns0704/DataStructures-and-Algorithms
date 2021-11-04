private static void quickSort(int[] a){
        quickSort(a, 0, a.length - 1);
    }
    private static int partition(int a[], int low,int high){
        int pivot = a[high];
        int i = (low - 1);
        for (int j = low; j < high; j++){
            if (a[j] <= pivot){
                i++;

                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }

        int temp = a[i + 1];
        a[i + 1] = a[high];
        a[high] = temp;

        return i + 1;
    }
    private static void quickSort(int a[],int low, int high){
        if (low < high){
            int pi = partition(a,low,high);
            quickSort(a,low, pi - 1);
            quickSort(a, pi + 1, high);
        }
    }
    public static void main(String[] args) {
        int[] a = {5,6,1,2,4,3,7,9,8};
        System.out.print("Quick Sort: ");
        quickSort(a);
        for (int b : a){
            System.out.print(b + " ");
        }
        System.out.println(" ");
    }