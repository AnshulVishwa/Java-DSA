class ListNode {
    int val;
    ListNode next;

    ListNode(int data) {
        val = data;
        next = null;
    }
}

public class addTwo {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int sum = 0;
        int carry = 0;

        // Start by calculating the sum for the first node
        sum = l1.val + l2.val;
        ListNode head = new ListNode(sum % 10);
        carry = sum / 10;

        // Pointer to traverse the result list
        ListNode temp = head;
        l1 = l1.next;
        l2 = l2.next;

        // Traverse both lists until no more nodes and no carry
        while (l1 != null || l2 != null || carry != 0) {
            int val1 = (l1 != null) ? l1.val : 0; // If l1 is null, use 0
            int val2 = (l2 != null) ? l2.val : 0; // If l2 is null, use 0

            sum = val1 + val2 + carry;
            ListNode newNode = new ListNode(sum % 10); // Create a new node
            carry = sum / 10; // Update carry

            temp.next = newNode; // Link the new node
            temp = newNode; // Move to the new node

            // Move to the next nodes if available
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        return head; // Return the result list
    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        // Create first number: 342 (represented as 2 -> 4 -> 3)
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        // Create second number: 465 (represented as 5 -> 6 -> 4)
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        // Add the two numbers
        ListNode result = addTwoNumbers(l1, l2);

        // Print the result
        printList(result); // Output: 7 -> 0 -> 8 -> null
    }
}
