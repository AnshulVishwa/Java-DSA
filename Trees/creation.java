class Node{
    Node next_left;
    int data;
    Node next_right;
    Node( int value ){
        next_left = null;
        data = value;
        next_right = null;
    }
}
class Tree{
    Node head;
    Tree(){
        head = null;
    }
    void create( int data ){
        Node newNode = new Node(data);
        newNode.next_left = null;
        newNode.next_right = null;

        if( head == null ){
            head = newNode;
        }
        else{
            Node temp = head;
            Node parent = null;

            while ( temp != null ) {
                parent = temp;
                if( data < temp.data ){
                    System.out.println("Moving left");
                    temp = temp.next_left;
                }
                else{
                    System.out.println("Moving right");
                    temp = temp.next_right;
                }
            }

            if (data < parent.data) {
                parent.next_left = newNode;
            } 
            else {
                parent.next_right = newNode;
            }
        }
    }
    int calculateHeight(Node node) {
        if (node == null) {
            return 0;
        }
        int leftHeight = calculateHeight(node.next_left);
        int rightHeight = calculateHeight(node.next_right);
        return Math.max(leftHeight, rightHeight) + 1;
    }

    // Function to print tree level by level
    void printLevelOrder() {
        int height = calculateHeight(head);
        for (int i = 1; i <= height; i++) {
            printCurrentLevel(head, i, height);
            System.out.println();
        }
    }

    // Print nodes at the current level with spacing based on the tree height
    void printCurrentLevel(Node node, int level, int height) {
        if (node == null) {
            printSpaces(height - level + 1);
            System.out.print("   ");
            return;
        }
        if (level == 1) {
            printSpaces(height);
            System.out.print(node.data + " ");
        } else if (level > 1) {
            printCurrentLevel(node.next_left, level - 1, height);
            printCurrentLevel(node.next_right, level - 1, height);
        }
    }

    // Print spaces based on the tree height to align nodes
    void printSpaces(int level) {
        for (int i = 0; i < level; i++) {
            System.out.print("   ");
        }
    }

}
public class creation {
    public static void main(String[] args) {
        Tree newTree = new Tree();
        newTree.create(10);
        newTree.create(15);
        newTree.create(3);
        newTree.create(2);
        newTree.create(4);
        newTree.printLevelOrder();
    }
}