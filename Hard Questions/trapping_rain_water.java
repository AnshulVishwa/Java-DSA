public class trapping_rain_water {
    // Finds the next bar that is taller or equal to arr[start]
    public static int findMax(int start, int arr[]) {
        int i = start + 1;
        while (i < arr.length && arr[i] <= arr[start]) {
            i++;
        }
        return i == arr.length ? start : i; // If no higher bar found, return current start
    }

    // Calculates water trapped between min and max indices
    public static int calculate(int min, int max, int arr[]) {
        int total = 0;
        int minHeight = Math.min(arr[min], arr[max]); // Use the minimum height between two bars
        for (int i = min + 1; i < max; i++) {
            total += minHeight - arr[i]; // Calculate trapped water for each position
        }
        return total;
    }

    public static void main(String[] args) {
        int arr[] = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int max = findMax(i, arr);
                if (max > i) { // Check that a valid max is found
                    total += calculate(i, max, arr);
                    i = max - 1; // Move i to the last processed position
                }
            }
        }
        System.out.println("Total trapped rainwater: " + (total+1));
    }
}
