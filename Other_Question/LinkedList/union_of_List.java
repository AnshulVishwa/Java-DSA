// Find the union of two lists

import java.util.HashSet;

class Node{
    int data;
    Node next;
    Node( int data ){
        this.data = data;
        next = null;
    }
}
public class union_of_List {
    public static Node union( Node temp , Node temp2 ) {
        HashSet <Integer> container = new HashSet<>();
        Node head = new Node(temp.data);
        temp = temp.next;

        Node prev = head;
        while( temp != null && temp2 != null ){
            if( container.add(temp.data) ){
                Node newNode = new Node(temp.data);
                prev.next = newNode;
                prev = newNode;
                temp = temp.next;
            }
            else if( container.add(temp2.data) ){
                Node newNode = new Node(temp2.data);
                prev.next = newNode;
                prev = newNode;
                temp2 = temp2.next;
            }
            else {
                temp = temp.next;
                temp2 = temp2.next;
            }

        }
        return head;
    }
    public static void main(String[] args) {
        Node list1 = new Node(10);
        list1.next = new Node(10);
        list1.next.next = new Node(10);
        Node list2 = new Node(10);
        list2.next = new Node(10);
        list2.next.next = new Node(10);

        Node mergeList = union(list1, list2);
        while( mergeList != null ) {
            System.out.print(mergeList.data + " -> ");
            mergeList = mergeList.next;
        }
        System.out.println("null");
    }
}
