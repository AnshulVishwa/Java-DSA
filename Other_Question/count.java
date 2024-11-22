class Node{
    int data;
    Node next;
    Node( int value ){
        this.data = value;
        this.next = null;
    }
}
class Circular_LL{
    Node head;
    Circular_LL(){
        head = null;
    }
    // fpr displaying the whole list
    void display( Node temp ) {
        if (temp == null) {
            System.out.println("List is empty");
            return;
        }
        
        // ** here loop stops at Null
        // printing the loop values
        Node stop = temp;
        int count = 0;
        do{
            System.out.print(temp.data + " -> ");
            count++;
            temp = temp.next;
        }
        //here while temp is not equal to head
        while( temp != stop );
        //if it is equal to the show back to head
        System.out.print("back to head ");
        System.out.println("\n" + "No. of count :- " + count);
    }
}

public class count {
    public static void main(String[] args) {
        Circular_LL newList = new Circular_LL();

        Node head = new Node(0);
        Node node1 = new Node(1);
        head.next = node1;
        Node node2 = new Node(2);
        node1.next = node2;
        Node node3 = new Node(3);
        node2.next = node3;
        Node node4 = new Node(4);
        node3.next = node4;
        node4.next = head;

        newList.display(head);
    }
}
