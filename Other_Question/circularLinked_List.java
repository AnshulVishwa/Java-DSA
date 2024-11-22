class Node{
    int data;
    Node next;
    Node( int val ){
        this.data = val;
        this.next = null;
    }
}
class Circular_linkedList{
    Node head;
    Circular_linkedList(){
        head = null;
    }
    void insert( int data ){
        Node newnode = new Node(data);
        if( head == null ){
            head = newnode;
            newnode.next = head;
        }
        else{
            Node temp = head;
            while( temp.next != head ){
                temp = temp.next;
            }
            temp.next = newnode;
            newnode.next = head;
        }
    }
    void deleteFirst(){
        Node temp = head;
        while( temp.next != head ){
            temp = temp.next;
        }
        temp.next = head.next;
        head = temp.next;
    }
    void deleteLast(){
        Node temp = head;
        while( temp.next.next != head ){
            temp = temp.next;
        }
        temp.next = head;
        // head = temp.next;
    }
    void display(){
        if(head == null){
            System.out.println("list is empty");
        }
        Node temp = head;
        do{
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        while( temp != head );
        System.out.println("back to head");
    }
}

public class circularLinked_List {
    public static void main(String[] args) {
        Circular_linkedList newList = new Circular_linkedList();
        newList.insert(0);
        newList.insert(1);
        newList.insert(2);
        newList.insert(3);
        newList.insert(4);
        newList.deleteLast();
        newList.display();
    }
}