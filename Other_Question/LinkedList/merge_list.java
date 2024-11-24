// Program to merge two sorted listsa999o0p[=]
class Node{
    int data;
    Node next;
    Node( int data ){
        this.data = data;
        next = null;
    }
}
public class merge_list {
    public static Node merge( Node temp , Node temp2 ) {
        Node head;
        if( ( temp.data < temp2.data ) ) {
            head = new Node(temp.data);
            temp = temp.next;
        } else{
            head = new Node(temp2.data);
            temp2 = temp2.next;
        }
        Node prev = head;
        while( temp != null && temp2.next != null ){
            Node newNode;
            if( temp.data < temp2.data ){
                newNode = new Node(temp.data);
                temp = temp.next;
            }else{
                newNode = new Node(temp2.data);
                temp2 = temp2.next;
            }
            prev.next = newNode;
            prev = newNode;
        }
        while( temp != null ) {
            Node newNode = new Node(temp.data);
            prev.next = newNode;
            prev = newNode;
            temp = temp.next;
        }
        while( temp2 != null ) {
            Node newNode = new Node(temp2.data);
            prev.next = newNode;
            prev = newNode;
            temp2 = temp2.next;
        }
        return head;
    }
    public static void main(String[] args) {
        Node list1 = new Node(10);
        list1.next = new Node(30);
        list1.next.next = new Node(50);
        Node list2 = new Node(20);
        list2.next = new Node(40);
        list2.next.next = new Node(60);
        
        Node mergeList = merge(list1, list2);
        while( mergeList != null ) {
            System.out.print(mergeList.data + " -> ");
            mergeList = mergeList.next;
        }
        System.out.println("null");
    }
}