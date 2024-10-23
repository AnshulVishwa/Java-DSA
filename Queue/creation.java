public class creation {
    public static void main(String[] args) {
        int arr[] = new int[10];
        int front , rear = front = -1;
        
        rear = insert( 10 , rear , arr );
        rear = insert( 20 , rear , arr );
        rear = insert( 30 , rear , arr );
        rear = insert( 40 , rear , arr );

        front = delete(front);
        
        for( int i = front+1 ; i <= rear ; i++ ) System.out.print(arr[i] + "\t");
    }
    public static int insert( int val , int rear , int arr[] ){
        rear++;
        arr[rear] = val;
        return rear;
    }
    public static int delete( int front ){
        return ++front;
    }
}
