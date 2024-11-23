class Node{
    int data;
    Node next;
    Node( int val ){
        data = val;
        next = null;
    }
}
public class reverse {
    public static Node reverseList(Node temp) {
        Node prev = null;
        Node current = temp;
        Node next = null;
        while( current != null ){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);

        head = reverseList(head);

        while (head != null ) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }
}
