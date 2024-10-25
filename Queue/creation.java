public class creation {
    static class Queue{
        int length = 0;
        int arr[];
        int front , rear;

        Queue( int length ){
            this.length = length;
            arr = new int[length];
            front = rear = -1;
        }

        void insert( int value ){
            rear++;
            if( rear == length ) {
                System.out.println("Queue Overflow");
                return;
            }
            arr[rear] = value;
        }
        void remove(){
            if( rear == -1 ) {
                System.out.println("Queue Underflow");
                return;
            }
            for( int i = 0 ; i <= rear ; i++ ){
                arr[i] = arr[i+1];
            }
            front = 0;
            rear--;
        }
        void display(){
            if( rear == -1 ) {
                System.out.println("Queue is empty");
                return;
            }
            for( int i = 0 ; i <= rear ; i++ ){
                System.out.print(arr[i] + "\t");
            }
        }
    }
    public static void main(String[] args) {
        Queue queue = new Queue(5);
        queue.insert(10);
        queue.insert(20);
        queue.insert(30);
        queue.remove();
        queue.insert(10);
        queue.insert(40);
        queue.insert(50);
        queue.insert(60);
        queue.display();
    }
}
