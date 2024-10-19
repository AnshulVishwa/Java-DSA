public class maximum_appearance {
    public static void main(String[] args) {
        int arr[] = { 7 , 9 , 8 , 8 , 8 , 8 };
        int answer = 0;
        int freq = 0;
        for( int num : arr ){
            if( freq == 0 ) answer = num;
            if( num == answer ) freq++;
            else freq--;
        }
        System.out.println(answer);
    }
}
