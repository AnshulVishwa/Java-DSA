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
            while( temp != null ){
                parent = temp;
                if( temp.left != null ) temp = temp.left;
                else temp = temp.right;
            }
            Random rand = new Random();
            int r = rand.nextInt(2);
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
