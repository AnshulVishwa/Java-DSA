class Node{
    int data;
    Node next;
    Node( int value ){
        this.data = value;
        this.next = null;
    }
}
class LinkedList{
    static Node head;
    LinkedList(){
        head = null;
    }
    public static void insert_first( int value ){
        Node newNode = new Node(value);
        if( head == null ){
            head = newNode;
        }
        else{
            newNode.next = head;
            head = newNode;
        }
    }
    public static void display(){
        Node temp = head;
        while ( temp != null ) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null ");
    }
}
public class insertFirst {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert_first(10);
        list.insert_first(20);
        list.insert_first(30);
        list.insert_first(40);
        list.display();
    }
}
