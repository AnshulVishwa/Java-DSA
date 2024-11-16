class Node{
    int data;
    Node next;
    Node( int data ){
        this.data = data;
        this.next = null;
    }
}
class LinkedList{
    Node head;
    LinkedList(){
        head = null;
    }
    void insert( int data ){
        Node newNode = new Node( data );
        if( head == null ){
            head = newNode;
        } 
        else{
            Node temp = head;
            while( temp.next != null ){
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }
    void mergeSorted( LinkedList list1 , LinkedList list2 , LinkedList result ){
        Node pointer1 = list1.head;
        Node pointer2 = list2.head;

        while( pointer1 != null && pointer2 != null ){
            if( pointer1.data < pointer2.data ) {
                result.insert(pointer1.data);
                pointer1 = pointer1.next;
            }
            else{
                result.insert(pointer2.data);
                pointer2 = pointer2.next;
            }
        }
        
        while ( pointer1 != null ) {
            result.insert( pointer1.data );
            pointer1 = pointer1.next;
        }
        while ( pointer2 != null ) {
            result.insert( pointer2.data );
            pointer2 = pointer2.next;
        }
    }
    void display(){
        Node temp = head;
            while( temp != null ){
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("null");
    }
}
public class merge_two_sorted {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        LinkedList list2 = new LinkedList();
        LinkedList merge = new LinkedList();

        list.insert(10);
        list.insert(30);
        list.insert(50);
        list.insert(70);

        list2.insert(20);
        list2.insert(40);
        list2.insert(60);
        list2.insert(80);

        list.mergeSorted(list, list2, merge);

        merge.display();
    }
}
