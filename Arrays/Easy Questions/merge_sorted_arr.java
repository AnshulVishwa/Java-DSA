public class merge_sorted_arr {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if( nums2.length == 0 ) return;
        if( m == 0 && n == 1 ) {
            nums1[m] = nums2[0];
            return;
        }
        if( m == 0 && n > 1 ){
            int ko = 0;
            while ( ko < nums2.length ) {
                nums1[m++] = nums2[ko++];
            }
            return;
        }
        int index1 = m-1;
        int index2 = n-1;
        while ( index2 >= 0 ) {
                if( nums2[index2] < nums1[index1] ){
                    int swap = nums1[index1];
                    nums1[index1] = nums2[index2];
                    nums2[index2] = swap;

                    int temp = index1;
                    while ( temp-1 >= 0 ) {
                        if( nums1[temp] < nums1[temp-1] ){
                            int temp2 = nums1[temp];
                            nums1[temp] = nums1[temp-1];
                            nums1[temp-1] = temp2;
                        }
                        else temp--;
                    }
                }
                else index2--;
        }
        int ko = 0;
        while ( ko < nums2.length ) {
            nums1[m++] = nums2[ko++];
        }
        for( int i = 0 ; i < nums1.length ; i++ ) System.out.print(nums1[i] + "\t");
            System.out.println();
        for( int i = 0 ; i < nums2.length ; i++ ) System.out.print(nums2[i] + "\t");
    }
    public static void main(String[] args) {
        int arr[] = { 2 , 0 };
        int arr2[] = {5};
        
        merge(arr, 1, arr2, 1);
    }
}
