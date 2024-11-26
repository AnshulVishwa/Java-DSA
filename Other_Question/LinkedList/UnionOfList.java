// program to find union of two linked list
import java.util.HashSet;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }
}

public class UnionOfList {
    public static Node union(Node list1, Node list2) {
        HashSet<Integer> container = new HashSet<>();
        Node dummy = new Node(-1); // Dummy node to simplify logic
        Node tail = dummy;

        // Add all elements from list1 to the union list
        while (list1 != null) {
            if (container.add(list1.data)) {
                tail.next = new Node(list1.data);
                tail = tail.next;
            }
            list1 = list1.next;
        }

        // Add all elements from list2 to the union list
        while (list2 != null) {
            if (container.add(list2.data)) {
                tail.next = new Node(list2.data);
                tail = tail.next;
            }
            list2 = list2.next;
        }

        return dummy.next; // Return the next of dummy to skip the dummy node
    }

    public static void main(String[] args) {
        Node list1 = new Node(10);
        list1.next = new Node(20);;

        Node list2 = new Node(10);
        list2.next = new Node(30);;

        Node mergeList = union(list1, list2);

        // Print the merged union list
        System.out.println("null");
        while (mergeList != null) {
            System.out.print(mergeList.data + " -> ");
            mergeList = mergeList.next;
        }
        System.out.println("null");
    }
}
