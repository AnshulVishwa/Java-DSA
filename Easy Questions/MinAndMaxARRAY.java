class Simple{  
    public static void main(String args[]){  
        // int arr[] = new int[5];
        int arr[] = { 10 , 120 , 29 , 59 , 8};
        int max = 0;
        int maxIndex = 0;
        int min = 2000000000;
        int minIndex = 0;
        for( int i = 0 ; i < arr.length ; i++ ){
            if(max < arr[i]){
                max = arr[i];
                maxIndex = i;
            }
            if(min > arr[i]){
                min = arr[i];
                min = arr[i];
                minIndex = i;
            }
        }
        System.out.println("The Maximum value in the following array is " + max + " at index " + maxIndex);
        System.out.println("The Minimum value in the following array is " + min + " at index " + minIndex);
    }  
} 