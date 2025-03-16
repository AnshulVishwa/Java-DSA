public class Heap_Sort {
    public static void heapify(int arr[], int n, int root) {
        int largest = root;
        int left = 2 * root + 1;
        int right = 2 * root + 2;

        if( left < n && right < n  ){
            System.out.println("\nroot : " + arr[root] + "\t Left : " + arr[left] + "\t right : " + arr[right]);
        }


        if (left < n && arr[left] > arr[largest]) {
            System.out.println("\nIn my subtree left is greater than root");
            largest = left;
        }
        if (right < n && arr[right] > arr[largest]) {
            System.out.println("\nIn my subtree right is greater than root");
            largest = right;
        }
        if (largest != root) {
            int temp = arr[largest];
            arr[largest] = arr[root];
            arr[root] = temp;
            System.out.println("\nChanging root with the highest");
            printArr(arr);
            heapify(arr, n, largest);
        }
    }

    public static void HeapSort(int arr[]) {
        int n = arr.length;

        // Build max heap
        for (int i = (n / 2) - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        System.out.println("\nI am max heap");
        printArr(arr);

        // Extract elements from heap
        for (int i = n - 1; i > 0; i--) {
            System.out.println("\nArray with max heap");
            printArr(arr);
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            System.out.println("\nChanging the last element of heap with first");
            printArr(arr);

            heapify(arr, i, 0);
            System.out.println("\nheapifying again");
        }
    }

    public static void printArr( int []arr ){
        for (int num : arr) {
            System.out.print(num + "\t");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 1, 8, 7, 9, 3 };
        System.out.println("I am the array");
        printArr(arr);
        HeapSort(arr);
        System.out.println("I am the final array");
        printArr(arr);
    }
}
