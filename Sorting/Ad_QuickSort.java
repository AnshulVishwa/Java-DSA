public class Ad_QuickSort {
    public int[] sort_by_quick(int arr[], int upper, int lower) {
        if (lower >= upper) return arr;
        int pivot = partition(arr, upper, lower);
        sort_by_quick(arr, pivot - 1, lower);
        sort_by_quick(arr, upper, pivot + 1);
        return arr;
        }
        
        public int partition(int[] arr, int high, int low) {
            Random rand = new Random();
            int randomIndex = low + rand.nextInt(high - low + 1);
            swap(arr, randomIndex, high);
    
            int pi = arr[high];
            int index = low;
            for (int i = low; i < high; i++) {
                if (arr[i] <= pi) {
                    swap(arr, i, index);
                    index++;
                }
            }
            swap(arr, index, high); 
            return index;
        }
        
        private void swap(int[] arr, int i, int j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        public int firstMissingPositive(int[] nums) {
            int n = nums.length;
             for (int i = 0; i < n; i++) {
                while (nums[i] > 0 && nums[i] <= n && nums[nums[i] - 1] != nums[i]) {
                    int temp = nums[nums[i] - 1];
                    nums[nums[i] - 1] = nums[i];
                    nums[i] = temp;
                }
            }
            int smallest = 1;
            for( int i = 0 ; i < nums.length ; i++ ){
                if( nums[i] < 0 ) continue;
                if( nums[i] == smallest ) smallest++;
            }
            return smallest;
        }
    }
}
