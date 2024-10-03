public class first_last_occurence {
        public int[] main(String args[]) {
            int[] nums = {1,2,3,3,4,5,6};
            int target = 3;
            int i = 0;
            int pos[] = {-1,-1};
            for( int num : nums ){
                if( num == target ){
                    if( pos[0] < 0 ){
                        pos[0] = i;
                    }
                    pos[1] = i;
                }
                i++;
            }
            return pos;
        }
    }

