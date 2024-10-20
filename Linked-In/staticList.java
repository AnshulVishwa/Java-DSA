class Node{
    int data;
    Node next;
    public Node( int data ){
        this.data = data;
        this.next = null;
    }
}
public class staticList {
    public static void main(String[] args) {
        Node head = new Node(10);

        Node Node1 = new Node(20);
        head.next = Node1;
        
        Node Node2 = new Node(30);
        Node1.next = Node2;

        Node Node3 = new Node(40);
        Node2.next = Node3;
        
        Node temp = head;
        while( temp != null ){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
