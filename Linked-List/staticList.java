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
public class staticList {
    public static void main(String[] args) {
        // Object of Node || 1st Node named head with value 10
        Node head = new Node(10);
        
        // Object of Node || 2nd Node named Node1 with value 20
        Node Node1 = new Node(20);
        // As we have assigned the value of next to null, we dont have to make head to null ... it is done upward but here the List loooks like this " head -> null " theres Node1 but roaming in the memory we have to place it after head so we connect head's next to Node1... 
        head.next = Node1;
        // now the list is " head -> Node1 -> null "
        
        Node Node2 = new Node(30);
        Node1.next = Node2;
        // now the list is " head -> Node1 -> Node2 -> null "
        
        Node Node3 = new Node(40);
        Node2.next = Node3;
        // now the list is " head -> Node1 -> Node2 -> Node3 -> null "
        
        // Displaying the List
        // taking temporary variable for traversing on each nodes
        Node temp = head;
        // run Loop untill we get null
        while( temp != null ){
            System.out.print(temp.data + " -> ");
            // updating temp to next Node
            temp = temp.next;
        }
        System.out.println("null");
    }
}
