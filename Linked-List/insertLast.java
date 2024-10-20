// Creating a node which consist of data and ref. of next node
class Node{
    int data;
    Node next;
    // Constructor of Node which includes data.
    public Node( int data ){
        // Initializing data with the value.
        this.data = data;
        // Initializing next with the null cuz Node.next -> null.
        this.next = null;
    }
}
// Linked List class which connects all the NODES
class LinkedList{
    // head node Starting point
    Node head;
    // Constructor for initializing head to the null when the list is created.
    public LinkedList () {
        head = null;
    }
    // method for inserting node at last 
    void insert( int data ){
        // Creating a new Node
        Node newNode = new Node(data);
        // if the node is empty i.e. head == null,
        if( head == null ){
            // then point the head to newNode
            head = newNode;
        }
        // if the node is not empty and head points towards another node then
        // we make sure to add the new node to last node.
        else{
            // temporary variable starts with head;
            Node temp = head;
            // loop will stop when it will get last node.
            while ( temp.next != null ) {
                // temp will point to another node untill the last node.
                temp = temp.next;
            }
            // Now temp contains the last Node
            // So we point temp's next to new Node
            temp.next = newNode;
        }
    }
}
// MAIN CLASS
public class insertLast {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(10);
        list.insert(20);
        list.display();
    }
}