public class validArrang {
    public static int[][] validArrangement(int[][] pairs) {
        int arr[][] = new int[pairs.length][pairs[0].length];
        int index1 = 0;
        int index2 = -1;
        for( int i = 0 ; i < pairs.length ; i++ ){
            int first = arr[i][0];
            int last = arr[i][1];
            for( int j = 0 ; j < pairs.length ; j++ ){
                if( i == j ) continue;
                if( pairs[i][j] == first ) arr[index1++][index2++] = ;
            }
        }
        return pairs;
    }
    public static void main(String[] args) {
        int arr[][] = { { 1 , 2 } , { 3 , 4 } , { 2 , 3 } , { 4 , 5 } };
        validArrangement(arr);
    }
}
