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
}
// Main Class
public class creation{
    public static void main(String[] args) {
        // Creating a Linked List
        LinkedList list = new LinkedList();
    }
}