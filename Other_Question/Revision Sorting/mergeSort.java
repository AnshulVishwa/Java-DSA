public class MergeSort {
    public static void divide(int arr[], int left, int right) {
        // Base Condition
        if (left >= right) return;
        // calculate mid
        int mid = left + (right - left) / 2;
        // Divide the array into 2 parts from mid
        divide(arr, left, mid);
        divide(arr, mid + 1, right);
        // sort both the arrays
        sort(arr, left, mid, right);
    }

    public static void sort(int arr[], int low, int mid, int high) {
        // arr[] = { 1 , 2 , 3 , 4 , 5 , 6 } pointer1 points to 1, pointer2 points to 4
        int pointer1 = low;
        int pointer2 = mid + 1;
        // arrays are {1 , 2 , 3} and {4 , 5 , 6}
        // to store the calculated values
        int merged[] = new int[high - low + 1];
        // pointer for merged arr
        int index = 0;

        // Merge elements from both half
        while (pointer1 <= mid && pointer2 <= high) {
            if (arr[pointer1] <= arr[pointer2]) {
                merged[index++] = arr[pointer1++];
            } else {
                merged[index++] = arr[pointer2++];
            }
        }

        // Copy remaining elements from the left half
        while (pointer1 <= mid) {
            merged[index++] = arr[pointer1++];
        }

        // Copy remaining elements from the right half
        while (pointer2 <= high) {
            merged[index++] = arr[pointer2++];
        }

        // Copy merged elements back into the original array
        for (int i = 0, j = low; i < merged.length; i++, j++) {
            arr[j] = merged[i];
        }
    }

    public static void display(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {38, 13, 90, 96, 33, 69, 25, 98, 11, 23, 53, 10};
        divide(arr, 0, arr.length - 1);
        display(arr);
    }
}
