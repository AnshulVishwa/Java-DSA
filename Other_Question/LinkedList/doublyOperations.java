class Node{
    Node prev;
    int data;
    Node next;
    Node( int val ){
        prev = null;
        data = val;
        next = null;
    }
} 
class LinkedList{
    Node head;
    LinkedList() {head = null;}
    void insert( int data , int where){
        Node newNode = new Node(data);
        if( head == null) head = newNode;
        else{
            Node temp = head;
            while( temp.data != where ) temp = temp.next;
            newNode.next = temp.next;
            newNode.prev = temp;
            if (temp.next != null) {
                temp.next.prev = newNode;
            }
            temp.next = newNode;
        }
    }
    void delete( int var , Node temp ){
        if( temp.next == null && temp.prev == null ) {
            head = null;
            return;
        }
        while( temp.data != var ){
            if( temp.next == null ){
                System.out.println("No value found");
                return;
            }
            temp = temp.next;
        }
        if( temp.next == null ) {
            temp.prev.next = null;
        }
        else{
            temp.prev.next = temp.next;
            temp = null;
        }
    }
    void display( Node temp ){
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
public class doublyOperations {
        public static void main(String[] args) {
            LinkedList list = new LinkedList();
            list.insert(10,0);
            list.insert(20,10);
            list.insert(30,20);
            list.delete(20,list.head);
            list.display(list.head);
        }
    }


    