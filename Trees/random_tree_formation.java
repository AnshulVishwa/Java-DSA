import java.util.Random;
class Node{
    int data;
    Node left;
    Node right;
    Node( int data ){
        this.data = data;
        left = null;
        right = null;
    }
}
class Trees{
    Node root;
    Trees(){
        root = null;
    }
    void creation( int data ){
        Node newNode = new Node(data);

        if( root == null ){
            root = newNode;
        }
        else{
            Node temp = root;
            Node parent = null;
            int r = 0;
            while( temp != null ){
                Random rand = new Random();
                r = rand.nextInt(2);
                parent = temp;
                if( r == 0 && temp.left != null ) temp = temp.left;
                else temp = temp.right;
            }
            if( r == 0 ) parent.left = newNode;
            else parent.right = newNode;
        }
    }
}
public class random_tree_formation {
    public static void main(String[] args) {
        Trees newTree = new Trees();
        int arr[] = { 1 , 2 , 3 , 4 , 5 };
        for( int i = 0 ; i < arr.length ; i++ ) newTree.creation(arr[i]);
    }
}
