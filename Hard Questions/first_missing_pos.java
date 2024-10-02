public class first_missing_pos {
    public static void main(String[] args) {
        int nums[] = {3,4,-1,1};
            int smallest = 1;
            boolean cont = false;
            int i = 0;
            do{
                if(i == nums.length-1) i = 0;
                if( nums[i] == smallest ){
                    smallest++;
                    cont = true;
                }
                i++;
            }
            while(cont == false);
            System.out.println(smallest);
    }
}
