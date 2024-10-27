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
            while ( temp != null ) {
                Random rand = new Random();
                int r = rand.nextInt(2);
                parent = temp;
                if( r == 0 && temp.left != null ) temp = temp.left;
                else temp = temp.right;
            }
            if( r == 0 ) parent.left = newNode;
            else parent.right = newNode;
        }
    }
    void post_order( Node temp ){
        if( temp != null ){
            post_order(temp.left);
            post_order(temp.right);
            System.out.println(temp.data);
        }
    }
}
public class postorder {
    public static void main(String[] args) {
        Trees newTree = new Trees();
        int arr[] = {1 , 4 , 2 , 6 , 7 , 9 };
        for( int i = 0 ; i < arr.length ; i++ ) newTree.creation(arr[i]);
        newTree.post_order(newTree.root);
    }
}
