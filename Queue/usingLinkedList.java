class Node{
    int data;
    Node next;
    Node( int val ){
        data = val;
        next = null;
    }
}
class Queue{
    Node front , rear;
    Queue(){
        front = rear = null;
    }
    void enqueue( int data ){
        Node newNode = new Node(data);
        if( rear == null ) {
            rear = newNode;
            front = newNode;
        }
        else{
            rear.next = newNode;
            rear = newNode;
        } 
    }
    void dequeue(){
        Node temp = front.next;
        front.next = null;
        front = temp;
    }
    void display(){
        Node temp = front;
        System.out.print("\n | ");
        while( temp != null ){
            System.out.print(temp.data + " | ");
            temp = temp.next;
        }
    }

}
public class usingLinkedList{
    public static void main(String[] args) {
        Queue line = new Queue();
        line.enqueue(10);
        line.enqueue(20);
        line.enqueue(30);
        line.dequeue();
        line.display();
    }
}