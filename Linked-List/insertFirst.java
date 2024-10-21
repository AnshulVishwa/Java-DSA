class Node{
    int data;
    Node next;
    public Node( int data ){
        this.data = data;
        this.next = null;
    }
}
class LinkedList{
    Node head;
    LinkedList(){
        head = null ;
    }
    void insertFirst( int data ){
        Node newNode = new Node(data);
        if( head == null ){
            head = newNode;
        }
        else{
            Node temp = head.next;
            head = temp;
        }
    }
}
public class insertFirst {
    public static void main(String[] args) {
        
    }
}