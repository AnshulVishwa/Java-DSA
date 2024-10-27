import java.util.Random;
// To create a tree we will make a node which contains the leftptr , data and the rightptr
// and will connect to every descendent nodes
class Node{
    Node left;
    int data;
    Node right;
    // constructor for initializing values and null to each pointer dynamically
    Node( int value ){
        left = null;
        data = value;
        right = null;
    }
}

// Main class which contains all the functions
class Tree {
    // We start with the root and point to to null, when the Tree is null || has no values
    Node root;
    Tree(){
        root = null;
    }
    // creation function
    void create( int data ){
        // call the node and name as newNode, now the copy of node is created
        Node newNode = new Node(data);

        // if the Tree is empty make the newNode as root
        if( root == null ){
            root = newNode;
        }
        // otherwise
        else{
            // take the root node in the temporary variable so that we can traverse where we want to add 
            // our node
            Node temp = root;
            // store the current value to the parent node
            Node parent = null;

            while ( temp != null ) {
                // Run this loop untill temp == null
                parent = temp;
                // store the value of temp to parent so that parent contains the node and temp moves ot null

                // if the data of newNode is less Move Left
                if( data < temp.data ){
                    System.out.println("Moving left");
                    temp = temp.left;
                }
                // if the data of newNode is more Move Right
                else{
                    System.out.println("Moving right");
                    temp = temp.right;
                }
            }
            // when the loop ends we have parent which is leaf node and where we waant to add newNode

            // Now check again if the data is less then node attach the newNode left
            if (data < parent.data) {
                parent.left = newNode;
            } 
            // Now check again if the data is more then node attach the newNode right
            else {
                parent.right = newNode;
            }
        }
    }

    // In-order traversal
    void in_order(Node temp) {
        if (temp != null) {
            in_order(temp.left);
            System.out.println(temp.data);
            in_order(temp.right);
        }
    }
}

public class inorder {
    public static void main(String[] args) {
        Tree newTree = new Tree();  
        int arr[] = {1, 4, 2, 6, 7, 9};
        for (int i = 0; i < arr.length; i++) {
            newTree.create(arr[i]); 
        }
        newTree.in_order(newTree.root);
    }
}
