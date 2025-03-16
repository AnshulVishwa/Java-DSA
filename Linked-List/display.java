class Node{
    int data;
    Node next;
    public Node( int data ){
        this.data = data;
        this.next = null;
    }
}
public class display {
    public static void main(String[] args) {
        // Initializing List
        Node head = new Node(10);

        Node Node1 = new Node(20);
        head.next = Node1;
        
        Node Node2 = new Node(30);
        Node1.next = Node2;
        // The List created is head(10) -> 20 -> 30 -> null
        
        // Method to display Each node of List
        DisplayLinkedList(head);
    }
    public static void DisplayLinkedList( Node temp ){
        // Loop will run until we get null 
        while( temp != null ){
            System.out.print(temp.data + " -> ");
            // updating temp
            temp = temp.next;
        }
        System.out.println(" null ");
    }
}
